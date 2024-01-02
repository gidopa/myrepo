//예제 1~10 짝수, 홀수의 합 

public class E01 {

	public static void main(String[] args) {
		int odd_tot, even_tot;
		int n;
		for (odd_tot = 0, n = 1; n < 11; n += 2) {
			odd_tot += n;
		}
		System.out.println("1~10 홀수의 합(1+3+5+7+9) : "+odd_tot);
		for (even_tot = 0, n = 0; n < 11; n += 2) {
			even_tot += n;
		}
		System.out.println("1~10 짝수의 합(2+4+6+8+10) : "+even_tot);

	}

}
