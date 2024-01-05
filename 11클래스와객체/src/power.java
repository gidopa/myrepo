
public class power {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
	
		System.out.println(power(x,y));
	}

	static int power(int a, int b) {
		if (b == 1) {
			return a;
		} else {
			return a * power(a, b - 1);
		}

	}

}
