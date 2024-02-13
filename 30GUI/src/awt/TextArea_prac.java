/*
	TextArea
	- 여러 줄의 텍스트를 입력받기 위해 사용되는 컴포넌트
	- 엔터키로 줄 바꿈 가능
*/
package awt;

import java.awt.*;
import java.awt.event.*;
// 직접 프레임창 만들고 버튼 클릭시 일 처리를 위한 이벤트 리스너 클래스 같이 만들
public class TextArea_prac {

	public static void main(String[] args) {
		FrameEvent5 fe5 = new FrameEvent5();
	}

}
//프레임창 역할
//이벤트 리스너 클래스 역할
class FrameEvent5 extends Frame implements ActionListener{
	TextField txtContent; 
	TextArea txtState ; // 텍스트 필드에 입력한 내용을 출력해 보여줄 곳
	Button btnAppend; // 이걸 누르면 텍스트 필드에 입력한 내용이 출력됨 
	
	public FrameEvent5() {
		this.setLayout(new BorderLayout());
		txtContent = new TextField(20);
		txtState = new TextArea();
		btnAppend = new Button("입 력");
		btnAppend.addActionListener(this);
		
		this.add(txtContent, BorderLayout.NORTH);
		this.add(txtState, BorderLayout.CENTER);
		this.add(btnAppend, BorderLayout.SOUTH);
		
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
	//추가 버튼을 클릭하면 호출되는 콜백메소드 오버라이딩
	@Override
	public void actionPerformed(ActionEvent e) {
		if(txtContent.getText() != "") {
			txtState.append(txtContent.getText() + "\n");
			//텍스트 필드의 입력된 내용 초기화를 위해 빈공백문자열로 변경
			txtContent.setText("");
		}
	}
	
	
	
}
