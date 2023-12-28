
public class prac {
	public static void main(String[] args) {
		int value =356;
		System.out.println(value - value % 100);
		
		double x= 5.0;
		double y= 1.2;
		double z = 5 % y;
		if(Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다");
		}else {
			double res = z + 10;
			System.out.println("결과 "+ res);
		}
		System.out.println("--------------------------");
		int lengthTop =5 ;
		int lengthBottom = 10;
		int height = 7;
		double area = (double)(lengthTop + lengthBottom) * height/2;
		
		System.out.println(area);
	}
}
