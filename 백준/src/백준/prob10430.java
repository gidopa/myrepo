package 백준;
// 3항 연산 출력
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class prob10430 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str[] =  bf.readLine().split(" ");
		
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println(a*b%c);
		System.out.println(((a%c)*(b%c))%c);

	
	}

}
