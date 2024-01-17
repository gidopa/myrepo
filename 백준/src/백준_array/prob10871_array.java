package 백준_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob10871_array {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringTokenizer st1 ;
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		st1 = new StringTokenizer(br.readLine(), " ");
		for(int i =0;i<arr.length;i++) {
			
			arr[i]=Integer.parseInt(st1.nextToken());
			if(arr[i] < x) {
				sb.append(arr[i]).append(" ");
			}
			
		}
		System.out.println(sb);
	}

}
