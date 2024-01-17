package 백준_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob1546 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double[] arr = new double[n];
		double sum = 0;
		double max = 0;
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0;i<arr.length;i++) {
			
			arr[i] = Double.parseDouble(st.nextToken());
		}for(int i =0; i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				max = arr[i];
			}else if(arr[i]<arr[i+1]) {
				max = arr[i+1];
			}
		}
		for(int i=0;i<arr.length;i++) {
			arr[i] = arr[i] / max * 100;
			sum += arr[i];
		}
			System.out.println(sum / n);
	
	}

}
