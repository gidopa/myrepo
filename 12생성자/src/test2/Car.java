package test2;
/*
생성자 사용 목적 : 객체 생성과 동시에 멤버변수 초기화
this, this()
this : new를 이용해 생성한 객체메모리의 주소를 기억하고 있음
       객체 메모리 내부의 멤버변수에 접근할 수 있는 키워드
this() : 생성자 내부에서 다른 생성자를 호출해 객체메모리 내부의
      	 멤버변수의 값을 초기화하려 생성자 호출 구문 
*/

public class Car{
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	//생성자 오버로딩
	// 같은 이름의 생성자(메소드)의 파라미터 갯수 or 타입을 다르게하여 여러개 작성.
	public Car(){}

	public Car(String model) {
		//생성자 내부에서 다른 생성자를 호출
		//매개변수 개수를 보고 생성자 호출
		// 생성자 호출은 무조건 첫줄 sysout 을 this 앞으로 빼면 에러남
		this(model,"은색",250);
		System.out.println("다시 와서 출력");
	}

	public Car(String model, String color) {
		this(model,color,250);
	}

	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	void setCompany(String company) {
		this.company = company;
	}
	
	
}
