// break문의 사용 예
// 반복문, switch 조건문을 중지하고 빠져나오는 제어문
public class F01 {

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			System.out.print("  " + i);

		}
		System.out.println();

		for (int i = 1; i < 11; i++) {
			System.out.print("  " + i);
			if (i % 3 == 0) {
				break;
			}
		}
	}

}
