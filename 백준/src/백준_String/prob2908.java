package 백준_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob2908 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] arr = new String[2];
		arr = br.readLine().split(" ");
		int a = Integer.parseInt(sb.append(arr[0]).reverse().toString());
		int b = Integer.parseInt(new StringBuilder().append(arr[1]).reverse().toString());
		if(a>b) {
			System.out.println(a);
		}else System.out.println(b);

		
	}

}
