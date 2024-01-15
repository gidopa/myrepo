/*
	메소드 오버라이딩시 상속되지 않고 은닉된 부모클래스의 메소드와 같이
	슈퍼클래스에 정의된 변수와 같은 이름을 가진 변수를 서브클래스에서 선언할 수 있는데
	이러한 경우에도 부모클래스의 변수는 자식클래스에서 사용할 수 없게 된다.
*/
public class Ex4 {

	public static void main(String[] args) {
		Point3D point3d = new Point3D();
		point3d.print();
		
	}

}
class Point2D{
	protected int x= 10;
	protected int y = 20;
}
class Point3D extends Point2D{
	protected int x= 40;
	protected int y = 50;
	protected int z= 30;
	
	public void print() {
		System.out.println(x+","+y+","+z);
	}
}
