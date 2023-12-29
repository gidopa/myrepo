
public class prob3 {
	public static void main(String[] args) {
		for (int i=1;i<7;i++) {
			for (int j=1;j<7;j++) {
				if(i+j==6) {
					System.out.printf("합이 6이 되는 주사위 쌍 : (%d, %d)\n",i,j);
				}
			}
		}
	}
}
