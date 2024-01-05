
public class factorial {

	public static void main(String[] args) {
		System.out.println(factorial(4));
	}
	
	static int factorial(int x) {
		int res = 0 ;
		if(x==1) {
			return 1;
		}else {
			return x*factorial(x-1);
	
	}

	}
}
	