
public class EX6 {

	public static void main(String[] args) {
		Man man = new Man("홍길동");
		man.getInfo();
		man.getInfo2();
	}

}
class Person{
	int age = 20;
	String name;
	
	public Person(String name){
		this.name = name;
	}
}
class Man extends Person{
	int age = 40; // Person 클래스의 변수 age와  Man 클래스의 변수 age는 이름이 같은변수
	public Man(String name) {
		//Person(부모)생성자는 상속이 안되므로 Man 생성자의 첫행에 super() 구문 명시
		super(name);
		
	}
	public void getInfo() {
		System.out.println("Man객체의 나이 출력 : " + age);
		System.out.println("Person객체의 나이 출력 : " + super.age);
		//Person 객체의 age와 Man 객체의 age 이름이 같음 
		//Person 객체의 age 변수를 출력하고 싶으면 super.age
	}
	public void getInfo2() {
		System.out.println("Person객체의 name 출력 : " + super.name);
		System.out.println("Man객체의 name 출력 : " + this.name);
	}
	
}
