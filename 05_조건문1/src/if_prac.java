

import java.util.Scanner;

public class if_prac {
	public static void main(String[] args) {
		System.out.println("정수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		
	int num = scan.nextInt();
	// String num = scan.nextLine();
	// int rcv_num = Integer.Parseint(num);
	if(num % 2 == 0 ) {
		System.out.println("짝수");
	}else {
		System.out.println("홀수");
	}
	}
}
