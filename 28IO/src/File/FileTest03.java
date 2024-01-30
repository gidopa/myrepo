package File;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
	File과 Files클래스
	- java.io , java.nio.fil 패키지는 파일과 디렉토리 정보를 가지는 
	  File과 Files 제공. Files는 File클래스를 개선한 클래스로 더 많은 기능 제공
	  
	  File file = new File("파일경로");
	  파일 경로를 적을때 윈도우는 \\or/   맥, Linux 는 / 
	Files
		-정적메소드로 구성된어 있기때문에 File의 객체생성이 불필요함
		-Files클래스의 static메소드는 os의 파일 시스템에게 파일 작업을 수행하도록 위임
		기능					관련메소드
		복사					copy()
		생성					createDirectories / ceateDirectory / createFile / createLink / createSymbolicLink / createTempDirectory / createTempFile
		이동					move
		삭제					delete, deleteIfExists
		위 메소드들은 Path객체를 리턴함. Path객체는 파일이나 디렉토리를 찾기 위한 경로 정보를 가지는데
		static 메소드인 get()으로 다음과 같이 얻을 수 있다
		Paths.get(String first, String ....) 
		Path path = Paths.get("C:/Temp/dir/file.txt");
		Path path = Paths.get("C:/Temp/dir", "file.txt");
		Path path = Paths.get("C:","Temp","dir","file.txt");
		
		파일의 경로는 절대경로와 상대경로 모두 사용가능
		C:/Temp/dir1 일때 C:/Temp/dir2/file.txt를 간다하면 ?
		../dir2/file.txt
*/
public class FileTest03 {

	public static void main(String[] args)throws IOException {
			String data = "" + "id : winter\n" + "email: winter@mycompany.com\n"
						    	+"tel : 010-1234-1234";
			Path path = Paths.get("C:/Temp/user.txt");
			// 파일 생성 및 데이터 저장
			Files.writeString(Paths.get("C:/Temp/user.txt"), data, Charset.forName("UTF-8"));
			System.out.println("파일 유형 : "+Files.probeContentType(path)); //파일확장자명에 따른 파일유형 리턴
			System.out.println("파일 크기 : "+Files.size(path)+"B");
			
			String content = Files.readString(path, Charset.forName("UTF-8"));
			System.out.println(content);
		
		
		
		
		//C:에 Temp 디렉토리에 images라는 디렉토리와 file1.txt, file2.txt, file3.txt 파일을 생성하고
		//Temp 디렉토리에 있는 내용 출력
		File dir = new File("C:/Temp/images");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		//File객체를 생성해도 실제로 생성되는 것은 아님, 실제로 없어도 예외는 발생 x, 실제로 존재하는지 물어보는 메소드
//		String dirPath = "C:/Temp";
//		for(int i =3; i<5;i++) {
//			String fileName = "file" + i + ".txt";
//			Path filePath = Paths.get(dirPath, fileName);
//			Files.createFile(filePath);
//		}
		
		
		if(dir.exists()==false) {
			dir.mkdirs();
		}
		if(file1.exists()==false) {
			file1.createNewFile();
		}
		if(file2.exists()==false) {
			file2.createNewFile();
		}
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles();
		for(File file : contents) {
			if(file.isDirectory()) {
				System.out.println(file.getName());
			}else {
				System.out.println(file.getName());
			}
		}
		
	}

}
