/*
	메뉴와 액션 이벤트
	메뉴 컴포넌트
	- 사용자가 프로그램의 기능을 선택할 수 있도록 여러개의 아이템을 단계적으로 나타내는 컴포넌트
	- 메뉴의 구성요소 메뉴바, 메뉴, 메뉴 아이템
*/
package awt;

import java.awt.*;
import java.awt.event.*;
public class FrameTest10 {

	public static void main(String[] args) {
		new FrameEvent13();
	}

}
class FrameEvent13 extends Frame implements ActionListener{
	Canvas cv;
	MenuBar mb;
	
	public FrameEvent13() {
		cv = new Canvas();
		cv.setBackground(Color.black);
		this.add(cv);
		mb = new MenuBar();
		this.setMenuBar(mb);
		
		Menu colorMenu = new Menu("색상");
		mb.add(colorMenu);
		MenuItem mitem;
		mitem = new MenuItem("빨간색");
		colorMenu.add(mitem);
		mitem.addActionListener(this);
		mitem = new MenuItem("초록색");
		colorMenu.add(mitem);
		mitem.addActionListener(this);
		mitem = new MenuItem("파란색");
		colorMenu.add(mitem);
		mitem.addActionListener(this);
		
		this.setSize(400,300);
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
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "빨간색") {
			cv.setBackground(Color.red);
		}else if(e.getActionCommand() == "초록색") {
			cv.setBackground(Color.green);
		}else if(e.getActionCommand() == "파란색") {
			cv.setBackground(Color.BLUE);
		}
	}
	
}
