package 시험;
import java.net.*;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
public class Client extends Thread implements ActionListener{

	public static void main(String[] args) {
		new Client();
	}
	JFrame jframe;
	JTextArea jta;
	JTextField jtf, jtf2; // 큰화면에 입력공간, 다이얼로그창의 입력공간
	JDialog jDialog;
	JLabel jLabel;
	Socket client;
	//효율적인문자열의 처리를 위해 server와 client 모두가 BufferedReader
	//BufferedWriter를 사용할 수 있음
	DataInputStream br;
	DataOutputStream bw;
	String host;//접속할 서버의 ip주소
	boolean stop = false;
	
	public Client() {
		launchFrame();
	}
	// 텍스트필드 이벤트처리 (dialog, field)
	// 메세지를 서버로 전송
	@Override
	public void actionPerformed(ActionEvent e) {
		if(jtf==e.getSource()) { // 다이얼로그가 아닌 텍스트 필드
			String msg = jtf.getText();
			jtf.setText("");
			jta.append(msg+"\n");
			try { // exit 치면 자원해제 하고 강제종료
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
			}catch(IOException e1) {
				e1.printStackTrace();
			}
		}else if(jtf2 == e.getSource()) {
			//텍스트필드가 존재하는 곳이 다이얼로그
			//서버의 IP주소를 저장할 변수
			host = jtf2.getText().trim();
			if(host == "") { //IP주소를 적지 않으면 자기의 IP주소가 들어감
				host="localhost";
		}
			
	}
		jDialog.dispose();
}
	//GUI 세팅
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
	private void service() {
		try {
			//서버프로그램과 통신을 할 클라이언트 소켓, 서버의 ip주소와 포트번호
			client = new Socket(host,8777);
			bw = new DataOutputStream(client.getOutputStream());
			br = new DataInputStream(client.getInputStream());
		}catch(Exception e) {
			e.printStackTrace();
		}
		jta.append("접속완료\n");
		this.start();
	}
	@Override
	public void run() {
		System.out.println("Thread Started...");
		try {
			while(!stop) {
				String msg = br.readUTF();
				jta.append(msg+"\n");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	}
