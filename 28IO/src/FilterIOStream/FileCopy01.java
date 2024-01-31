package FilterIOStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class FileCopy01 {
	//입출력할 데이터를 수용할 만큼의 버퍼크기 설정
	final static int BUFFER_SIZE = 256;
	//cmd창에 입력될것
	//java FileCopy01 원본파일명 복사파일명
	public static void main(String[] args) {
		int i=0;
		int len = 0;
		//정보를 저장하거나 내보낼 버퍼 생성
		byte[] buffer = new byte[BUFFER_SIZE];
		if(args.length<2) {
			System.out.println("java FileCopy01 원본파일명 복사파일명 을 입력하세요");
			System.exit(0);
		}
		try {
			//원본파일에서 데이터를 읽어올 inputStream 만들기
			FileInputStream fis = new FileInputStream(new File(args[0]));
			//원본파일의 데이터를 256바이트단위로 읽어와 BufferedInputStream 내부 기본 버퍼메모리에
			//512바이트 공간에 저장해 두었다가 512바이트 크기의 데이터를 한번에 읽어오기위해 BufferedInputStream 생성
			BufferedInputStream bis = new BufferedInputStream(fis);
			bis.read(buffer);
			
			//복사될 파일에 읽어들인 데이터를 출력하기 위해 FileOutputStream객체 생성 후 내부 버퍼 메모리 공간에 모아뒀다
			//512바이트씩 출력하기위한 출력스트림 객체 BufferedOutputStream 객체 생성
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(args[1])));
			//buffer 배열을 read()의 매개변수로 전달하면 buffer의 크기 만큼 원본파일의 데이터에서 읽어와
			//buufer 배열에 저장, 그리고 읽어들인 256바이트 크기만큼의 int로 형변환해서반환
			//반환값이 -1 이면 읽어들일 데이터가 없다는 뜻
			while((i=bis.read(buffer))!= -1) {
			//256바이트씩 읽어와 512바이트 크기의 버퍼메모리를 가지는 BufferedOutputStream 객체 내부의 버퍼메모리에 모아뒀다
			// 복사될 파일에 512바이트 단위로 쓴다
				bos.write(buffer);
			//512바이트 버퍼메모리가 가득차지 않았을때 강제로 복사된 파일에 읽어들인 만큼만 쓰기
				bos.flush();
				len += i;
				System.out.println("process : read[" + i + "," + len+"], avail{" + bis.available() + "]");
			}
			bis.close();
			bos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
