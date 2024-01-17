package 백준_if;
// 윤년 구하기
import java.util.Scanner;
public class prbo2753_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year % 4 ==0 && year % 100 !=0 || year % 400 ==0) {
			System.out.println(1);
		}else System.out.println(0);
	}

}
