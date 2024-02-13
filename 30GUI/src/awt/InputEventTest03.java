/*
	마우스 포인터를 프레임창 안에서 움직이면 포인터의 좌표를 출력
	마우스를 드래그하면 드래그 중이라는 정보를 출력
	MouseMotionListener인터페이스의 추상메소드를 통해 처리
*/
package awt;

import java.awt.*;
import java.awt.event.*;
public class InputEventTest03 {

	public static void main(String[] args) {
		new FrameEvent16();
	}

}
class FrameEvent16 extends Frame implements MouseMotionListener{
	Label info;
	public FrameEvent16() {
		info = new Label();
		this.add(info, BorderLayout.NORTH);
		this.addMouseMotionListener(this);
		this.setSize(300,300);
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
	public void mouseDragged(MouseEvent e) {
		info.setText("마우스드래그");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		info.setText("x = " + e.getX() + ", y = " + e.getY());
	}
	
}
