import lombok.AllArgsConstructor;

public class Test1 {

	public static void main(String[] args) {
		BooleanWrapper b = new BooleanWrapper(true);
		showData(b);
	}
	public static void showData(Object obj) {
		System.out.println(obj.toString());
	}

}
@AllArgsConstructor
class BooleanWrapper{
	private boolean b;
	
	public String toString() {
		return ""+this.b;
	}
}
