package Input_output;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

//예제 키보드로부터 한글자를 입력받아 출력하는 예제
public class IOTest01 {

	public static void main(String[] args) throws IOException {
		// 입력받은 전체 데이터 중에서 1바이트씩 읽어 저장시킬 변수
		int data = 0;
		System.out.println("하나의 문자를 입력하세요. 프로그램을 끝내래면 ctrl + z  ");
		// 입력스트림 InputStream을 구현한 자식 BufferedInputStream@16진수 객체 생성
		InputStream myIn = System.in;
		// 출력스트림 OutputStream의 하위 PrintStream@16진수 객체 생성
		OutputStream myOut = System.out;
		PrintStream printStream = (PrintStream) myOut;
		// 키보드로부터 입력한 데이터를 1바이트 단위로 반복해서 읽어와 모니터에 출력
		while((data = myIn.read()) != -1) {
			printStream.print((char)data);
		}
		
	}
}
