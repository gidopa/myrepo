package awt;
import java.awt.*;
import java.awt.event.*;

public class FrameTest02 {

	public static void main(String[] args) {
		new FrameEvent();
	}

}

class FrameEvent extends Frame {
	public FrameEvent() {
		super("윈도우 이벤트");
		this.setSize(300, 200);
		this.setVisible(true);

		// 프레임창 닫기 버튼을 눌렀을때 창이 닫기도록 이벤트처리
		// 이벤트 리스너객체는 WindowAdapter부모 클래스의 windowClosing메소드를 오버라이딩 받은 이름이 없는 익명 객체를 생성해
		// 프레임창에 등록
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
