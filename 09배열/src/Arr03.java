import java.util.Arrays;

public class Arr03 {

	public static void main(String[] args) {
		//  {{85,60,70} , {90,95,80} , {75,80,100} , {80,70,95} , {100,65,80} }
		int[][] num = new int[5][3];
		num[0][0] = 85;
		num[0][1] = 60;
		num[0][2] =	70;
		
		num[1][0] = 90;
		num[1][1] = 95;
		num[1][2] = 80;
		
		num[2][0] = 75;
		num[2][1] = 80;
		num[2][2] = 100;
		
		num[3][0] = 80;
		num[3][1] = 70;
		num[3][2] = 95;
		
		num[4][0] = 100;
		num[4][1] = 65;
		num[4][2] = 80;
		
		System.out.println(Arrays.deepToString(num));		//2차원 배열 선언 및 초기화
		
		int[][] num1 = {{85,60,70},{90,95,80},{75,60,100},{80,70,95},{100,65,80}}; // 배열 선언하면서 초기화
		System.out.println(Arrays.deepToString(num1));		
		for(int i=0;i<num.length;i++) {					
			System.out.println();
			for(int j=0;j<3;j++) {
				System.out.print(" "+num[i][j]+" ");		//반복문을 돌면서 원소 하나씩 찍어보기
			}
		}
		System.out.println(num.length);
		
	}

}
