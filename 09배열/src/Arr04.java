// 2차원 배열을 만들고 초기화하고 데이터를 불러서 합을 구하는 프로그램
// 
import java.util.Arrays;
public class Arr04 {

	public static void main(String[] args) {
		int[][] score = {
					{85,60,70},
					{90,95,80},
					{75,80,100},
					{80,70,95},
					{100,65,80}
				};
	
//		for(int i=0;i<score.length;i++) {
//			
//				sumKor += score[i][0];
//				sumEng += score[i][1];
//				sumMath += score[i][2];
//			
//		}
//		단일 for문으로 구현하면 과목마다 sum 변수를 만들어 합산
		int[] subject = new int[3];	// 과목별 점수 합계를 저장할 배열
		int[] student = new int[5];	// 학생별 점수 합계를 저장할 배열
		
		for(int i=0;i<subject.length;i++) {
			for(int j=0;j<score.length;j++) {
				subject[i] += score[j][i];
			}
		}
		// subject 배열의 원소를 하나씩 돌면서 순서대로 과목별 합계 입력
		System.out.println(Arrays.toString(subject));
		System.out.println();
	
		for(int i=0;i<student.length;i++) {
			for(int j=0;j<subject.length;j++) {
				student[i] += score[i][j];
			}
		}
		
		// student 배열의 원소를 하나씩 돌면서 순서대로 학생별 점수 총합 입력
		System.out.println(Arrays.toString(student));
		
		
	}
}
