
public class prob6_24 {

	public static void main(String[] args) {
		int value =5;
		System.out.println(value + "의 절댓값 : "+abs(value));
		value = -10;
		System.out.println(value + "의 절댓값 : "+abs(value));
	}
	public static int abs(int value) {
		
		if(value<0) {
			value= - value;
		}
		return value;
	}
}
