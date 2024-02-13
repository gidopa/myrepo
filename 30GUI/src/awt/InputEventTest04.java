package awt;

import java.awt.*;
import java.awt.event.*;
/*
	TextEvent 
	- 텍스트 컴포넌트에서 텍스트 내용이 변경될떄 발생하는 이벤트
	- TextEvent처리를 위해 TextListener인터페이스 이용 
*/
public class InputEventTest04 {

	public static void main(String[] args) {
		new FrameEvent17();
		
	}

}
class FrameEvent17 extends Frame implements TextListener{
	Label info;
	TextField txt;
	
	public FrameEvent17() {
		info = new Label();
		this.add(info,BorderLayout.NORTH);
		txt = new TextField();
		this.add(txt,BorderLayout.SOUTH);
		txt.addTextListener(this);
		
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
	public void textValueChanged(TextEvent e) {
		info.setText(txt.getText());
	}
	
}