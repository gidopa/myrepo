//무한 loop
// 반드시 break으로 나오는 구문을 넣어야 함
public class F03 {

	public static void main(String[] args) {
		int i=0;
		while(true) {
			i++;
			System.out.println(i);
			if(i>5) {
				break;
			}
		}
	}

}
