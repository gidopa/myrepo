// (x,y)의 한점을 표현하는 Point  클래스와 이를 상속받아 색을 추가한 ColorPoint 클래스 


public class ColorPointEx {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("Black"); 
		cp.showColorPoint();
		Point p = new Point();
		p.set(4, 5);
		p.showPoint();
	
	}

}
class Point{
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}

}

class ColorPoint extends Point{
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
//		System.out.println("("+getX()+","+getY()+")"+" Color : "+ color);
		showPoint(); 
		System.out.println("color : "+ color);
	}
	
}
