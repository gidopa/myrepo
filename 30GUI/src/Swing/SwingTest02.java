package Swing;
/*
 	JButton 버튼 클래스
 	- 스윙 버튼은 JButton이라는 클래스로 생성하며, 생성자에 Icon 객체를 지정하면 이미지 버튼이 만들어 짐
 	- 생성자 종류
 		JButton()
 		JButton(Strint text)
 		JButton(Icon image)
 		JButton(Strint txt,Icon img)
 		
*/
import java.awt.*;
import javax.swing.*;
public class SwingTest02 {

	public static void main(String[] args) {
		new JFrameTest1();
	}

}
class JFrameTest1 extends JFrame{
	JButton btn01, btn02, btn03 ;
	public JFrameTest1() {
		this.setLayout(new FlowLayout());
		btn01 = new JButton("One");
		this.add(btn01);
		btn02 = new JButton("Two");
		this.add(btn02);
		btn03 = new JButton("Three");
		this.add(btn03);
		this.setSize(300,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
