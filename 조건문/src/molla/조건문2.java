package molla;

public class 조건문2 {
	public static void main(String[] args) {
		int month =3;
		switch(month) {
			case 0:
				System.out.println("수강등록");
				break;
			case 1:
				System.out.println("프로그래밍기초");
				break;
			case 3: 
				System.out.println("웹 프로그래밍");
				break;
			case 4:
				System.out.println("머신러닝");
				break;
			default :
				System.out.println("프로젝트!!");
			
		}
	}
}
