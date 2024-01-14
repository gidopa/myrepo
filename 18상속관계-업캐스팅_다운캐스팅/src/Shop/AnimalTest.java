package Shop;

public class AnimalTest {

	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());

	}

	public void moveAnimal(Animal animal) {
		animal.move();

		if (animal instanceof Human) {
			Human human = (Human) animal;
			human.readBook();
		} else if (animal instanceof Tiger) {
			Tiger tiger = (Tiger) animal;
			tiger.hunting();
		} else if (animal instanceof Eagle) {
			Eagle eagle = (Eagle) animal;
			eagle.fly();
		}else {
			System.out.println("지원되지 않는 기능");
			}
		}
	}

	class Animal {
		public void move() {
			System.out.println("동물이 움직임");
		}

	}

	class Human extends Animal {
		public void move() {
			System.out.println("사람이 움직임");
		}

		public void readBook() {
			System.out.println("책을 읽음");
		}
	}

	class Tiger extends Animal {
		public void move() {
			System.out.println("호랑이가 움직임");
		}

		public void hunting() {
			System.out.println("사냥함");
		}
	}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 움직임");
	}
	public void fly() {
		System.out.println("남");
	}
}
