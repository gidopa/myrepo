package ObjectClass;
//주제 : Object클래스의 toString 메소드를 오버라이딩한 새로운 자식 Point클래스 만들어 사용

public class ObjectTest {

	public static void main(String[] args) {
		Point p = new Point(10,20);
		System.out.println(p.toString());
		//참조변수명만 기술하면 toString()이 생략이 가능함
		System.out.println(p);
	}

}
// 좌표값을 저장하는 용도로 사용
class Point {
	private int x;
	private int y;
	
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	@Override
	public String toString() {
		return  "(" + this.x +", " + this.y+")";
	}
	
}
