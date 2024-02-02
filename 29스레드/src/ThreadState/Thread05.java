package ThreadState;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
	값을 입력받으면 출력결과가 오랜시간뒤에 출력된다고 가정하면
	출력결과가 나오기전에 약간의 효과를 줘서 잠시 기다려주세요라는 메세지를 띄움
*/
public class Thread05 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		Thread test = new Thread(new TestThread());
		System.out.print("숫자를 입력하세요 : ");
		long m = sc.nextLong();
//		long n = Long.parseLong(br.readLine());
		
		test.start();
		
		int total = 0;
		for(long i =1;i<=m;i++) {	
			total += i;
		}
		
		System.out.println(total);
	}

}


class TestThread implements Runnable{
	@Override
	public void run() {
		System.out.println("\n\n잠시 기다려 주세요\n\n");
	}
	
}
