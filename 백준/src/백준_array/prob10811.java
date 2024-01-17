package 백준_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob10811 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int s = 0;
		int e = 0;

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < m; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			s = Integer.parseInt(st1.nextToken()) - 1;
			e = Integer.parseInt(st1.nextToken()) - 1;

			while (s < e) {
				int tmp = arr[s];
				arr[s++] = arr[e];
				arr[e--] = tmp;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			
			sb.append(arr[i]).append(" ");
		}
		System.out.println(sb);

	}

}
