package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;

// 윈도우 os에서 제공하는 파일을 복사하는 copy프로그램 만들기
public class FileCopy {
	// java FileCopy 원본파일 복사파일
	public static void main(String[] args)throws Exception {
		int data = 0;
		int size = 0;
		// 복사될 파일명을 입력하지 않았다면
		if(args.length<2) {
			System.out.println("java FileCopy 원본파일명 복사파일명 을 입력하세요");
			System.exit(0);
		}
		//원본파일명을 이용해 원본파일의 내용을 읽어올 fis 생성
		FileInputStream fis = new FileInputStream(args[0]);
		//복사파일명을 이용해 복사파일에 내용을 쓸 fos 생성
		FileOutputStream fos = new FileOutputStream(args[1]);
		while((data=fis.read())!= -1) {
			fos.write(data);
			size++;
		}
		fis.close();
		fos.close();
		System.out.println(size);
	}

}
