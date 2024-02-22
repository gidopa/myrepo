package 약수_배수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob1978 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		int n = Integer.parseInt(br.readLine());
		int cnt = 0 ;
		boolean prime = false;
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<n;i++) {
			int num = Integer.parseInt(st.nextToken());
			for(int j=2;j<num;j++) {
				prime = true;
				if(num % j == 0) {
					prime = false;
				}
				
			}
			if(prime == true) {
				cnt ++;
			}
		}
		System.out.println(cnt);
	}
//
}
