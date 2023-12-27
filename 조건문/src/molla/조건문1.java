package molla;

import java.util.Scanner;

public class 조건문1 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String Num = scan.nextLine();
	int intNum = Integer.parseInt(Num);
	if(intNum % 2 == 0 ) {
		System.out.println("짝수");
	}else {
		System.out.println("홀수");
	}
	}
}
