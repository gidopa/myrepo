// 1~10 3의 배수만 제외하고 출력
/*
 	반복문{
 		....
 		continue;
 		....
 }
 */

public class F02 {

	public static void main(String[] args) {
		for(int i=1;i<11;i++) {
			if(i%3 ==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
