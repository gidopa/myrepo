/*
	다중 선택 가능한 리스트 컴포넌트와 아이템 이벤트
	List 컴포넌트 
	- 열거된 항목중에서 다중 선택이 가능한 컴포넌트
	- public List(int numRows, boolean multiSelect)
      numRows - 보여지는 항목의 갯수, 추가된 항목이 9갠데 3으로 지정하면 스크롤바가 생김 
  
      multiSelect - 다중 선택이 가능하도록 할것인지 지정
*/
package awt;

import java.awt.*;
import java.awt.event.*;
import java.util.Iterator;
public class FrameTest07 {

	public static void main(String[] args) {
		new FrameEvent10();
	}

}
class FrameEvent10 extends Frame implements ItemListener{
	List list;
	TextField tf;
	
	public FrameEvent10() {
		list = new List(6,true);
		list.addItem("사과");
		list.addItem("바나나");
		list.addItem("포도");
		list.addItem("수박");
		list.addItem("딸기");
		list.addItem("귤");
		list.addItem("멜론");
		list.addItem("배");
		list.addItem("복숭아");
		tf = new TextField();
		this.add(list,BorderLayout.NORTH);
		this.add(tf,BorderLayout.CENTER);
		list.addItemListener(this);
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

	@Override
	public void itemStateChanged(ItemEvent e) {
		String total = "";
		List li = (List)e.getSource();
		String[] items = li.getSelectedItems();
		for (int i = 0; i < items.length-1; i++) {
			total += items[i] + ", ";
		}
		total += items[items.length-1];
		tf.setText(total);
	}
	
	
	
	
}
