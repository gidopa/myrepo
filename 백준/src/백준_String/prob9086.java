package 백준_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob9086 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = new String[n];
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			str[i] = br.readLine();
			sb.append(str[i].charAt(0)).append(str[i].charAt(str[i].length()-1))  .append(" ");
			
		}
		System.out.println(sb);
	}

}
