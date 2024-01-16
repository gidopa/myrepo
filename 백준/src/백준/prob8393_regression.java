package 백준;
import java.util.Scanner;

public class prob8393_regression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(sum(a));
		
	}
	static int sum(int n) {
		if(n==0) {
			return 0;
		}
		return n+sum(n-1);
	}
}

