package awt;
import java.awt.*;
import java.awt.event.*;

/*
	배치관리자 역할을 하는 클래스 존재
	최상위 클래스 : LayoutManager 클래스
	1. BoarderLayout 클래스 : 동 서 남 북 중앙으로 컴포넌트 배치
	2. CardLayout 클래스 : 여러 장의 카드에 컴포넌트를 겹쳐서 배치
	3. FlowLayout 클래스 : 왼쪽에서 오른쪽으로 순서대로 배치
	4. GridLayout 클래스 : 바둑판과 같은 격자에 컴포넌트를 배치
*/
public class FrameTest03 {

	public static void main(String[] args) {
		new FrameEx();

	}

}

class FrameEx extends Frame {
	public FrameEx() {
		this.setLayout(new FlowLayout());

		this.add(new Button("Button1"));
		this.add(new Button("Button2"));
		this.add(new Button("Button3"));
		this.add(new Button("Button4"));
		this.add(new Button("Button5"));
		this.setSize(300, 300);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			// 닫기 버튼을 눌렀을때 자동으로 호출되는 callback 메소드
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}

		});
	}
}
