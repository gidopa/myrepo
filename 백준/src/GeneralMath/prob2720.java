package GeneralMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob2720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int money=0;
		int[] arr = {25, 10, 5, 1};
		for(int i=0;i<n;i++) {
			money = Integer.parseInt(br.readLine());
			for(int j=0;j<arr.length;j++) {
				sb.append(money/arr[j] +" ");
				money = money % arr[j];
				if(j == arr.length-1) {
					sb.append("\n");
				}
			}
		}
		System.out.println(sb);
	}

}
