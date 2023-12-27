
public class prob5 {

	public static void main(String[] args) {
		int year = 2400;
		boolean leafyear = ((year % 4 ==0) && (year % 100 != 0) || (year % 400 == 0)) ;
		
		System.out.println(leafyear);
	}

}
