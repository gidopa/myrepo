package 약수_배수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class prob2581 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		for (int i = m; i < n + 1; i++) {
			boolean isPrime = true;
			if (i == 1) {
				continue;
			}
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime == true) {
				sum += i;
				list.add(i);
			}
		}
		if (list.isEmpty()) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(list.get(0));
		}

	}

}
