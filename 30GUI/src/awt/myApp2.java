//사용자 정의 프레임
package awt;

import java.awt.*; //화면 디자인에 필요한 클래스나 인터페이스 제공 
import java.awt.event.*; // 이벤트 처리 클래스나 인터페이스 제공
import javax.swing.*; //화면 디자인용
import javax.swing.event.*;
public class myApp2 {

	public static void main(String[] args) {
		new MyFrame();
	}

}
class MyFrame extends JFrame{
	public MyFrame() {
		this.setTitle("프레임창 제목");
		this.setSize(300,300);
		this.setVisible(true);
	}
}
