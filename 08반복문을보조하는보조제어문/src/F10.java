/*
 다중 반복문에서 break문이 사용될 경우 가장 근접한 반복문에서 벗어남
 
 	바깥쪽 반복문{
 		안쪽 반복문{
 			break;
 		}     |
 	}	  <---|
 	안쪽 반복문을 빠져나감 
 */
public class F10 {

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {

				if (j % 3 == 0) {
					break; // 다중 반복문에서 break하면 가장 가까운 반복문을 벗어남
				}
				System.out.print("  j-> " + j);
			}
			System.out.println("\n  i-> " + i);
		}

		System.out.println();
// 바깥쪽 반복문을 빠져나가려면 레이블명을 기술해야함
		exit_for:
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if(j%3==0) {
					break exit_for;
				}
				System.out.print(" j-> " + j);
			}
			System.out.println("\n i-> "+i);
		}
		System.out.println("------------------------");
	}
}
