/*
	MouseListener
	- 마우스를 움직이고 클릭할때마다 이벤트 처리
*/
package awt;

import java.awt.*;
import java.awt.event.*;

public class InputEventTest02 {

	public static void main(String[] args) {
		new FrameEvent15();
	}

}
class FrameEvent15 extends Frame implements MouseListener{
	public FrameEvent15() {
		this.addMouseListener(this);
		this.setSize(300, 300);
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
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 클릭");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("마우스 누름");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("마우스 버튼 놓음");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스 포인터가 창 안으로 들어옴");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("마우스 포인터가 창 밖으로 나감");
	}
	
	
}