/*
	생성자?
	-객체 메모리 생성 시 단 한번만 호출되는 메소드.
	-객체 메모리 생성하는 동시에 객체 내부의 변수 값 한번 초기화
	-생성자 규칙
	1. 클래스명과 동일하게 생성자명 사용
	2. 클래스내에서 선언
	3. 리턴자료형 작성 X
	4. 파라미터가 있을수도있고 없을수도 있음
	   단, 매개변수가 하나도 없는 생성자는 1개는 존재해야함
	   생성자를 하나도 만들지 않으면 기본생성자 자동 생성
	5. 메소드 오버로딩으로 여러개의 생성자를 만들 수 있음
	
	기본생성자는 생성자를 아예 만들지 않았을때만 자동으로 컴파일러가 만들어준다.
	매개변수가 있는 생성자만 만들면 new Number(); 사용 불가능
*/
public class Ex2 {

	public static void main(String[] args) {
		Number num = new Number(5);
		Number n = new Number();
		System.out.println(num.getNum());
		System.out.println(n.getNum());
		System.out.println(new Number(40).getNum());
		
	}

}

class Number{
	int num;
	Number() {
		num =10;
		System.out.println("생성자 호출 !");
	}
	
	
	Number(int n){
		num = n;
	}
	
	int getNum() {
		return num;
	}
		
}
