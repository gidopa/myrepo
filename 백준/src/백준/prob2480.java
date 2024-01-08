package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 주사위를 던져 해당 조건에 맞는 상금을 가져감
public class prob2480 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int reward = 0;
		int max =0;
		if (a !=b && b!=c && a!=c) {
			if(a>b) {
				if(c>a) {
					max =c;
				}else {
					max =a;
				}
			}else {
				if(b>c) {
					max =b;
				}else {
					max =c;
				}
			}
			reward = max * 100;
		} else {
			if (a==b && b==c && a==c) {
				reward = 10000+a*1000;
			}else {
				if(a==b || a==c) {
					reward = 1000 + a*100;
				}else {
					reward = 1000 + b*100;
				}
			}
		}
		System.out.println(reward);

	}

}
