package FilterIOStream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

// DataOutputStream으로 각 변수에 저장된 데이터들를 파일에 쓰기
// 별로 안중요함
public class DataStreamTest1 {

	public static void main(String[] args) {
		char c = 'a';
		byte b = 10;
		short s = 20;
		int i = 100;
		double d = 1.5;
		String str = "hello";
		
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File("data.txt")));
			dos.writeChar(c);
			dos.writeInt(i);
			dos.writeShort(s);
			// void writeUTF(String str) 매개변수로 전달받은 문자열 객체메모리 내부에 저장된 "hello"라는 문자열을
			// UTF-8방식으로 인코딩해서 출력스트림을 통해 파일에 출력
			dos.writeUTF(str);
			dos.writeDouble(d);
			dos.write(b);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
