
public class While01 {
	public static void main(String[] args) {
		int cnt =1;
		while(cnt != 6) {
			cnt++;
			for(int i=1;i<6;i++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		int j=0;
		while(true) {
			j++;
			if(j==6) {
				break;
			}else {
				System.out.println(j);
			}
			
		}
	
	}
}
