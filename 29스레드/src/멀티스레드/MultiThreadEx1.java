package 멀티스레드;
// 멀티스레드 환경에서는 작업 1 , 작업 2가 병렬적으로 처리되는걸 알 수 있음
import javax.swing.JOptionPane;

public class MultiThreadEx1 {

	public static void main(String[] args) {
		SubThread t1 = new SubThread("t1");
		String input = JOptionPane.showInputDialog("아무거나 입력");
		System.out.println("입력한 값은 "+ input );
	}

}

class SubThread implements Runnable{
	Thread thread;
	public SubThread(String name) {
		thread = new Thread(this,name);
		thread.start();
	}
	@Override
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
