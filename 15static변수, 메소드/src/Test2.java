
public class Test2 {

	public static void main(String[] args) {
		Product.modelName = "쉽게 배우는 자바";
		Product.unitPrice = 33000;
		
		Product.print();
		Product.print("쉽게 배우는 자바", 33000);
		                                    
		Customer customer = new Customer(31);
		Customer customer2 = new Customer(33);
		
		customer.name="재벌1세";
		customer2.name = "재벌2세";
		customer.print();
		customer2.print();
	}

}

class Product{
	static String modelName;
	static int unitPrice;
	
	static void print(String modelName, int unitPrice) {
		System.out.println(modelName +" , "+unitPrice);
	}
	
	static void print() {
		System.out.println(modelName +" , "+unitPrice);
	}
}

class Customer{
	String name;
	int age;
	
	Customer(String name){
		this(name,0);
	}
	
	Customer(int age){
		this("null",age);
		
	}
	Customer(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void print() {
		System.out.println(name + "," + age);
	}
	
}