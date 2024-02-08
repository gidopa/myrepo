/*
	1.라디오 버튼은 체크박스 그룹을 만들어 하나만 선택하도록
	Chechkbox의 첫번째 매개변수는 캡션 값, 두 번째는 체크박스 그룹, 마지막은 체크된 상태로 출력될것인지 선택
*/
import java.awt.*;
import java.awt.event.*;
public class CheckboxGroup_Prac {

	public static void main(String[] args) {
		new FrameEvent7();
	}

}
class FrameEvent7 extends Frame implements ItemListener{
	Checkbox box1, box2, box3;
	CheckboxGroup grp;
	
	public FrameEvent7() {
		this.setLayout(new FlowLayout());
		grp = new CheckboxGroup();
		box1 = new Checkbox("red", grp, false);
		box2 = new Checkbox("green", grp, false);
		box3 = new Checkbox("blue", grp, false);
		
		this.add(box1);
		this.add(box2);
		this.add(box3);
		
		box1.addItemListener(this);
		box2.addItemListener(this);
		box3.addItemListener(this);
		
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
//		switch(e.getItem().toString()) {
//		case "red":
//			this.setBackground(Color.red);
//			break;
//		case "green":
//			this.setBackground(Color.green);
//			break;
//		case "blue":
//			this.setBackground(Color.blue);
//			break;
//		}
		Object box = e.getSource();
		Color color = Color.black;
		if(box == box1) {
			color = Color.red;
		}else if(box == box2) {
			color = Color.green;
		}else if(box == box3) {
			color =Color.blue;
		}
		this.setBackground(color);
	}
	
}