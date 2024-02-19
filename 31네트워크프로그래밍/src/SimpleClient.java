/*
	
*/
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import javax.swing.*;
public class SimpleClient extends Thread implements ActionListener {

	public static void main(String[] args) {
		new SimpleClient();
	}
	
	JFrame jframe;
	JTextArea jta;
	JTextField jtf, jtf2; // 큰화면에 입력공간, 다이얼로그창의 입력공간
	JDialog jDialog;
	JLabel jLabel;
	Socket client;
	DataInputStream br;
	DataOutputStream bw;
	String host;//접속할 서버의 ip주소
	boolean stop = false;
	
	
	public SimpleClient() {
		launchFrame();
	}
	//JTextField의 2개 이벤트 처리 dialog와 field
	//입력한 메세지를 스트림을 통해 서버프로그램으로 전송
	@Override
	public void actionPerformed(ActionEvent e) {
		if(jtf == e.getSource()) {
			String msg = jtf.getText();
			jtf.setText("");
			jta.append(msg + "\n");
			try {
				if(msg.equals("exit")) {
					jta.append("bye");
					stop = true;
					bw.close();
					client.close();
					System.exit(0);
				}else {
					bw.writeUTF(msg);
					bw.flush();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}else if(jtf2 == e.getSource()) {
			//접속할 서버의 IP주소를 입력받았기 때문에 입력받은 ip주소를 host에 저장
			host = jtf2.getText().trim();
			if(host== "") { // ip주소를 입력안하고 그냥 엔터키를 누르면 서버의 IP주소를 host에 저장
				host="localhost";
			}
		}
		jDialog.dispose();
	}
	
	private void launchFrame() {
		jframe = new JFrame("일대일 채팅 실습 client");
		jta = new JTextArea();
		jtf = new JTextField();
		jframe.setBackground(Color.LIGHT_GRAY);
		jframe.add(jta,BorderLayout.CENTER);
		jframe.add(jtf,BorderLayout.SOUTH);
		jta.setEditable(false);
		jtf.addActionListener(this);
		jframe.setSize(600,400);
		jframe.setVisible(true);
		jtf.requestFocus();
		jDialog = new JDialog(jframe,"채팅서버Ip주소입력",true);
		jLabel = new JLabel("접속할 채팅서버의 IP주소를 입력하세요");
		jtf2 = new JTextField(15); 
		jDialog.add(jLabel,BorderLayout.NORTH);
		jDialog.add(jtf2,BorderLayout.CENTER);
		jtf2.addActionListener(this);
		jDialog.pack();//setSize(?,?) 안해도 됨
		jDialog.setVisible(true);
		service(); 
		jtf2.requestFocus();
	}
	// 클라이언트 소켓 생성, 접속한 프로그램으로부터 전달받는 메세지를 읽을 스트림 생성
	// 서버 프로그램으로 메세지를전달할 스트림 생성, run()메소드를 호출
	private void service() {
		try {
			//서버프로그램과 통신을 위한 클라이언트 소켓 생성
			//host의 ip주소와 포트번호를 전달
			client = new Socket(host,8777);
			try {
				bw = new DataOutputStream(client.getOutputStream());
				br = new DataInputStream(client.getInputStream());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//프레임창 내부의 textarea에 접속완료 메세지 보내 출력하기
			jta.append("접속완료\n");
			//stop변수의 값이 true가 되면 서버에서 전송된 데이터를 읽어들이는 작업을 하는 스레드 동작
			this.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		System.out.println("Thread Started..");
		try {
			while(!stop) {
				String message = br.readUTF();
				jta.append(message+"\n");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	
}
