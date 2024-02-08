/*
 	텍스트 필드와 라벨
 	1. 텍스트 필드
 	- 한줄짜리 텍스트를 입력 받거나 출력할 때 사용하는 컴포넌트
 	- 텍스트 필드의 생성자에 숫자를 지정하여 봉여줄 수 있는 문자열의 개수제한, 문자열을 지정해 초기값을 줄 수도 있음
 	- 사용자로부터 패스워드를 입력 받을 때에도 텍스트필드사용, 보안을 위해선 텍스트필드의 setEchoChar()메소드
 	  매개변수로 특수문자를 넘기면 입력된 내용 대신에 특수문자가 나옴
 	TextField생성자
 	Text Field()  비어 있는 텍스트 필드 생성
 	TextField(int n) n개의 문자를 보여줄 수 있는 텍스트 필드 생성
 	TextField(String s) 지정된 텍스트로 초기화값을 갖는 텍스트 필드
 	TextField(String s,int n) 지정된 텍스트로 초기화값을 갖고 n개의 문자를 보여주는 텍스트필드
 	
 	2. 라벨(Label)
 	- 텍스트 필드가 여러 개 있을때 각 텍스트 필드가 어떤 역할을 하는지 알려주기 위한 텍스트 표시를 위한 영역을 보여주는 컴포넌트
 	주제 : ID와 패스워드를 입력받는 텍스트필드
*/
import java.awt.*;
import java.awt.event.*;
public class TextFiled {

	public static void main(String[] args) {
		new FrameEvent4();
	}

}
class FrameEvent4 extends Frame{
	Panel p1, p2;
	TextField txtID;
	TextField txtPW;
	
	public FrameEvent4() {
		this.setLayout(new BorderLayout());
		p1 = new Panel();
		p2 = new Panel();
		txtID = new TextField(20);
		txtPW = new TextField(20);
		txtPW.setEchoChar('*');
		p1.add(new Label("아 이 디"));
		p1.add(txtID);
		this.add(p1, BorderLayout.NORTH);
		p2.add(new Label("패스워드 :" ));
		p2.add(txtPW);
		//패널을 프레임창에 추가
		this.add(p2,BorderLayout.CENTER);
		
		this.setSize(400,100);
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
