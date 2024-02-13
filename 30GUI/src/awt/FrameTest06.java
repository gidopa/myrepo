package awt;
import java.awt.*;
import java.awt.event.*;
public class FrameTest06 {

	public static void main(String[] args) {
		new FrameEx4();
	}

}
class FrameEx4 extends Frame{
	// 패널 : 도화지 
	// 3개 생성을 위한 변수 선언
	Panel pan01, pan02, pan03;
	public FrameEx4() {
		// 2. 패널 객체 생성
		pan01 = new Panel();
		pan02 = new Panel();
		pan03 = new Panel();
		// 3. 각 패널의 구분을 위해 패널에 서로 다른 배경색 지정
		pan01.setBackground(Color.green);
		pan02.setBackground(Color.blue);
		pan03.setBackground(Color.red);
		// 4. 패널 영역들을 프레임창에 북쪽,가운데, 남쪽에 배치
		this.add(BorderLayout.NORTH,pan01);
		this.add(BorderLayout.CENTER,pan02);
		this.add(BorderLayout.SOUTH,pan03);
		this.setSize(300,300);
		this.setVisible(true);
		// 5. 패널 영역에 버튼컴포너늩를 만들어서 배치
		pan01.add(new Button("Button1"));
		pan01.add(new Button("Button2"));
		pan02.add(new Button("Button3"));
		pan03.add(new Button("Button4"));
		pan03.add(new Button("Button5"));
		
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
			
		});
	}
}
