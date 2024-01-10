package result;

//메소드 사용방법
class SimpleMath { // 단순 계산 클래스
	public static final double PI = 3.1415;
	
	public static double add(double n1, double n2) {
		return n1 + n2;
	}

	public static double min(double n1, double n2) {
		return n1 - n2;
	}

	public static double mul(double n1, double n2) {
		return n1 * n2;
	}
}

class AreaMath { // 넓이 계산 클래스

	// 원넓이 계산 메소드
	public static double calCircleArea(double rad) {
		return SimpleMath.mul(SimpleMath.mul(rad,rad) ,SimpleMath.PI); // 원넓이 리턴
	}

}

class PerimeterMath { // 직사각형의 둘레계산클래스
	public static double calRectanglePeri(double width, double height) {
		return SimpleMath.add(SimpleMath.add(width, height), SimpleMath.add(width, height)); // 직사각형 둘레 리턴

	}
}

public class HowMethod_static {
	public static void main(String[] args) {
	
	//참고!! 원넓이 구하는 메소드 호출 , 호출시 2.4전달
	System.out.println("원의 넓이 : "+ AreaMath.calCircleArea(2.4));
	//참고!! 직사각형 둘레 구하는 메소드 호출, 호출시  2.0, 4.0 전달
	System.out.println("직사각형 둘레 : "+ PerimeterMath.calRectanglePeri(2.0, 4.0));
		// 출력 결과
		// 원의 넓이 : 18.09504
		// 직사각형 둘레 : 12.0
	}
}
