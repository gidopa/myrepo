/*
 	main
	역할1. 프레임창 만들기
	역할2. 서버소켓 만들어 클라이언트 프로그램 요청 대기
	
	SimpleServer 스레드
	역할. 서버프로그램에서 클라이언트 채팅프로그램으로 메세지 송수신 역할	
		
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.*;
public class SimpleServer extends Thread  implements ActionListener{

	public static void main(String[] args) {
		new SimpleServer();
	}

	JFrame jframe;
	JTextArea jta;
	JTextField jtf;
	ServerSocket server;
	//Client와 메세지를 주고 받을 클라이언트용 소켓
	Socket client;
	//클라이언트 측으로 메세지를 보내지만 OutputStream은 메세제를 바이트 단위로 보내기 때문에 편리하게 여러 바이트를 기본자료형 크기로 묶어서
	// 메세지를 보내는 DataOutputStream
	DataOutputStream dos;
	DataInputStream dis;
	//클라이언트에서 전송된 메세지를 읽기 위한 조건 변수
	boolean stop = false;
	
	public SimpleServer() {
		try {
			launchFrame(); // 프레임창 
			service();	   // 서버 소켓 생성 및 대기 
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//이벤트 처리
	//JTextField에 입력한 메세지를 JTextArea 영역에 보여주기 
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = jtf.getText();
		//jta영역에 보내어 출력
		jta.append(msg + "\n");
		jtf.setText("");
		try {
			if (msg.equals("exit")) {
				jta.append("bye");
				stop = true;
				//접속한 클라이언트 채팅 프로그램이 서버프로그램 종료 시 강제종료 되도록 자원해제
				dos.close();
				dis.close();
				client.close();
				System.exit(0);
			} else {
				dos.writeUTF("서버 프로그램이 보낸 메세지 : " + msg);
			} 
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	//stop이 true면 클라이언트가 보낸 메세지를 읽어 들이자
	@Override
	public void run() {
		while(!stop) {
			try {
				jta.append(dis.readUTF()+"\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//접속한 클라이언트로부터 메세지를 전달받아 읽어들일 입력 스트림 통로 닫기
		try {
			dis.close();
			client.close();
		} catch (EOFException e) {
			jta.append("클라이언트로부터 연결이 끊어짐");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void service() throws Exception{
		//서버 소켓 생성 및 대기, 클라이언트가 접속 요청 시 클라이언트용 소켓 생성, 소켓을 통해 입출력 스트림 생성
		//메세지를 주고 받는 스레드 생성
		jta.append("서비스 준비중\n");
		// 5433포트번호로 서버소켓 생성
		server = new ServerSocket(8724);
		jta.setText("클라이언트 접속 대기중");
		//serverSocket의 accept메소드로 클라이언트의 접속 요청을 기다림
		//ServerSocket으로부터 접속한 사용자의 정보를 가지는 클라이언트용 socket통로 객체를 리턴받음
		client = server.accept();
		jta.append("클라이언트가 접속 : " + client.getInetAddress()+"\n");
		// 서버 채팅프로그램에 접속한 클라이언트에 메세지를 보내기 위한 출력 스트림
		dos = new DataOutputStream(client.getOutputStream());
		dis = new DataInputStream(client.getInputStream());
		this.start();
		dos.writeUTF("채팅 서버에 접속");
		
	}
	public void launchFrame() {
		jframe = new JFrame("일대일 채팅 실습");
		jta = new JTextArea();
		jtf = new JTextField();
		jframe.setBackground(Color.LIGHT_GRAY);
		//TextArea 데이터 입력 불가능하게 만듦
		jta.setEditable(false);
		jframe.add(jta, BorderLayout.CENTER);
		jframe.add(jtf, BorderLayout.SOUTH);
		jtf.addActionListener(this);
		jframe.setSize(600,700);
		jframe.setVisible(true);
		jtf.requestFocus();
	}
	
}
