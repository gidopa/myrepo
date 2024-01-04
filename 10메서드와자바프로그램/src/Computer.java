
public class Computer {
	
	//전원을 켭니다 라고 출력하는 기능의  powerOn메소드 만들기
	//특징 : 이메소드는 "전원을 켭니다" 라고 출력만 하고 값을 되돌려주지는 않습니다
	public static void powerOn() {		
		System.out.println("전원을 켭니다");		
	}
	
	//전원을 끕니다 라고 출력하는 기능의 powerOff()메소드 만들기
	//특징 : 이 메소드는 "전원을 끕니다" 라고 출력만 하고 메소드를 호출한 코드줄로 값을 되돌려주지는 않습니다
	public static void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	//두개 정수값을 매개변수로 전달 받아 합의 결과값을 리턴하는 기능의 plus메소드 만들기
	//특징 : 메소드를 호출한 코드줄로 전달받은 두정수의 합을 되돌려 줍니다.
	public static int plus(int x, int y) {
						//		5,    6
		 return x + y;
	}
	
	//두개의 정수값을 매개변수로 전달 받아 나눈 몫의 결과값을 double실수값으로 리턴하는 기능의 
	//divide메소드 만들기
	public static double divide(int x, int y) {
								// 10,    4
		
		double result = (double)x       /   (double)y;
//						(double)10      /   (double)4;
//			   2.5	  =		10.0		/     4.0;
							
		return result; //result변수에 저장된 나눈연산 결과를 리턴 
		//      2.5;
	}
	
	
	public static void main(String[] args) {

		powerOn();//"전원을 켭니다" 라고 출력하는 기능을 사용하기 위해 메소드 호출
		powerOff();//"전원을 끕니다" 라고 출력하는 기능을 사용하기 위해 메소드 호출
		
		//5와 6의 합을 계산해서 제공 받기 위해
		//위에 만들어 놓은 plus메소드 호출시~ 매개변수로 5와 6을 전달 하면
		//5 + 6 연산한 결과값 11을 제공 받습니다
		int result1 = plus(5, 6);
		
		System.out.println("result1변수에 저장된 값 : " + result1);
		
		//10 / 4 나눗셈의 결과를 계산해서 제공 받기 위해
		//위에 만들어 놓은 메소드 중에서  divide메소드 호출시~ 10과 4를 전달 하면
		//10을 10.0으로 변경시키고,  4를 4.0으로 변경시켜  나눈 결과값 2.5를 제공받습니다
		
		int x = 10,  y = 4;
		
		
		double result2 = divide(x, y);
			   //2.5           //10,4
		
		System.out.println("result2변수에 저장된 값 : " + result2);
	}

	
	
	
	
}







