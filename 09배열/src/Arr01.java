
public class Arr01 {

	public static void main(String[] args) {
		int[] score = new int[5];
		score[0] = 95;
		score[1] = 70;
		score[2] = 80;
		score[3] = 75;
		score[4] = 100;
		int scoreSum =0;
		for(int i =0;i<score.length;i++) {
			scoreSum += score[i];
		}
		double avg = scoreSum / score.length;
		System.out.println("점수의 합계 : "+ scoreSum);
		System.out.println("평균 : " + avg);
		
		
	}

}
