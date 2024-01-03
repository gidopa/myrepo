// 배열의 선언과 초기화, 출력
import java.util.Arrays;

public class G01 {

	public static void main(String[] args) {
		int[] score = new int[5]; // 모든 요소가 0으로 초기화
		score[0] = 95;
		score[1] = 70;
		score[2] = 80;
		score[3] = 75;
		score[4] = 100;// 인덱스 하나씩 값 대입
		int[] score1 = {10, 20, 30, 40, 50};
		int[][] twoDArray = { {1, 2}, {3, 4, 5}, {6, 7, 8, 9} };
		int[] myArray = new int[]{10, 20, 30, 40, 50}; //선언과 동시에 초기화
		
		System.out.println(score[3]);
		System.out.println(twoDArray[1][0]);
		String toStr = Arrays.toString(score1);
		System.out.println(Arrays.toString(score1));
		System.out.println(Arrays.deepToString(twoDArray));
		System.out.println(score[4]);
		
		for(int i=0;i<score.length;i++) {
			System.out.println("score["+i+"] : " + score[i] + " ");
			
		}
		
		
		


	}

}
