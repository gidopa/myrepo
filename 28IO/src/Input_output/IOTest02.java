package Input_output;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//입력된 문자열의 문자 개수 세기
public class IOTest02 {

	public static void main(String[] args)throws IOException {
		int data = 0;
		int cnt = 0; // 문자열의 갯수 카운터
		// 데이터 받을 BufferedInputStream 자식 객체
		InputStream myIn = System.in;
		// 출력장치에 한바이트씩 내보낼 PrintStream자식 객체
		OutputStream myOut = System.out;
		System.out.println("문자를 입력하세요.");
		while((data=myIn.read()) != -1) {
			if(data == 'x' || data == 'X') {
				break;
			}
			cnt++;
			myOut.write(data);
		}
		System.out.println(cnt);
	}

}
