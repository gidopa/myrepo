package Shop;
import java.util.ArrayList;

public class CustomerTest1 {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer cusLee = new Customer(10010,"이순신");
		Customer cusShin = new Customer(10011,"신사임당");
		GoldCustomer cusHong = new GoldCustomer(10012,"홍길동");
		GoldCustomer cusYul = new GoldCustomer(10013,"율곡");
		VIPCustomer cusKim = new VIPCustomer(10014,"김유신",12345);
		
		customerList.add(cusLee);
		customerList.add(cusShin);
		customerList.add(cusHong);
		customerList.add(cusYul);
		customerList.add(cusKim);
		
		for(Customer customer : customerList){
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 10000;
		for(Customer customer : customerList){
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "를 지불하셨습니다");
			System.out.println(customer.showCustomerInfo());
		}
		
		
	}

}
