package awt;
/*
	입력 관련 이벤트 러리를 하는 리스너 인터페이스는 각각 대응되는 어댑터 클래스가 존재함
	Listener종류				Adapter종류					제공하는메소드
	
	KeyListener 			KeyAdapter					keyPressed, keyReleased, keyTyped
	MouseListener 			MouseAdapter				mouseClicked, mouseEntered, mouseExited, mousePressed
	MouseMotionListener		MOuseMotionAdapter			mouseDragged, mouseMoved,
	TextListener			X							~~~~ 
	
	KeyEvent클래스의 getKeyCode()메소드는 VK_? 을 통해 어떤 키가 눌렀는지 알 수 있음
	특수키의 경우 VK_ENTER, VK_ESCAPE 등, VK_1 ~ VK_9 															
*/
import java.awt.*;
import java.awt.event.*;
public class InputEventTest05 {

	public static void main(String[] args) {
		new FrameEvent18();
	}

}
class FrameEvent18 extends Frame{
	TextArea ta;
	TextField txt;
	public FrameEvent18() {
		
		ta = new TextArea();
		this.add(ta,BorderLayout.CENTER);
		txt = new TextField();
		this.add(txt,BorderLayout.NORTH);
		
		txt.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_UP:
					ta.append("위 방향키 누름");
					break;
				case KeyEvent.VK_DOWN:
					ta.append("아래 방향키 누름");
					break;
				default:
					ta.append("다른거");
					break;
				
				}
				
				
				
				
//				if(e.getKeyCode() == KeyEvent.VK_UP) {
//					ta.append("위 방향키 누름\n");
//				}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
//					ta.append("아래 방향키 누름\n");
//				}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
//					ta.append("왼쪽 방향키 누름\n");
//				}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
//					ta.append("오른쪽 방향키 누름\n");
//				}else {
//					ta.append(e.getKeyChar()+ "누름\n");
//				}
			}
		
		}); 
		this.setSize(300, 300);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			dispose();
			System.exit(0);
		}
		});
			
				
	}
}