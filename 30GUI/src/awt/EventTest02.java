package awt;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventTest02 {

	public static void main(String[] args) {
		new FrameEvent2();
	}

}
class FrameEvent2 extends Frame{
	//이벤트소스(컴포넌트)
	Button redBtn, blueBtn;
	public FrameEvent2() {
		this.setLayout(new FlowLayout());
		redBtn = new Button("Red");
		blueBtn = new Button("Blue");
		
		this.add(redBtn);
		this.add(blueBtn);
		
		ButtonListener2 buttonListener = new ButtonListener2(this);
		//이벤트를 받아들인 컴포넌트 객체에 리스너객체 등록
		redBtn.addActionListener(buttonListener);
		blueBtn.addActionListener(buttonListener);
		
		setSize(300,300);
		setVisible(true);
		this.addWindowListener(new WindowListener() {
			// 창이 처음 열릴때 필요한 초기화 작업을 수행하는데 사용
			@Override
			public void windowOpened(WindowEvent e) {
			}
			// 창이 아이콘화 (최소화)될떄 호출
			@Override
			public void windowIconified(WindowEvent e) {
			}
			// 최소화된 창이 다시 활성화 될때 호출
			@Override
			public void windowDeiconified(WindowEvent e) {
			}
			// 다른창이 활성화 되거나 사용자가 다른 작업을 수행하기 시작할 때 
			@Override
			public void windowDeactivated(WindowEvent e) {
			}
			//창을 닫을때
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
			//창이 완전히 닫힌후 호출
			@Override
			public void windowClosed(WindowEvent e) {
			}
			// 창이 활성 상태로 변경될때 호출
			@Override
			public void windowActivated(WindowEvent e) {
			}
		});
	}
}
class ButtonListener2 implements ActionListener{
	Frame frm = null;
	public ButtonListener2() {
		
	}
public ButtonListener2(Frame value) {
		frm = value;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Red")) {
			frm.setBackground(Color.red);
		}else {
			frm.setBackground(Color.blue);
		}
	}
	
}