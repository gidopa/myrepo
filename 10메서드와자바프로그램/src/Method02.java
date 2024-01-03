
public class Method02 {

	public static void main(String[] args) {
		Sum(4,10);

	}
	
	public static int Sum(int x, int y) {
		int sum=0;
		for(int i=x;i<y+1;i++) {	// 파라미터 x부터 파라미터 y까지의 합
			sum += i;
		}
		System.out.println(x+"부터 "+y+"까지의 합 : " + sum);
		
		return sum;
		
	}
}
