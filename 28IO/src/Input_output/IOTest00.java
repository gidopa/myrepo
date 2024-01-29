package Input_output;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//예제 키보드로부터 한글자를 입력받아 출력하는 예제
public class IOTest00 {

	public static void main(String[] args) throws IOException {
		// 입력받은 전체 데이터 중에서 1바이트씩 읽어 저장시킬 변수
		int data = 0;
		System.out.println("하나의 문자를 입력하세요. 프로그램을 끝내래면 ctrl + z  ");
		/*
		 * System.in -> System 클래스 내부에 in 상수에 저장된 InputStream 입력스트림 객체 -> InputStream
		 * 객체는 키보드와 연결된 데이터를 1바이트씩 읽어들일 입력스트림 InputStream 클래스의 read() 메소드 -> 1바이트 크기의
		 * 데이터를 읽어올 메소드 참고. 1. 입력스트림에서 1바이트를 읽음 2. 읽은 바이트 값을 int type으로 반환 반환값은 읽은 바이트의
		 * 정수표현이며 0부터 255사이의 값 입력 스트림 끝에 도달하면 -1반환(더 이상 데이터가 없으면)
		 */

		InputStream input = System.in;
		// 입력받은 데이터에서 1바이트만 읽어 읽어들인 바이트수를 정수로 반환해서 저장
		data = input.read();
		// 입력된 전체 데이터 중에서 읽어들일 데이터가 InputStream에 존재하면 계속 1바이트씩 읽어
		// data 변수에 저장. 1바이트씩 읽어들인 후 바로 모니터에 출력
		while (data != -1) {
			/*
			 * System.out -> System 클래스 내부에 out 상수에 저장된 PrintStream 출력스트림 객체 -> 모니터에 연결되어 있는
			 * 1바이트 단위로 내보내 출력할 출력스트림
			 */
			System.out.print((char) data);
			// 1바이트씩 반복해서 계속 읽어들임
			data = input.read();
		}
	}
}
