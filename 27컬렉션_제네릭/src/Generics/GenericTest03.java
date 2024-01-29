package Generics;

//Test02의 Object형으로 클래스를 설계함으로써 생기는 단점(업/다운 캐스팅)을 없애려고 제네릭 사용
public class GenericTest03 {

	public static void main(String[] args) {
		GenericClass<String> gc = new GenericClass<String>();
		gc.setMember("apple");
		System.out.println(gc.getMember().charAt(3));
		GenericClass<Integer> gc1 = new GenericClass<Integer>();
		gc1.setMember(10);
		System.out.println(gc1.getMember());
		
		Tv tv = new Tv();
		Car car = new Car();
		Product<Tv,String> product = new Product<Tv,String>();
		product.setKind(tv);
		product.setModel("OLED 73\"");
		tv = product.getKind();
		String tvModel = product.getModel();
		System.out.println(product.getKind());
		System.out.println(tvModel);
		
		Product<Car,String> product2 = new Product<>();
		HomeAgency ha = new HomeAgency();
		Home home = ha.rent();
		home.turnOnLight();
		
		CarAgency ca = new CarAgency();
		Car2 car2 = ca.rent();
		car2.run();
	}

}
class  GenericClass<T>{
	private T member;
	
	public void setMember(T member) {
		this.member=member;
	}
	public T getMember() {
		return this.member;
	}
}

class Product<K, V>{
	private K kind;
	private V model;
	
	public K getKind() {
		return this.kind;
	}
	public V getModel() {
		return this.model;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public void setModel(V model) {
		this.model = model;
	}
}

class Tv{}
class Car{}
interface Rentable<P>{
	P rent();
}

class Home {
	public void turnOnLight() {
		System.out.println("불킴");
	}
	
}
class Car2{
	public void run() {
		System.out.println("달림");
	}
}
class HomeAgency implements Rentable<Home>{

	@Override
	public Home rent() {
		return new Home();
	}
	
}
class CarAgency implements Rentable<Car2>{

	@Override
	public Car2 rent() {
		return new Car2();
	}
	
}



