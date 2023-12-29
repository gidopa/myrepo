
public class For03 {
	public static void main(String[] args) {
		int i=0;
		for(i=1;i<11;i++){
			System.out.println("i : " + i);
		}
		for(i=1;i<11;i+=2) {
			System.out.println("i.odd : "+i);
		}
		for(i=2;i<11;i+=2) {
			System.out.println("i.even : "+i);
		}
		for(i=10;i>0;i--) {
			System.out.println("i.reverse : " + i);

		}
		System.out.println('A' + 'B');
	}

}
