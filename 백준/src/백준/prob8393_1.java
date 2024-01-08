package 백준;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class prob8393_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int sum = 0;
		while(a>0) {
			sum = sum + a;
			a--;
		}
		System.out.println(sum);
	}

}
