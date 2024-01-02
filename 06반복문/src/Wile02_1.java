
public class Wile02_1 {

	public static void main(String[] args) {
		int cnt = 0;
		int i = 0;
//		while(true) {
//			i++;
//			if(i%2==0) {
//				cnt += i;
//			}else if(i>10) {
//				break;
//			}
//			
//		}
		while (true) {
			
			i += 2;
			if (i > 10) {
				break;
			}
			cnt += i;

		}
		System.out.println(cnt);
	}

}
