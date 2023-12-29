
public class prob7 {

	public static void main(String[] args) {
		int dice = 0;
		int cnt =0;
	while(dice != 6) {
		
		cnt++;
		dice = (int) (Math.random() * 6) + 1;
		System.out.println(dice);
		
	}
	System.out.println("주사위를 굴린 횟수 : "+ cnt);
		}
	

}
