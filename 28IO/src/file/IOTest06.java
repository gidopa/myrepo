package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

// 입력받은 내용을 특정파일에 저장
public class IOTest06 {

	public static void main(String[] args) {
		int data = 0;
		File file = null;
		FileOutputStream out=null;
		InputStream in = null;
		System.out.println("파일에 기록할 내용을 입력하세요");
		System.out.println("현재 디렉토리: " + System.getProperty("user.dir"));

		try {
			file = new File("Test.txt");
			//파일에 쓸거임
			 out = new FileOutputStream(file);
			//키보드로 입력받음
			in = System.in;
			//키보드로부터 입력받은 데이터를 읽어와 Test.txt에 쓰기
			while((data=in.read()) != -1) {
				out.write(data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(out!=null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
