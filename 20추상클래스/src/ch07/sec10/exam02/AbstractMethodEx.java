package ch07.sec10.exam02;
/*
	추상메소드
	- 서브클래스들이 가지고 있는 공통 메소드를 뽑아 추상클래스로 작성할때, 메소드 선언부(리턴타입, 메소드명, 매개변수)만 동일하고
	  구현부는 다른 메소드 
*/

public class AbstractMethodEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		Cat cat = new Cat();
		cat.sound();
		AbstractMethodEx.animalSound(new Dog());
		animalSound(cat);
	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
 
abstract class Animal {
	public void breathe() {
		System.out.println("숨을 쉼");
	}

	public abstract void sound(); // 추상클래스내에만 선언

}

class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("멍멍");
	}

}
class Cat extends Animal{

	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
	
}