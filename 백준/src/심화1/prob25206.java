package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob25206 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String[] gradeList = { "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P" };
		Double[] gradeScore = { 4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0 };
		Double sum = 0.0;	// 학점 * 평점
		Double total = 0.0; // 학점의 합
		for (int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String subject = st.nextToken();
			Double grade = Double.parseDouble(st.nextToken());
			String score = st.nextToken();
			
			for(int j=0;j<gradeList.length;j++) {
				if(score.equals(gradeList[j])) {
					sum += grade * gradeScore[j];
					if(!score.equals(gradeList[9])) {
						total += grade;
					}
				}
			}

		}
		System.out.println(sum/total);

	}

}
