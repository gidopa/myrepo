
public class prob6_6 {

	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
	static double getDistance(int x, int y, int x1, int y1) {
		double dist = Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1,2));
		return dist;
	}
}
