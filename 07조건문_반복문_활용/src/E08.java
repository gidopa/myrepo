/*
 다중 for문
 	-for문안에 for문
 	i가 하나 돌고 i 하나에 대해 j가 다 돌고 그다음 i에 또 j가 돌고
 */
public class E08 {

	public static void main(String[] args) {

		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.println(i + "------>" + j);
			}
		}
	
		
		for (int i = 0; i < 6; i++) {
			for (int k=5;k>i;k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}
