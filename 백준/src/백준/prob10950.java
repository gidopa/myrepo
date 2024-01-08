package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class prob10950 {

	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = sc.nextInt();
		for(int i =0;i<a;i++) {
			String[] str = br.readLine().split(" ");
			int m = Integer.parseInt(str[0]);
			int n = Integer.parseInt(str[1]);
			System.out.println(m+n);
		}
	}

}
