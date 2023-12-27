/*
 * 논리 연산자 -> 논리식을 판단하여 참,거짓을 결정하는 연산자
 * 논리 연산자 종류
 * && 
 * || 
 * !(논리 낫 연산자) 참이면 거짓, 거짓이면 참 반환 단항 연산자이며 피연산자 결합 방향 -> 오른쪽에서 왼쪽
 * ^(XOR) 논리적 배타합 -> 하나의 값만 true일 경우 true 반환
 * 
 * 		A		 B	     A && B		 A || B		 A ^ B			 !A         !B
 * 	   true	    true	  true		  true		 false	 	    false      false
 * 	   true     false     false	      true       true 		 	false      true
 * 	   false	true	  false		  true       true 			true       false
 * 	   false	false	  true		  false	     flase 			true       true
 */
public class Opr04 {

	public static void main(String[] args) {
		
		int age = 29;
		// 자바에서 특정 범위에 속하는 값인지 물어보기 위해 && 사용
		String str = (age>=10 && age<20) ? "10대" : "10대 아님";
		System.out.println(age + "살은 " + str);
		
	}

}
