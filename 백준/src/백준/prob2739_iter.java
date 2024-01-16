package 백준;
//구구단 출력
import java.util.Scanner;
public class prob2739_iter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<10;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}

	}

}
