
public class prob6_20 {

	public static void main(String[] args) {
		
		int[] original = {1,2,3,4,5,6,7,8,9};
		int[] res = shuffle(original);
		System.out.println(java.util.Arrays.toString(shuffle(original)));
		
	}

	public static int[] shuffle(int[] arr) {
		
		for(int i =0;i<arr.length;i++) {
			int temp=arr[i];
			int ch = (int)(Math.random()*arr.length);//
			arr[i]=arr[ch];
			arr[ch]=temp;
		}
		return arr;
	}
}


