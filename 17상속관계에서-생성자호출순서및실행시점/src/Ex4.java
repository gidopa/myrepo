
public class Ex4 {

	public static void main(String[] args) {
		G g = new G(3);
	}

}
class F{
	public F() {
		System.out.println("기본생성자 F");
	}
	public F(int x) {
		System.out.println("x를 받는 생성자F");
	}
}
class G extends F{
	public G() {
		System.out.println("기본생성자 G");
	}
	public G(int x) {
		System.out.println("x를 받는 생성자G");
	}
}
