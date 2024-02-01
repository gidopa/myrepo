package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		str = str.toUpperCase();
		int arr[] = new int[26];
		int max=0;
		char index = 0;
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i) - 'A']++;
		}
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				index = (char) (i +'A');
			}
			else if(max==arr[i]) {
				index = '?';
			}
		}
		System.out.println(index);
		
	}

}
