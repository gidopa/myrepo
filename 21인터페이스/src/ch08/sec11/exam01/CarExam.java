package ch08.sec11.exam01;

public class CarExam {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		myCar.tire1 = new KumhoTire();
		myCar.run();
	}

}
interface Tire{
	void roll();
}

class HankookTire implements Tire{

	@Override
	public void roll() {
		System.out.println("한국타이어 굴러감");
	}
	
}
class KumhoTire implements Tire{

	@Override
	public void roll() {
		System.out.println("금호타이어 굴러감");
	}
	
}
class Car{
	Tire tire1 = new HankookTire();
	Tire tire2 = new KumhoTire();
	
	void run() {
		this.tire1.roll();
		this.tire2.roll();
	}
}
