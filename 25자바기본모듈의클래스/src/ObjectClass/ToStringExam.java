package ObjectClass;

public class ToStringExam {

	public static void main(String[] args) {
		SmartPhone myphone = new SmartPhone("Samsung", "Android");
		System.out.println(myphone.toString());
		System.out.println(myphone);
	}

}

class SmartPhone{
	private String company;
	private String os;
	
	public SmartPhone() {
	}

	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {
		return this.company + ", " + this.os;
	}
	
	
	
}
