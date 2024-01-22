package StringTokenizer;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Ex2 {

	public static void main(String[] args) {
		String data = "홍길동&이수홍,박연수 김자바-최영호";
		String[] names = data.split("&|,|-| ");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println();
		for(String values : names) {
			System.out.println(values);
		}
		System.out.println();
		StringTokenizer st = new StringTokenizer(data,"&, -");
//		String a = st.nextToken();
//		String b = st.nextToken();
//		String c = st.nextToken();
//		String d = st.nextToken();
//		String e = st.nextToken();
		System.out.println(st.countTokens());
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
		// 여기서 nextToken()으로 토큰이 빠지면 countTokens의 값도 같이 줄어들기때문에 
		// i<st.countTokens()로하면 제대로 반복하지 못함.
		// 위처럼 while문으로 돌리는게 정확함.
		for(int i=0;i<st.countTokens()+5;i++) {
			System.out.println(st.nextToken());
		}
	}

}
