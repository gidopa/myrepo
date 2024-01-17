package 백준_입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dsada {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		br.close();

		StringBuilder sb = new StringBuilder();
		sb.append(a * (b % 10));
		sb.append("\n");
		sb.append(a * (b % 100 / 10));
		sb.append("\n");
		sb.append(a * (b % 1000 / 100));
		sb.append("\n");
		sb.append(a * b);
		
		System.out.println(sb);

	}

}
