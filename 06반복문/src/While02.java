
public class While02 {
	public static void main(String[] args) {
		int cnt =0;
		int i=0;
		while(i<11) {
			i++;
			if(i%2==0) {
				cnt += i;
			}
		}
		System.out.println(cnt);
		while (i<11) {
			i += 2;
			cnt += i;
		}
		System.out.println(cnt);
		// 다시 초기화
		
		while(true) {
			i++;
			if(i>10) {
				break;
			}
			
			else if(i%2==0) {
				cnt += i;
			}
		}
		System.out.println(cnt);
	}
}
// break 문의 위치가 i++를 하고 그다음 검사해야 제대로 튀어나옴