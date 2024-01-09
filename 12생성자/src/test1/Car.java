package test1;


public class Car{
	String company;
	String model;
	String color;
	int maxSpeed;
	//생성자 오버로딩
	// 같은 이름의 생성자(메소드)의 파라미터 갯수 or 타입을 다르게하여 여러개 작성.
	public Car(){}

	public Car(String model) {
		this.model = model;
	}

	public Car(String model, String color) {
		this.model = model;
		this.color = color;
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
