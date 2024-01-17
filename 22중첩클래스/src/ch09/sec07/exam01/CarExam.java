package ch09.sec07.exam01;

/*
	익명객체?
	이름이 없는 객체 (이름없이 객체 생성), 조건은 부모클래스 또는 부모인터페이스의 메소드를 오버라이딩해서 만든다
	format : new 상속받을부모() {부모메소드 오버라이딩};
	람다식 쓰는 느낌 한 번 쓰고 버릴 객체 
	
*/
public class CarExam {

	public static void main(String[] args) {
		Car car = new Car();
		car.run1();
		car.run2();
		car.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("run3을 돌릴 익명객체");
			}
		});
		car.run3(new Tire());
	}

}

class Tire {
	int a;
	public void roll() {
		System.out.println("굴러감");
	}
	public void anot() {
		System.out.println("다른 메소드");
	}

}

class Car {
	private Tire tire1 = new Tire();
	// new Tire() -> Tire라는 부모클래스의 roll 메소드를 오버라이딩한 새로운 익명자식객체를 만들겠다
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("익명 자식객체의 roll 메소드");
		}
		
		
	};

	public Tire getTire() {
		return tire1;
	}

	public void setTire(Tire tire) {
		this.tire1 = tire;
	}
	
	public void run1() {
		tire2.roll();
		tire1.roll();
	}
	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("run2 메소드에서 익명자식객체 roll()");
			}
		};
		tire.roll();
	}
	public void run3(Tire tire) {
		tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("run3을 돌릴 익명객체");
			}
		};
		tire.roll();
	}

}
