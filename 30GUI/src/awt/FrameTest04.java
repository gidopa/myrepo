package awt;
import java.awt.*;
import java.awt.event.*;
public class FrameTest04 {

	public static void main(String[] args) {
		new Border();
	}

}
class Border extends Frame{
	public Border() {
		this.setLayout(new BorderLayout());
		this.add(new Button("Button1"),"North");
		this.add(new Button("Button2"),"South");
		this.add(new Button("Button3"),"East");
		this.add(new Button("Button4"),"West");
		this.add(new Button("Button5"),"Center");
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
}
