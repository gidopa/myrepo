package chap5;

public class prob5_4 {

	public static void main(String[] args) {
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20,20},
				{30,30,30,30,30,30}
		};
		
		int total = 0 ;
		double average = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<5;j++) {
				total += arr[i][j];
			}
		}
		average = total / 20.0;
		System.out.println(total);
		System.out.println(average);
	}

}
