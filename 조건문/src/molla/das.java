package molla;

import java.util.Scanner;
public class das {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
		String grade="";
		switch(score/10) {
		case 10: 
			grade = "A";
			break;
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		}
		System.out.println("당신은 " + grade + "입니다");
		
		
	}
}
