package 백준_입출력;
// 3항 입력받고 더하기 출력
// 77 77 7777
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob11382_IO {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] a = br.readLine().split(" ");
		long b = Long.parseLong(a[0]);
		long c = Long.parseLong(a[1]);
		long d = Long.parseLong(a[2]);
		
		System.out.println(b+c+d);
	}

}
