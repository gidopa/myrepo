package ch08.sec11.exam02;

public class Driver {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi); 
	}
	void drive(Vehicle vehicle) {
		vehicle.run();
	}

}
interface Vehicle{
	void run();
}

class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 간다");
	}
	
}
class Taxi implements Vehicle{

	@Override
	public void run() {
		System.out.println("택시가 간다");
	}
	
}


	
