package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob1157 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		str.toUpperCase();
		int max = 0;
		int[] arr = new int[26];
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)-'A']++;
		}
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				max = arr[i];
			}else {
				max = arr[i+1];
			}
		}
		
	}

}
