package 백준_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob2908_1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		a = (a%10)*100 + (a%100-a%10) + a/100;
		b = (b%10)*100 + (b%100-b%10) + b/100;
		if(a>b) {
			System.out.println(a);
		}else System.out.println(b);
	}

}
