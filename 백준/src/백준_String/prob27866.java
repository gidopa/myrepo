package 백준_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob27866 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = Integer.parseInt(br.readLine());
		
		System.out.println(str.charAt(a-1));
	}

}
