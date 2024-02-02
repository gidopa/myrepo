//Swing(GUI 환경을 구성하고 이벤트 처리)
//제공되는 클래스 중에서 다이얼로그창(메세지박스)를 화면에 띄워 보여주는 JOptionPane클래스 제공

// Main에서 작업1이 끝나기전까지 작업2는 무한대기 단일 스레드환경으로 병렬처리가 불가능해 효율성 나락 
package 멀티스레드;

import javax.swing.JOptionPane;
public class SingleThreadEX2 {

	public static void main(String[] args) throws InterruptedException {
		//작업1 : 다이얼로그창을 띄워 입력받은 내용을 화면에 출력
		String input = JOptionPane.showInputDialog("아무거나 입력");
		System.out.println("입력한 값은 "+ input );
		//작업2 : 카운트 세는 작업 10부터 1까지 반복출력
		for(int i=10;i>0;i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}

}
