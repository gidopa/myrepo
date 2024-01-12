
public class prob6_23 {

	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최댓값 : "+ max(data));
		System.out.println("최댓값 : "+ max(null));
		System.out.println("최댓값 : "+ max(new int[] {}));
	}
	public static int max(int[] arr) {
		int max = 0;
		if(arr==null || arr.length==0) {
			return -9999;
		}
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max = arr[i];				값 비교해가며 max 탐색
//			}
		java.util.Arrays.sort(arr);		//  arr sorting하고 마지막 index 가져오기
		return arr[arr.length-1];
	}
}
