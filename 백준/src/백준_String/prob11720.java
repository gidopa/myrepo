package 백준_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class prob11720 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		String str = br.readLine();
		for(int i=0;i<n;i++) {
			sum += str.charAt(i)-48;
			
		}
		System.out.println(sum);
	}

}
