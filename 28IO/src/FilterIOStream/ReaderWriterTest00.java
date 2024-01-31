package FilterIOStream;

import java.io.InputStreamReader;
import java.io.Reader;

//주제 : 문자 스트림으로 키보드로부터 입력한 데이터 읽어와 출력
public class ReaderWriterTest00 {

	public static void main(String[] args) {
		int data = -1;
		//바이트스트림?(한바이트 단위로 읽어들일 입력스트림) System.in
		//문자스트림?(2바이트(한문자))단위로 읽어들이는 입력스트림 new InputStreamreader(Syetem.in)
		//부모문자스트림 Reader타입의 참조변수에 업캐스팅해서 저장
		Reader myIn = new InputStreamReader(System.in);
		try {
			while(true) {
			//변환된 문자스트링 InputStreamReader를 통해 read메소드를 호출하면
			//입력받은 데이터중에서 2바이트의 문자데이터를 한번 읽어들입니다.
			data = myIn.read();
			if(data == -1) {
				break;
			}
			System.out.print((char)data);
			}
		} catch (Exception e) {
			e.printStackTrace();
			}
	}

}
