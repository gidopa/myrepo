
import java.util.Scanner;

public class switch_exam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴를 주문하세요");
		String order = scan.nextLine();
		
		
		switch(order) {
		case "아아","아이스아메리카노":
			System.out.println("3000원");
			break;
		case "라떼":
			System.out.println("4500원");
			break;
		case "에스프레소":
			System.out.println("2500원");
			break;
		default :
			System.out.println("메뉴가 없습니다");
		}
	}

}
