// areaRectangle() 메소드를 오버로딩해서 파라미터 갯수에 따라 
// 1개는 정사각형, 2개는 직사각형
public class Calculator {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		System.out.println(cal.areaRectangle(5,4));
		System.out.println(cal.areaRectangle(6));
		
	}
	
	double areaRectangle(double width) {
		return width*width;
	}
	
	double areaRectangle(double width, double height) {
		return width*height;
	}
}

