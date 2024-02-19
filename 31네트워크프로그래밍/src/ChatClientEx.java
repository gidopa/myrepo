/*
	- 채팅 서버프로그램에 접속을 요청하는 채팅 클라이언트 프로그램 작성
	- 채팅 클라이언트를 구성하는 클래스 ChatClientEx와 MsgThread 
	클래스 						역할
	ChatClientEx				클라이언트 소켓 생성, 메세지 송수신을 위해 클라이언트로부터 입출력 스트림 얻음
								입력바은 메세지를 송신하면서 서버로부터 메세지를 수신하기 위한 스레드 생성
								
	MsgThread					접속을 계속 유지하면서 데이터 송수신을 위한 클래스
	
	ChatClientEx에서 반복문을 돌며 키보드에서 입력한 메세지를 송신하는 동작은 메인스레드가 담당하고 다른 클라이언트로부터 메세지를 수신 받기 위해
	따로 스레드 객체를 생성해야 하므로 두개의 클래스가 필요함
*/
//사용자의 아이디를 서버에 넘겨주고, 키보드의 입력과 동시에 데이터 수신을 위한 스레드 객채 생성

import java.net.*;
import java.io.*;

public class ChatClientEx {

	public static void main(String[] args) {
		if(args.length<2) {
			System.out.println("사용법 : java ChatClient 사용자id 서버ip");
			System.exit(0);
		}
		new ChatClientEx(args[0], args[1]);
	}
	
	String ip;
	static final int port = 6000;
	Socket client = null;	// 클라이언트 소켓
	BufferedReader br = null;
	ObjectOutputStream oos;
	ObjectInputStream ois;
	String sendData; // 서버에 보낼 데이터
	String receiveData; // 서버로 부터 받은 데이터를 저장할 변수
	String userId;
	MsgThread mt; // 서버가 보낸 데이터를 받기 위한 작업을 하는 스레드 
	boolean endFlag = false;
	
	public ChatClientEx(String id, String ip) {
		this.userId = id;
		this.ip = ip;
		try {
			System.out.println("**** 클라이언트 *****");
			client = new Socket(this.ip,port);
			//중요 클라이언트 소켓이 생성되는 순간 서버의 accept()가 자동으로 호출
			//입력받은 메세지를 읽어들일 스트림
			br = new BufferedReader(new InputStreamReader(System.in));
			//서버로부터 데이터 수신을 위한 스트림 
			ois = new ObjectInputStream(client.getInputStream());
			oos = new ObjectOutputStream(client.getOutputStream());
			oos.writeObject(userId);
			oos.flush();
			
			mt = new MsgThread(client, ois);
			Thread t = new Thread(mt);
			t.start();
			while(true) {
				
				//클라이언트가 입력한 데이터를 서버로 보내기 위해 키보드로 입력한 데이터를 저장
				sendData = br.readLine();
				//서버 프로그램으로 전송해서 보냄(출력스트림)
				oos.writeObject(sendData);
				oos.flush();
				if(sendData.equals("/quit")) {
					endFlag = true;
					break;
				}
			}
		}catch(Exception e) {
			if(!endFlag) {
				e.printStackTrace();
			}
		}finally {
			try {
				ois.close();
				oos.close();
				client.close();
				System.exit(0);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
/*
	- 채팅 클라이언트 프로그램은 키보드로부터 입력 받은 메세지를 소켓통로를 통해서 출력 스트림을 통해 서버로 송신
	키보드로 사용자가 메세지를 입력하는 도중에라도 서버에서 다른 클라이언트에게 전송된 메세지를 보내면 이를 수신 해야함
	
	그러므로 스레드를 사용해야 함. 아래의 스레드는 서버로부터 전달받은 메세지를 클라이언트로 부터 얻어낸 입력스트림으로 받아 클라이언트의 모니터에 출력하는 스레드
	
*/
class MsgThread implements Runnable{
	Socket client;
	ObjectInputStream ois;
	String receiveData;
	
	public MsgThread(Socket client, ObjectInputStream ois) {
		this.client = client;
		this.ois = ois;
	}

	@Override
	public void run() {
		try {
			while( (receiveData = (String)ois.readObject()) != null) {
				System.out.println(receiveData);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				ois.close();
				client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
