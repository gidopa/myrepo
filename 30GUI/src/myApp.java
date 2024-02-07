// 프레임 창 만들기 2가지 방법
// 방법 1: 메인메소드 안에서 JFrame클래스 객체 생성
// 방법 2: JFrame클래스를 상속받아 사용자 정의 프레임창 생성
import java.awt.*; //화면 디자인에 필요한 클래스나 인터페이스 제공 
import java.awt.event.*; // 이벤트 처리 클래스나 인터페이스 제공
import javax.swing.*; //화면 디자인용
import javax.swing.event.*;
public class myApp {

	public static void main(String[] args) {
		JFrame f = new JFrame("첫번째프레임");
		//프레임창 제목 변경
		f.setTitle("바꾼프레임제목");
		/*
			AWT -> Frame 클래스
			SWING -> JFrame 클래스
			
			생성된 JFrame객체 내부는 3개의 공간으로 구성
			1.Menu Bar
			2.Frame
			3.ContentPane -> 화면에 출력되는 모든 컴포넌트들이 부착되는 공간
			Swing에서는 ContentPane에만 컴포넌트를 부착할 수 있다
			ContentePane은 JFrame 객체가 처음생성될 때 자동으로 JFrame 내부에 생성되어 부착되어 있는 상태이다
		*/
		Container contentPane = f.getContentPane();
		JButton b1 = new JButton("Click");
		contentPane.add(b1);
		JButton b2 = new JButton("Click2");
		contentPane.add(b2);
		//프레임창 사이즈 설정, 보이게 설정
		f.setSize(300, 300); //너비, 높이 설정
		f.setVisible(true);
		
	}

}
