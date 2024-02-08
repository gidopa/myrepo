/*
	선택 컴포넌트와 아이템 이벤트
	Choice Componenet
	- 드랍다운 리스트 콤보박스를 작성할 때 사용
	- 선택 컴포넌트 생성 후에 드롭다운 리스트에 들어갈 항목들을 컴포넌트에 추가하기 위해 addItem()메소드를 호출
	Choice c = new Choic(); c.addItem("Item")
*/

import java.awt.*;
import java.awt.event.*;

public class ChoiceComponent {

	public static void main(String[] args) {
		new FrameEvent8();
	}

}
class FrameEvent8 extends Frame implements ItemListener{
	Choice c;
	TextArea area;
	Label label ;
	public FrameEvent8() {
		this.setLayout(new BorderLayout());
		c = new Choice();
		c.addItem("사과");
		c.addItem("포도");
		c.addItem("수박");
		c.addItem("바나나");
		this.add(c,BorderLayout.NORTH);
		c.addItemListener(this);
		area = new TextArea();
		this.add(area,BorderLayout.CENTER);
		
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
	public void itemStateChanged(ItemEvent e) {
		area.append(c.getSelectedItem()+"\n");
	}
	
}