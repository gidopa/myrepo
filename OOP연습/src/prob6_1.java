
public class prob6_1 {

	public static void main(String[] args) {
		
		
	}

}
class SutdaCard{
	int num;
	boolean isKwang;
	
	public SutdaCard() {
		this(1,true);
	}
	public SutdaCard(int num,boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		return num + (isKwang ? "K" : "");
	}
}
