package 백준_iter;
// 별찍기 오른쪽부터
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob2439_iter_star {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			
			for(int k=n;k>i+1;k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}System.out.println();
			
		}

	}

}
