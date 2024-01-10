// 코드를 재활용하는 상속의 장점
/*
 상속에 의해 코드가 어떻게 재활용되는지
*/
public class Ex2 {

	public static void main(String[] args) {
		point3D p3 = new point3D();
		p3.setX(3);
		p3.setY(4);
		p3.setZ(5);
		System.out.println(p3.getX());
		System.out.println(p3.getY());
		System.out.println(p3.getZ());
		
		
	}

}
class point2D{
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}

class point3D extends point2D{
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
}
