package 심화1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class prob1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		String str = br.readLine().toUpperCase();
		for (int i = 0; i < str.length(); i++) {
			int str_char = str.charAt(i);
			arr[str_char - 'A']++;

		}
		int max = -1;
		char index = 0;

		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index = (char) (i + 65);
			} else if (arr[i] == max) {
				index = '?';
			}
		}
		System.out.println(index);
	}
}