// 
public class Ex2 {

	public static void main(String[] args) {
		BB bbb = new BB();
		BB bb = new BB(3);
		
	}

}

class AA{
	public AA() {
		System.out.println("기본생성자 AA");
	}
	public AA(int x) {
		System.out.println("x를 받는 생성자AA");
	}
}

class BB extends AA{
	public BB() {
		System.out.println("기본생성자 BB");
	}
	public BB(int x) {
		System.out.println("x를 받는 생성자BB");
	}
}