package file;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

//예제 파일 상세정보 얻어 출력하기 
public class FileTest01 {

	public static void main(String[] args) throws IOException{
		File file = null; // File의 객체 메모리 생성해 지정할 변수 선언
		byte[] byteFileName = new byte[100]; // 파일 이름을 입력받아 저장할 배열
		//byte 배열에 읽어온 파일이름을 String으로 변환해 저장
		String fileName ;
		//입력받은 파일이름을 InputStream을 통해 byte배열의 크기만큼 일겅 byte배열에 저장
		//입력받은 값을 byteFileName에 저장
		System.in.read(byteFileName);
		//byteFileName에 저장된 데이터들을 String으로 변환 후 저장하고 양쪽 공백을 제거 후 반환받아 저장
		fileName = new String(byteFileName).trim();
		//입력한 파일명을 이용해 실제 만들어진 파일에 접근하기위해 파일명을 포함한 파일경로명을 file 객체 생성시 생성자로 전달
		file = new File(fileName);
		//File의 객체를 생성해 실제 파일 정보를 얻거나 조작가능
		System.out.println(fileName + "상세 정보 ------");
		System.out.println("파일의 절대 경로 : " + file.getAbsolutePath());
		System.out.println("파일의 상대 경로 : " + file.getPath());
		System.out.println("파일 생성일 : " + new Date(file.lastModified()));
		System.out.println("파일 용량 : " + file.length() + "B");
		System.out.println("파일 이름 : " + file.getName());
		System.out.println("파일을 열어 읽을 수 있는지 : "+ file.canRead());
		System.out.println("파일을 열어 쓸 수 있는지 : " + file.canWrite());
		System.out.println("파일이 저장된 부모 dir 이름 반환 : "+file.getParent());
		System.out.println("파일이 현재 숨겨져 있는 파일인지 : "+file.isHidden());
		
		
	}

}
