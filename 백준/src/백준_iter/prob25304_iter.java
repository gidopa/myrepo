package 백준_iter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 영수증 문제 반복분 ?!
public class prob25304_iter {

	public static void main(String[] args) throws IOException{
		int sum =0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		StringBuilder sb = new StringBuilder();
		int tot = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		for (int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sum += a*b;
		}
		if(sum == tot) {
			System.out.println("YES");
		}else System.out.println("NO");
	}

}
