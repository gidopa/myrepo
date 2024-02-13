/*
	체크박스와 아이템 이벤트
	체크박스
	- "on"또는 "off" 둘중의 하나의 상태를 가지는 버튼 Checkbox 클래스로 구현
	체크박스는 아이템 이벤트를 발생 시킴 이벤트리스너 클래스를 만들 때 ItemListener인터페이스 구현
	ItemStateChanged(ItemEvent e) 메소드 오버라이딩 addItemListener 메소드로 이벤트 소스에 등록
	- 메소드 
	getStateChange()메소드
	- 체크박스의 상태가 on 인지 off 인지 반환해준다 
	getItem()
	- 이벤트를 일으킨 아이템을 얻을 떄 사용 
*/
package awt;

import java.awt.*;
import java.awt.event.*;
public class Checkbox_Prac {

	public static void main(String[] args) {
		new FrameEvent6();
	}

}
class FrameEvent6 extends Frame implements ItemListener{
	Panel p;
	Checkbox ch1, ch2, ch3;
	//3개의 체크 박스 중에 체크된 상태의 정보를 띄워줄 TextArea
	TextArea area;
	
	public FrameEvent6() {
		setLayout(new BorderLayout());
		p = new Panel();
		ch1 = new Checkbox("Red");
		ch2 = new Checkbox("Green");
		ch3 = new Checkbox("Blue");
		p.add(ch1);
		p.add(ch2);
		p.add(ch3);
		
		this.add(p,BorderLayout.NORTH);
		area = new TextArea();
		this.add(area,BorderLayout.CENTER);
		ch1.addItemListener(this);
		ch2.addItemListener(this);
		ch3.addItemListener(this);
		
		this.setSize(400,200);
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		
		});
	}
	// 아이템(체크박스)의 상태가 변화할때마다 호출되는 콜백 메소드
	// 3개의 체크박스 중 상태가 변한 체크박스 하나의 정보를 가지는 e
	@Override
	public void itemStateChanged(ItemEvent e) {
		String strState = " 체크 해제\n";
		System.out.println("e.getStateChange() : "+e.getStateChange());
		System.out.println("ItemEvent.SELECTED : "+ItemEvent.SELECTED);
		//e.getStateChange // 체크되면 1 체크 풀리면 2
		//ItemEvent.SELECTED // 체크된 상태의 상수값 1
		if(e.getStateChange() != ItemEvent.SELECTED) {
			area.append(e.getItem()+strState);
		}else {
			strState = " 체크\n";
			area.append(e.getItem() + strState);
		}
	}
	
}
