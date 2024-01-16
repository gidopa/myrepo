package chap5;

public class prob5_5 {

	public static void main(String[] args) {
		int[] ballarr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for(int i=0;i<ballarr.length;i++) {
			int j = (int)(Math.random() * ballarr.length);
			int tmp = 0;
			tmp = ballarr[i];
			ballarr[i]=ballarr[j];
			ballarr[j]=tmp;
			
		}
		for(int i=0;i<ball3.length;i++) {
			ball3[i] = ballarr[i];
		}
		for(int i=0;i<ball3.length;i++) {
			System.out.println(ball3[i]);
		}
	}

}
