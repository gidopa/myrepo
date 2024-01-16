package ch08.sec10.exam02;

public class CastingExam {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();
		Bus bus = (Bus) vehicle;
		bus.checkFare();
	}

}
interface Vehicle{
	void run();
}
class Bus implements Vehicle{
	public void run() {
		System.out.println("달림");
	}
	public void checkFare() {
		System.out.println("승차요금 확인");
	}
}
