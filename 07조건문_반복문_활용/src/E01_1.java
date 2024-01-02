
public class E01_1 {

	public static void main(String[] args) {
		int oddSum = 0;
		int evenSum = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 1) {
				oddSum += i;
			} else if (i % 2 == 0) {
				evenSum += i;
			}
		}
		System.out.println("1~10 홀수의 합(1+3+5+7+9) : " + oddSum);
		System.out.println("1~10 짝수의 합(2+4+6+8+10) : " + evenSum);
	}

}
