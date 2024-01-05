package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob11382 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] a = br.readLine().split(" ");
		long b = Long.parseLong(a[0]);
		long c = Long.parseLong(a[1]);
		long d = Long.parseLong(a[2]);
		
		System.out.println(b+c+d);
	}

}
