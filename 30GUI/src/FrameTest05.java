import java.awt.*;
import java.awt.event.*;
public class FrameTest05 {

	public static void main(String[] args) {
		new Grid();
	}

}
class Grid extends Frame{
	public Grid() {
		//3행 2열 표 형태로 배치
		this.setLayout(new GridLayout(3,2));
		this.add(new Button("Button1"));
		this.add(new Button("Button2"));
		this.add(new Button("Button3"));
		this.add(new Button("Button4"));
		this.add(new Button("Button5"));
		this.setSize(300, 300);
		this.setVisible(true);
		this.addWindowListener(new FrameCloseEvent());
	
	}
}
class FrameCloseEvent extends WindowAdapter{
	//창 닫기 이벤트가 발생하면 호출되는 콜백메소드 종류 중 하나로
	//창닫기 이벤트가 발생한 Frame창 객체 정보를 가지는 WindowEvent객체는 이벤트 분배스레드에 의해
	//생성되어 매개변수 e로 넘어옴. getSource를 호출하면 이벤트가 발생한 프레임창 객체를 얻고
	//그 프레임창 객체를 dispose로 닫아버림
	@Override
	public void windowClosing(WindowEvent e) {
		Frame f = (Frame)e.getSource();
		f.dispose();
		System.exit(0);
	}
	
}
