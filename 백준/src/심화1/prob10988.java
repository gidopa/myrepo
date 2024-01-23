package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob10988 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		if(str.equals(sb.append(str).reverse().toString())) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		
	}

}
