
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	
		System.out.println("Phone Numb : ");

		Scanner scan = new Scanner(System.in);
		String strMsg;
		while(true) {
			strMsg = scan.nextLine();

			System.out.println(strMsg);
			if (strMsg.equals("exit")) {
				break;
			}
		}
		scan.close();
	}
}
