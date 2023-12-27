// 최댓값 구하기
/* 조건 삼항 연산자
 * 조건식을 제시하고 그 조건이 참인 경우와 거짓인 경우에 따라
 * 서로 다른 결과를 반환하는 연산자
 * 
 * 조건식 ? 수식-1 : 수식-2
 * 조건식이 참이면 수식1 조건식이 거짓이면 수식2가 반환
 */
public class Opr03 {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		
		int max = a>b ? a : b;
		System.out.println("max 변수에 저장되어 있는 최댓값 : " + max);
		
		
	}
}
