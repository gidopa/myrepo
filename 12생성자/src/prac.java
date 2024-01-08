
public class prac {

	public static void main(String[] args) {
		Car c1 = new Car("Black");
		System.out.println(c1.gearType);
	}

}

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		color = "white";
		gearType = "auto";
		door = 4;
	}
	Car(String color){
		this.color = color;
		this.gearType = "auto";
		this.door = 4;
		
	}
	
	Car(Car c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
