package 백준;

import java.util.Scanner;

public class Prob1002 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		int T = Scan.nextInt();
		for (int i = 0; i < T; i++) {
			int x1 = Scan.nextInt();
			int y1 = Scan.nextInt();
			int r1 = Scan.nextInt();
			int x2 = Scan.nextInt();
			int y2 = Scan.nextInt();
			int r2 = Scan.nextInt();

			System.out.println(tan_point(x1, y1, r1, x2, y2, r2));

		}
	}

	public static int tan_point(int x1, int y1, int r1, int x2, int y2, int r2) {
		int dist_pow = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
// 두 원의 줌심간의 거리를 sqrt를 쓰지않고 int형으로 구함
//r1, r2 로 원과의 거리를 비교하여 위상에 따라 경우 분리
		if (x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		} else if (dist_pow > Math.pow(r2 + r1, 2)) {
			return 0;
		} else if (dist_pow == Math.pow(r2 + r1, 2)) {
			return 1;
		} else if(dist_pow == Math.pow(r2 - r1, 2)){
			return 1;
		} else if (dist_pow < Math.pow(r2 - r1,  2)) {
			return 0;
		} else {
			return 2;
		}
		// 접점의 개수에따라 경우를 분리하여 해당 경우에 따라 점점의 개수 반환
		
	}
}
