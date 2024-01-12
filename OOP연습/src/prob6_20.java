
public class prob6_20 {

	public static void main(String[] args) {
		
		int[] original = {1,2,3,4,5,6,7,8,9};
		int[] res = shuffle(original);
		System.out.println(java.util.Arrays.toString(res));
		
	}

	public static int[] shuffle(int[] arr) {
		int temp=0;
		for(int i =1;i<9;i++) {
			temp=arr[i];
			int ch = (int)(Math.random()*9+1);
			arr[i]=arr[ch];
			arr[ch]=temp;
		}
		return arr;
	}
}


