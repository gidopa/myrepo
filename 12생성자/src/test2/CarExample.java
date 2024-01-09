package test2;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car("자가용");
		System.out.println(car1.color + car1.maxSpeed + car1.company + car1.model);
		Car car2 = new Car("자가용", "검정");
		car2.setCompany("KIA");
		System.out.println(car2.color + car2.maxSpeed + car2.company + car2.model);
		Car car3 = new Car("니로","검정",260);
		car3.setCompany("KIA");
		System.out.println(car3.color + car3.maxSpeed + car3.company + car3.model);
	}

}
