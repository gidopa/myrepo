package 백준_입출력;
import java.util.Scanner;
public class prob2588_1 {
// 곱셈 수기로 계산할때 나오는 값 계산
// 472 * 385
//-----------
// 472 * 5
// 472 * 80  
// 472 * 300
//--------------
// 472*385
	public static void main(String[] args)  {
		Scanner in = new Scanner(System.in);
		 
		int A = in.nextInt();
		String B = in.next();
        
		in.close();
		
		System.out.println(A * (B.charAt(2) - '0'));  // charAt -> 문자의 ASCII 코드값을 뱉는데 거기서 숫자의 경우 0을 빼면 바로 숫자를 잡을 수 있다 된다
		System.out.println(A * (B.charAt(1) - '0'));
		System.out.println(A * (B.charAt(0) - '0'));
		System.out.println(A * Integer.parseInt(B));

	}

}
