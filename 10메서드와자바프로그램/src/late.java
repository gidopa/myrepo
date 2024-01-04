
public class late {

	public static void main(String[] args) {
		sum(4,5,6,7);
		
	}
	
	public static int sum(int ... values) {
		int sum =0;
		for(int i =0;i<values.length;i++) {
			sum += values[i];
		}
		System.out.println(sum);
		return sum;
	}

}
