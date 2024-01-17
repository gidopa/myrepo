package 백준_입출력;
// 사칙연산 및 모듈러 연산 출력
import java.util.Scanner;
public class prob10869_operator {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		int a = Scan.nextInt();
		int b = Scan.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}

}
