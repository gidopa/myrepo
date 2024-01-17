package 백준_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob5597_array {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[30];
		for (int i = 0; i < 28; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[num - 1] = 1;

		}br.close();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 1) {
				System.out.println(i + 1);
			}
		}

	}

}
