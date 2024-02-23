package 시험;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.*;
public class Server extends Thread implements ActionListener{

	public static void main(String[] args) {
		new Server();
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
	boolean stop ; // 플래그 변수
	
	public Server() {
		try {
			launchFrame(); //GUI 생성
			service();	// 서버소켓생성, 메세지 주고 받는 메소드
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//텍스트필드에 입력한 내용을 텍스트Area에 띄워줌
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = jtf.getText();// 입력창에 입력한 메세지
		jta.append(msg + "\n"); // 입력 메세지 출력
		jtf.setText("");// 입력하고나면 빈칸으로 
		try {
			if(msg.equals("exit")) {
				jta.append("bye"); // exit 입력하면 bye라고 출력하고
				stop = true;
				dos.close();
				dis.close();
				client.close();
				System.exit(0);
			}else { // exit가 아니면 메세지 띄워줌
				dos.writeUTF("서버 프로그램이 보낸 메세지 : "+msg);
			}
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
	//stop이 true일때 클라이언트가 보낸 메세지를 읽어 들임
	@Override
	public void run() {
		while(!stop) {
			try {
				jta.append(dis.readUTF()+"\n");
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		// 클라이언트 메세지를 받고 스트림 자원해제
		try {
			dis.close();
			client.close();
		}catch(EOFException e) {
			jta.append("클라이언트 연결 끊김");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//서버 소켓 생성 및 대기, 클라이언트 접속 요청시 클라이언트용 소켓 생성
	//소켓을 통해 입출력 스트림 생성, 메세지를 주고 받는 스레드 생성
	public void service() throws Exception{
		jta.append("서비스 준비중\n");
		//사용할 포트번호로 서버소켓 생성
		server = new ServerSocket(8724);
		jta.setText("클라이언트 접속 대기중");
		//서버소켓이 클라이언트를 기다리다 사용자가 접속 요청을 하면
		//클라이언트의 정보를 가지는 클라이언트용 소켓을 리턴해준다
		client = server.accept();
		//client의 IP 주소 
		jta.append("클라이언트 접속 : "+client.getInetAddress()+"\n");
		// 서버에 접속한 클라이언트에 메세지를 보낼 스트림
		dos = new DataOutputStream(client.getOutputStream());
		dis = new DataInputStream(client.getInputStream());
		this.start();
		dos.writeUTF("채팅 서버 접속");
	}
	//GUI 생성
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


