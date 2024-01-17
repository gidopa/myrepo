package 백준_if;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 오븐문제 현재시간, 조리시간을 입력받아 조리 완료 시간 출력
public class prob2525_if {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] now = br.readLine().split(" ");
		int hour = Integer.parseInt(now[0]);
		int min = Integer.parseInt(now[1]);
		
		String a = br.readLine();
		int cookTime = Integer.parseInt(a);
		int total_min = cookTime + min;
		int n = total_min / 60;
		
		if(total_min>59 ) {
			hour = hour + n;
			total_min = total_min - (60 * n);
			min = total_min;
		}else {
			min = total_min;
		}
		if(hour>23) {
			hour -= 24;
		}
		System.out.println(hour + " " + min);
		
		
		

	}

}
