package awt;
import java.awt.*;
import java.awt.event.*;
public class FrameTest09 {

	public static void main(String[] args) {
		new FrameEvent12();
	}

}
class FrameEvent12 extends Frame{
	Canvas cv;
	public FrameEvent12() {
		this.setLayout(new FlowLayout());
		cv = new Canvas();
		cv.setBackground(Color.BLUE);
		cv.setSize(100, 50);
		this.add(cv);
		this.setSize(400,150);
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
}
