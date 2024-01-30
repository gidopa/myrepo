package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//주제 : 파일명을 입력받아 파일내용을 읽어와 출력
public class FileType01 {
		//cmd 창에 입력되는 것
		//java FileType01 FileTest02.java
		//
	public static void main(String[] args) {
		int data = 0;
		int size = 0;
		//cmd에 파일명을 하나만 입력했다면 ? 
		if(args.length<1){
			//입력받는 방법을 알려주기위해 메시지 출력
			System.out.println("java FileType01 읽을파일명");
			//FIleType01.class 프로그램 강종
			System.exit(0);
		}
		//cmd 창에서 입력한 첫번째 파일명을 문자열로 저장
		String path = args[0];
		System.out.println("?"+path);
		
		try {
			File f = new File(path); 
			FileInputStream fis = new FileInputStream(f);
			while((data = fis.read()) != -1) {
				System.out.write(data);
				//print메소드로 출력하면 한글일 경우 깨지기 때문에 write 사용
				size++;
				//읽어들여 출력할때마다 문자의 갯수를 count
			}
			System.out.println("파일크기 : "+size+"B");
		} catch (FileNotFoundException e) {
			System.out.println("지정된 파일 찾을 수 없음");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("지정된 파일에서 데이터 읽어올 수 없음");
			e.printStackTrace();
		}
	}

}
