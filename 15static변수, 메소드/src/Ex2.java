/*
  클래스 내부의 메소드 종류
  1. 인스턴스 메소드
  static이 붙지 않은 메소드
  2. 클래스 메소드
  static이 붙은 메소드
*/
public class Ex2 {

	public static void main(String[] args) {
		AAA.setStaticNum(3);
		System.out.println(AAA.getStaticNum());
		AAA a = new AAA();
		System.out.println(AAA.staticNum);
		System.out.println(a.getStaticNum());
	}

}

class AAA{
	int num;
	static int staticNum;
	AAA(){}
	
	void add(int num) {
		this.num += num;
		staticNum += num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
// 클래스 메소드
// 클래스 메소드 안에서는 인스턴스 변수의 값을 변경하지 못함
// 인스턴스가 생성되지 않았을때는 인스턴스 변수또한 없음
	public static int getStaticNum() {
		return staticNum;
	}

	public static void setStaticNum(int staticNum) {
		AAA.staticNum = staticNum;
	}
	
}