/*
	이벤트 처리를 위한 용어
	이벤트 : 행위 동작
	이벤트 소스 : 이벤트를 발생시킨 컴포넌트
	이벤트처리리스너 : 이벤트소스에서 이벤트가 발생하면 처리할 클래스
	
	-----------------------------------------------------
	이벤트소스			발생이벤트				발생원인				리스너
	JFrame			WindowEvent			- [] x 를 눌렀을때 	WindowListener
	JDialog			WindowEvent 			"				WindowListener
	JTextField  	ActionEvent			Enter키 눌렀을때		ActionListener
	JButton			ActionEvent			클릭했을떄				ActionListener
	JRadioButton 	ActionEvent			클릭했을때				ActionListener
	JCheckBox		ActionEvent			클릭했을때				ActionListener
	JMenuItem		ActionEvent			선택했을때				ActionListener
	JComboBox		ActionEvent			다른항목을 선택했을때	ActionListener
	JList			ListSelectionEVent	다른항목을 선택했을때	ListSelectionListener
	
*/
package awt;

import java.awt.*;
import java.awt.event.*;
public class EventTest01 {

	public static void main(String[] args) {
		new FrameEvent1();
	}

}
class FrameEvent1 extends Frame{
	//이벤트소스(컴포넌트)
	Button redBtn, blueBtn;
	public FrameEvent1() {
		this.setLayout(new FlowLayout());
		redBtn = new Button("Red");
		blueBtn = new Button("Blue");
		
		this.add(redBtn);
		this.add(blueBtn);
		
		ButtonListener buttonListener = new ButtonListener();
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
class ButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
	}
	
}
