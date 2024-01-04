/*
 	두 개의 주사위를 던졌을 때 , 눈의 합이 6이 되는 모든 경우의 수를 
 	출력하는 프로그램
 	출력화면
 	1 + 5 = 6
 	2 + 4 = 6
 	3 + 3 = 6
 	4 + 2 = 6
 	5 + 1 = 6
 	힌트 다중 FOR문 1부터 6까지 반복하면서 두 값의 합이 6인 경우 출력
 
 
 */
public class Test {

	public static void main(String[] args) {
		for (int i = 1; i < 7; i++) {

			for (int j = 1; j < 7; j++) {

				if ((i + j) == 6) {
					System.out.println(i + " + " + j + " = " + (i + j));
				}
			}
		}

	}

}
