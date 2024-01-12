package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob10818 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[n];
		int min =0;
		int max =0;
		st = new StringTokenizer(br.readLine()," ");
		for(int i =0;i<n;i++) {
			
			arr[i] = Integer.parseInt(st.nextToken());
		}
		min = arr[0];
		for(int i =0;i<n;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}else if(arr[i] < min) { 
				min = arr[i];
			}
		}
		sb.append(min).append(" ").append(max);
		System.out.println(sb);
	}

}
