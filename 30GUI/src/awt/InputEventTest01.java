/*
	입력 관련 이벤트 처리
	- 입력은 크게 키보드입력과 마우스 입력으로 나뉩니다
	  이벤트처리를 위해 키보드는 KeyEvent 클래스, 마우스는 MouseEvent 클래스 제공
	  InputEvent의 상속을 받음
*/
package awt;

import java.awt.*;
import java.awt.event.*;
public class InputEventTest01 {

	public static void main(String[] args) {
		new FrameEvent14();
		
	}

}
class FrameEvent14 extends Frame implements KeyListener{
	TextField txt;
	TextArea ta;
	public FrameEvent14() {
		txt = new TextField();
		this.add(txt,BorderLayout.NORTH);
		txt.addKeyListener(this);
		ta = new TextArea();
		this.add(ta,BorderLayout.CENTER);
		this.setSize(200,200);
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			dispose();
			System.exit(0);
		}
		});
	}
	@Override
	public void keyTyped(KeyEvent e) {
		ta.append(e.getKeyChar() +"가 입력\n");
	}
	public void keyPressed(KeyEvent e) {
		ta.append(e.getKeyChar()+"가 눌림\n");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		ta.append(e.getKeyChar()+"를 뗌\n");
	}
	
	
}
