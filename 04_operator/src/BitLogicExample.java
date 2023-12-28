
public class BitLogicExample {

	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25));
		/*
		45와 25를 비트논리곱 연산
		45를 2진수로 변경하면 00101101
		25를 2진수로 변경하면 00011001
		45 & 25 -> 00001001 다시 10진수로 변환하면 2^3 + 1 = 9  (and)
		45 | 25 -> 00111101 10진수로 변환하면 1+4+8+16+32 = 61 (or)
		45 ^ 25 -> 00110100 10진수 -> 4+16+32 = 52  (Exclusive or)
		*/
		System.out.println("45 | 25 = "+ (45 | 25));
		System.out.println("45 ^ 25 = "+ (45 ^ 25));
		
		/*
		 ~45 -> 11010010 -> 
		 ~25 -> 11100110 -> 
		 최상위 비트가 1이면 음수
		 */
		System.out.println("~45 = "+ ~45);
		System.out.println("~25 = "+ ~25);
	}

}
