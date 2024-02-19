
/*
	채팅 서버 구현하기
	- 채팅 서버를 구성하는 클래스는 ChatServerEx와 ChatServerThread 2개
	1. 챗서버EX에서 클라이언트 접속시 이를 수락하는 동작은 메인스레드가 담당하고
	   접속을 유지하며 데이터 송수신을 위해 따로 스레드 객체를 생성해야 하므로 2개의 클래스 필요
	클래스								역할
	ChatServerEx						서버 소켓 생성, 접속을 유지하며 데이터 송수신을 위해 스레드 객체 생성
										스레드 객체 생성시 전달인자로 컬렉션 HashMap을 전달해 줌으로써 멀티 캐스팅 가능하도록 함ㅁ
										
	ChatServerThread					접속을 유지하며 데이터 송수신을 위한 클래스
										ChatServerEx에 있는 HashMap을 받아 멀티 캐스팅
*/
import java.net.*;
import java.io.*;
import java.util.*;

public class ChatServerEx {

	public static void main(String[] args) throws Exception {
		new ChatServerEx();
	}

	ServerSocket server; // 서버 소켓 통로 객체
	final static int port = 6000;
	Socket child; // 클라이언트와 통신을 위한 소켓
	// 스레드 간의 정보를 공유할 HashMap
	HashMap<String, ObjectOutputStream> map; // key는 아이디이고, value는 출력스트림

	public ChatServerEx() throws Exception { // 서버소켓생성 실패 예외처리
		try {
			server = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		} // 포트번호 설정하고 서버 소켓 생성
		System.out.println("******** 채팅 서버 *********");
		// 스레드간의 정보를 공유할 해시맵 생성
		map = new HashMap<String, ObjectOutputStream>();
		while (true) {
			try {
				child = server.accept(); // 클라이언트 접속 요청이 들어오면 요청을 받아들일 클라이언트와 송수신할 전용 Socket을 반환받음
				// 데이터 송수신을 위한 스레드 객체 생성
				ChatServerThread childThread = new ChatServerThread(child, map);
				Thread t = new Thread(childThread);
				t.start();
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
		}
	}
}

/*
 * ChatServerThread 클래스 메소드 역할 생성자 1.클라이언트로부터 데이터를 송수신을 위한 입출력 스트림을 얻음 2.아이디를
 * 얻어와 아이디와 출력 스트림을 HashMap에 등록
 * 
 * run메소드 1. 클라이언트의 메세지를 수신해 모든 클라이언트에게 브로드캐스팅함 2. /to가 입력되면 귓속말로 처리(sendMsg) 3.
 * /quit가 입력되면 종료
 * 
 * broadcast() 클라이언트가 입력한 메세지를 뿌림
 * 
 * sendMsg() 특정 클라이언트에게만 메세지 보냄
 * 
 * 서버가 다른 클라이언트에게 메세지를 송수신하기 위해 해시맵을 가지면서 새로운 클라이언트가 접속하면 사용자의 id와 출력스트림 저장
 * 클라이언트가 접속을 해제하면 해시맵에서 해당 클라이언트 삭제
 */
class ChatServerThread implements Runnable {
	Socket child;// 클라이언트와 통신하기 위한 소켓
	ObjectInputStream ois; // 클라이언트로부터 메세지 수신을 위한 스트림
	ObjectOutputStream oos; // 받은 메세지 뿌릴 스트림
	String userId;
	HashMap<String, ObjectOutputStream> map; // 스레드간의 정보를 공유할 HashMap

	// 입출력 스트림을 얻음, 아이디와 출력스트림을 해시맵에 등록
	// 생성자로 접속요청한 소켓객체와 해시맵이 전달
	public ChatServerThread(Socket socket, HashMap<String, ObjectOutputStream> map) throws Exception {
		child = socket;
		this.map = map;
		// 클라이언트로부터 ip주소를 얻어 출력
		System.out.println(child.getInetAddress() + "가 연결 요청함.");
		// 클라이언트로부터 데이터를 수신 받기 위해 입력스트림 얻어 변수에 저장
		ois = new ObjectInputStream(child.getInputStream());
		// 클라이언트로 데이터 송신을 위한 출력스트림 얻어 ObjectOutputStream으로 변환
		oos = new ObjectOutputStream(child.getOutputStream());
		userId = (String) ois.readObject();
		broadcast(userId + " 접속");
		// 스레드가 공유하는 해시맵 동기화
		synchronized (map) {
			map.put(userId, oos);
		}
	}

	@Override
	public void run() {
		String msg;
		try {
			while (true) {
				// 클라이언트가 보낸 메시지 수신
				msg = (String) ois.readObject();
				if (msg.equals("/quit")) {
					break;
				} else if (msg.indexOf("/to") > -1) {
					sendMsg(msg);
				} else {
					broadcast(msg);
				}
			}
		} catch (Exception e) {
			System.out.println("클라이언트가 강제 종료");
		} finally {
			// 클라이언트가 종료했을때 여러 스레드가 공유하는 해시맵을 동기화
			synchronized (map) {
				map.remove(userId);
				try {
				broadcast(userId + "가 나감");
				System.out.println((userId + "가 나감"));
				
					if (child != null) {
						child.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

	public void broadcast(String msg) throws Exception {
		// 여러 스레드가 공유하는 해시맵 동기화
		synchronized (map) {
			// 해시맵에 등록된 출력 스트림을 얻어와 수신받은 메세지를 다시 송신
			for(ObjectOutputStream oos : map.values()) {
				oos.writeObject(msg);
				oos.flush();
			}
		}
	}
	// /to 아이디 내용 형식
	public void sendMsg(String msg) throws IOException {
		//귓속말로 넘어온 메시지 중 id부분을 찾기 위해서
		int begin = msg.indexOf(" ") + 1; // 처음 공북 문자 다음부터
		int end = msg.indexOf("",begin);  // 두번째 공백 문자 사이의 문자가 아아디
		if(end != -1) {
			// 보내진 메시지 중 아이디 부분만 얻어냄
			String id = msg.substring(begin, end);
			String data = msg.substring(end+1);
			ObjectOutputStream oos = map.get(id);
			if(oos != null) {
				oos.writeObject(id + "가 귓속말보냄 :" + data);
				oos.flush();
			}
		}
	}

}
