package 멀티스레드;

public class MultiThreadTest {

	public static void main(String[] args) {
		Timer t1 = new Timer();
		printUpper t2 = new printUpper();
		printLower t3 = new printLower();
		printKor t4 = new printKor();
	}

}

class Timer implements Runnable {
	Thread thread;

	public Timer() {
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}System.out.println();
	}

}

class printUpper implements Runnable {
	Thread thread;

	public printUpper() {
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
		System.out.println();
	}
}

class printLower implements Runnable {
	Thread thread;

	public printLower() {
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i);
		}
		System.out.println();
	}
}

class printKor implements Runnable {
	Thread thread;

	public printKor() {
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		char arr[] = { 'ㄱ', 'ㄴ', 'ㄷ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅅ', 'ㅈ' };
		for (char i : arr) {
			System.out.print(i);
		}
		System.out.println();
	}
}
