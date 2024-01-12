
public class prob6_7 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		System.out.println(p.getDistance(2,2));
	}

}
class MyPoint{
	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	double getDistance(int x, int y) {
		double dist = Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
		return dist;
	}
}
