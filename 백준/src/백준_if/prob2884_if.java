package 백준_if;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 원래 시계에서 45분 일찍 알람 맞추기
public class prob2884_if {

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
