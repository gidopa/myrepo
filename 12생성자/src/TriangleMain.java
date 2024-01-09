
/* 과제1 
[생성자를 포함하는 클래스의 정의]

---------문제1----------

밑변과 높이 정보를 저장할 수있는 Triangle 클래스를 정의하자.

그리고 객체를 생성과 동시에 초기화가 가능한 생성자도 정의하자.

끝으로 밑변과 높이 정보를 변경시킬 수있는 메소드와 

삼각형의 넓이를 계산해서 반환하는 메소드도 함께 정의하자.

끝으로 생성자를 이용한 객체생성 후 삼각형의 넓이를 출력하고,

setter메소드 호출후 밑변 7.5로 변경, 높이 9.2로 변경 후 

다시 삼각형의 넓이를 출력해보자. 


Tip!)

TriangleMain.java파일

클래스2개  Triangle, TriangleMain

밑변 bottom  실수형(8) 
높이 height  실수형(8)

밑변과 높이 정보를 변경시킬수 있는 메소드 : setter : this사용

삼각형의 넓이를 계산해서 반환하는 메소드 : getArea()


Triangle객체생성과 동시에 밑변10.2, 높이17.w3 초기화

*/

public class TriangleMain {
	public static void main(String[] args) {
		Triangle tri = new Triangle(10.2, 17.3);
		System.out.println(tri.getArea());
		tri.setWidth(7.5);
		tri.setHeight(9.2);
		System.out.println(tri.getArea());
	}
}

class Triangle { // 삼각형
	double height;
	double width;

// alt + shift + s 하고 o를 누르면 생성자 만들 수 있음
	public Triangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

// alt + shift + s 하고 r을 누르거나 getter/setter 찾기
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	double getArea() {
		return (double) 1 / 2 * height * width; 
	}

}
//	Triangle(double height, double width) {
//		this.height = height;
//		this.width = width;
//	}

//	void setHeight(double height) {
//		this.height = height;
//	}
//
//
//	void setWidth(double width) {
//		this.width = width;
//	}
//

/*
 * 삼각형의 넓이: 88.23 삼각형의 넓이 : 34.5
 */