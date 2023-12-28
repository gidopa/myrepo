/*
 대입연산자
  - 변수에 값을 대입할 때 사용하는 이항 연산자
 	피연산자들의 결합 방향은 오른쪽에서 왼쪽  
 	= 
 복합대입연산자
 -	산술연산자와 대입연산자를 결합
 	+=, -=, *=, /=, %=
 */
public class Opr05 {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(n);
		n += 10;
		System.out.println(n);
		n -= 10;
		System.out.println(n);
	}
}
