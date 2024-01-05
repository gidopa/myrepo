package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob2884 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] time = br.readLine().split(" ");
		int hour = Integer.parseInt(time[0]);
		int min = Integer.parseInt(time[1]);
		if (min < 45) {
			hour--;
			min = 60 - (45 - min);

			if (hour < 0) {
				hour = 23;
			}
			System.out.println(hour + " " + min);
		} else {
			System.out.println(hour + " " + (min - 45));
		}
	}
}
