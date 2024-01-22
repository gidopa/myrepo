package 백준_입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob11718 {

	public static void main(String[] args) throws NullPointerException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String inputLine = "";
		while(true) {
			inputLine = br.readLine();
			if(inputLine.equals(null) || inputLine.equals("")) {
				break;
			}sb.append(inputLine).append("\n");
			
		}br.close();
		System.out.println(sb);
	}

}
