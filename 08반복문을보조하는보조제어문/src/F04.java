//for 를 이용한 무한루프
/*
 for(;;){
 
 }
 무한루프
 */
public class F04 {

	public static void main(String[] args) {
		int i = 0;
		for(;;) {
			if(i>5) {
				break;
			}
			i++;
			System.out.println(i);
		}
	}

}
