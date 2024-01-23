
public class Test2 {

	public static void main(String[] args) {
		int num = 10;
		Integer n = Integer.valueOf(num);
		double PI = 3.14;
		Double pi = Double.valueOf(PI);
		
		System.out.println(n.intValue());
		System.out.println(pi.doubleValue());
		System.out.println(String.valueOf(n.intValue()));
		System.out.println(String.valueOf(pi.doubleValue()));
		
	}

}
