package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//두 수 비교하기

public class prob1330 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] a = br.readLine().split(" ");
		int b = Integer.parseInt(a[0]);
		int c = Integer.parseInt(a[1]);
		
		if(b>c) {
			System.out.println(">");
		}else if (b<c) {
			System.out.println("<");
		}else System.out.println("==");
	}

}
