package 백준_array;
// 신박해따 !

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob3052_array {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] arr = new boolean[42];
		int cnt = 0;
		for(int i=0;i<10;i++) {
			arr[Integer.parseInt(br.readLine()) % 42] = true;
			
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==true) {
				cnt ++;
			}
		}
		System.out.println(cnt);
	}

}
