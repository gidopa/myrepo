import java.util.Arrays;
public class Arr02 {

	public static void main(String[] args) {
		double[] num = {9.5, 7.0, 13.6, 7.5, 10.0};
		double max = num[0];
			for(int i=1;i<num.length;i++) {
				if(max>num[i]) {
					max = max;
				}else {
					max = num[i];		// max =9.5 인 상태에서 num을 돌면서 max보다 큰 값이 존재하면 max에 그 값을 넣음
				}
			}
			System.out.println(max);
		
		double[] num1 = {9.5, 7.0, 13.6, 7.5, 10.0};
		Arrays.sort(num1);				
		double max1 = num1[num1.length-1];		// 배열을 정렬한뒤 마지막 index-1로 최댓값을 구함
		System.out.println(max1);
	}

}
