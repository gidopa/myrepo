/*
	클래스변수의 초기화 순서: 기본값 저장 -> 명시적 초기화 -> 클래스 초기화 블럭
	인스턴스 변수의 초기화 순서 : 기본값 저장 -> 명시적 초기화 -> 인스턴스 초기화 블럭 -> 생성자
*/
public class Init {
	static int cv = 1;
	int iv =1;
	static {
		cv = 2;
	}
	{
		iv = 2;
	}
	Init(){
		iv = 3;
	}
	public static void main(String[] args) {
		Init init = new Init();
		System.out.println(init.iv);
		System.out.println(cv);
	}

}
