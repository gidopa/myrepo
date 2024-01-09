package test1;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setCompany("현대자동차");
		System.out.println(car1.company);
		Car car2 = new Car("그랜저");
		car2.setCompany("현대자동차");
		System.out.println(car2.model);
		System.out.println(car2.color);
		Car car3 = new Car("소나타","회색");
		System.out.println(car3.model + car3.color + car3.maxSpeed);
		Car car4 = new Car("그랜저","검정", 200);
		System.out.println(car4.model + car4.color + car4.maxSpeed);
		
	}

}
