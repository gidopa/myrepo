package Input_output;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


// 주제 : 바이트 출력 스트림 PrintStream
public class IOTest0A {

	public static void main(String[] args) throws IOException{
		//입력받은 데이터 중에서 한 바이트만 입력스트림으로부터 얻어와 저장할 변수
		int data = 0;
		System.out.println("문자를 입력하세요 : ");
		try {
			OutputStream myOut = System.out;
			// 입력된 데이터를 입력스트림을 통해 한 바이트씩 읽어옴, 한 바이트씩 읽어온 데이터가 있으면 게속
			while((data = System.in.read()) != -1) {
				// 입력받은 데이터는 입력스트림에 저장되어 있기 떄문에 입력스트림에 저장된 데이터를 1바이트씩 가져와 
				// 출력할 출력스트림 PrintStream의 write메소드를 호출해 한번 읽어들인 한바이트를 내보냄
				myOut.write((char)data);
				//write메소드 
				//void write(int b) <- 1바이트를 출력
				//void write(byte[] b) <- b로 전달한 byte 배열 크기 만큼 한번 출력
				//void write(byte[] b, int off, int len) <- b로 전달한 byte배열에 저장된 byte 데이터중 off부터 len만큼			
				
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
