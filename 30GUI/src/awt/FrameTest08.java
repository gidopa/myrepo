/*
	스크롤바 컴포넌트와 조정 이벤트
	Scrollbar 컴포넌트
	- 주어진 크기보다 큰 문서의 내용을 읽어왔을때 이 내용을 읽기 위한 스크롤바를 설정하는 컴포넌트
	- 객체 생성 방법
	Scrollbar sc = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 0, 100);
	Scrollbar.HORIZONTAL : 수평방향 스크롤바
	Scrollbar.VERTICAL : 수직방향 스크롤바
	두번째 파라미터 : 스크롤바 생성 시 막대의 위치
	세번째 : 막대의 크기
	네번째 : 스크롤바의 최소값 설정
	다섯번째 : 스크롤바의 최대값 설정
	AdjustmentEvent
*/
package awt;

import java.awt.*;
import java.awt.event.*;
public class FrameTest08 {

	public static void main(String[] args) {
		new FrameEvent11();
	}

}
class FrameEvent11 extends Frame implements AdjustmentListener{
	Scrollbar sc;
	TextArea ta;
	public FrameEvent11() {
		this.setSize(400,200);
		this.setVisible(true);
		this.setLayout(new BorderLayout());
		sc = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 0, 100);
		ta = new TextArea();
		this.add(sc,BorderLayout.NORTH);
		this.add(ta,BorderLayout.CENTER);
		sc.addAdjustmentListener(this);
		
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		// scrollbar의 조정 방향값을 알려주는데 1을 리턴받으면 우측 한칸 2면 좌측 한칸 5는 방향상관없이 드래그로 이동
		// 왼쪽 칸을 누르면 3 오른쪽에 칸을 누르면 4
		//System.out.println(e.getAdjustmentType());
		ta.append(e.getAdjustmentType() + ", " + e.getValue() + "\n");
		
	}
	
}

