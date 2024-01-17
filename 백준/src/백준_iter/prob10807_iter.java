package 백준_iter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob10807_iter {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<arr.length;i++) {
			arr[i]=(Integer.parseInt(st.nextToken()));
		}
		int sum = 0;
		int v = Integer.parseInt(br.readLine());
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==v) {
				sum ++;
			}
		}
		System.out.println(sum);
	}

}
