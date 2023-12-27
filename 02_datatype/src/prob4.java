
public class prob4 {
	public static void main(String[] args) {
		
		People Alice = new People();
		Alice.age = 7;
		Alice.height = 118;
		Alice.parent = false;
		Alice.hearchDease = false;
		
		if ((Alice.age >= 6 || Alice.parent == true) && Alice.height >=120 && Alice.hearchDease == false) {
			System.out.println("pass");
		} else {
			System.out.println("Not pass");
		}
		
		
	}
	
}
class People{
	int age;
	int height;
	boolean parent;
	boolean hearchDease;
}

