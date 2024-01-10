
public class Ex4 {
	static int[] arr = new int[10];
	
	static {
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10+1);
		}
	}
	public static void main(String[] args) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"] : "+arr[i]);
		}
	}

}

class InitTest{
	// 전역변수(클래스, 인스턴스변수)
	// 따로 초기화 하지 않아도 자료형에 맞는 디폴트값으로 초기화
	int x;
	int y = x;
	
	void method1() {
		// 지역변수(메소드 내부의 변수)
		// 초기화해서 사용해야 함. 디폴트값 초기화 x
		int i = 0;
		int j = i;
	}
}
