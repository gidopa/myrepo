package 백준_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob1152 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] tokens = str.split(" ");
		
		System.out.println(tokens.length);
	}
	
	public static int countTokens(String str) {
		String[] tokens = str.split(" ");
		return tokens.length;
	}

}
