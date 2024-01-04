
public class class_prac {

	public static void main(String[] args) {
		Car bmw = new Car();
		bmw.model = "m4";
		StringBuilder sb = new StringBuilder();
		int a = 3;
		int b = 4;
		sb.append("Hello");
		sb.append("World!");
		sb.insert(5,"Beautiful");
		sb.delete(5, 14);
	
	
		System.out.println(sb);
		char d = '3';
		System.out.println((char)d);
				
	}

}

class Car{
	String model;
	boolean power;
	int speed;
	int col;
	
	void power() {
		power = !power;
	}
	void speedUp() {
		speed ++;
		System.out.println("현재 속도 : "+speed);
	}
	void speedDown() {
		speed--;
		System.out.println("현재 속도 : "+speed);
	}
	void sideBreak() {
		speed = 0;
		System.out.println("현재 속도 : "+speed);
	}
	
	
	
	
}
