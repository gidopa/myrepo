import java.util.Arrays;
public class Arr02 {

	public static void main(String[] args) {
		double[] num = {9.5, 7.0, 13.6, 7.5, 10.0};
		double max = num[0];
			for(int i=1;i<num.length;i++) {
				if(max>num[i]) {
					max = max;
				}else {
					max = num[i];
				}
			}
			System.out.println(max);
		
		double[] num1 = {9.5, 7.0, 13.6, 7.5, 10.0};
		Arrays.sort(num1);
		double max1 = num1[num1.length-1];
		System.out.println(max1);
	}

}
