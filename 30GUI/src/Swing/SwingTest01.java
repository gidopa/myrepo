package Swing;
/*
	스윙과 awt의 차이점
	- awt는 os가 가지는 각 컴포넌트를 이용하는것, 플랫폼에 종속적인 GUI, OS마다 약간씩 다르게 나옴
	  스윙은 os가 가지는 GUI를 사용하지 않고 JVM이 직접 스윙패키지를 사용해서 구현함, os가 달라도 같은 화면 출력
	  스윙은 awt보다 트리나 테이블이나 탭과 같은 다양한 GUI 제공
	  
	JFrame
	getContentPane() 프레임창에 있는 contentPane객체를 얻어옴
	setDefaultCloseOperation(int opeartion) : 프레임창 닫기 버튼을 눌렀을때 창닫기 이벤트 처리
	매개변수 int operation의 상수 종류 
	DISPOSE_ON_CLOSE : window창 종료할때 모든 자원 반납
	DO_NOTHING_ON_CLOSE : window창 종료해도 아무 것도 안함
	EXIT_ON_CLOSE : window창 종료할때 강제 종료
	HIDE_ON_CLOSE : 숨긴다
*/
import javax.swing.*;
public class SwingTest01 {
	public static void main(String[] args) {
		new JFrameTest();
	}
}
class JFrameTest extends JFrame{
	public JFrameTest() {
		super("스윙 JFrame 테스트");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		this.setVisible(true);
		
	}
}

