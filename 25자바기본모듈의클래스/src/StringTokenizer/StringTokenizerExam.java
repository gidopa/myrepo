package StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExam {

	public static void main(String[] args) {
		String data = "홍길동 이수홍 김민철";
		StringTokenizer st = new StringTokenizer(data, " ");
		String a = st.nextToken();
		String b = st.nextToken();
		String c = st.nextToken();
		System.out.println(a + b );
		String[] names = data.split(" ");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
	}

}
