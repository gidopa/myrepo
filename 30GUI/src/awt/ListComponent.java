/*
	리스트 컴포넌트
	-여러개의 항목을 열거해 화면에 보여주는 컴포넌트
	List li = new List();   li.addItem("Item");
	선택 컴포넌트와 마찬가지로 여러개의 항목중에서
*/
package awt;

import java.awt.*;
import java.awt.event.*;

public class ListComponent {

	public static void main(String[] args) {
		new FrameEvent9();
	}

}
class FrameEvent9 extends Frame implements ItemListener{
	List li;
	TextArea area;
	
	public FrameEvent9() {
//		this.setLayout(new BorderLayout());
		li = new List();
		li.addItem("사과");
		li.addItem("포도");
		li.addItem("수박");
		li.addItem("바나나");

		li.addItemListener(this);
		this.add(li,BorderLayout.NORTH);
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
		area.append(li.getSelectedItem()+"\n");
//		List li = (List)e.getSource();
//		String item = li.getSelectedItem();
//		area.append(item + "\n");
	}
	
}
