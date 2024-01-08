
public class Point {

	int x;
	int y;
	public Point() {
		System.out.println("기본 생성자 호출!");
		x = 2;
		y = 2;
	}
	Point(int x){
		this.x = x;
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	void setX(int x) {
		this.x = x;
	}
	void setY(int y) {
		this.y=y;
	}
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
	void prn() {
		System.out.println("x, y : " + "( "+x +" , "+ y+" )");
	}
	String getCoord(Point c) {
		return "("+c.x+" , "+c.y+")";
	}
	double dist(Point d) {
		int xDiff = this.x - d.x;
		int yDiff = this.y - d.y;
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}
	public static void main(String[] args) {
		Point point = new Point();
		System.out.println("멤버변수 x = "+ point.getX());
		System.out.println("멤버변수 x = "+ point.getY());
		point.prn();
		System.out.println(point.getCoord(point));
		Point point2 = new Point (5,6);
		System.out.println(point.dist(point2));
		Point point3 = new Point(300);
		point3.prn();
	}

}
