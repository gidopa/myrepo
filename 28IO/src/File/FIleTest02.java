package File;

import java.io.File;

//현재 디렉토리 내부의 파일 및 폴더 목록 출력
public class FIleTest02 {

	public static void main(String[] args) {
		//현재 디렉토리에 접근하기 위해 File의 객체생성
		File fileDir = new File(".");
		//현지 디렉토리에 만들어져있는 파일명들을 String[]으로 얻어오기
		String[] fileList = fileDir.list();
		for(int i=0;i<fileList.length;i++) {
			System.out.println(fileList[i]);
		}
		//d.java파일에 접근하기 위해 File의 객체 생성
		//관리자 권한이 필요한 삭제는 이클립스가 관리자 권한으로 실행되어야 함 
		File file = new File("C:\\a\\d.java");
		if(file.delete() ) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
		// 만들어져 있지 않은 b디렉토리를 a디렉토리 내부에 생성
		File file2 = new File("C:\\a\\b");
		file2.mkdir();
		//File 클래스의 mkdirs()메소드는 생성자로 전달한 경로의 디렉토리를 다 만들어준다
		file2.mkdirs();
		//지정한 경로에 isFile() 파일이 있으면 true 디렉토리면 false 반환
		//isDriectory도 있음
		if(file2.isFile()) {
			System.out.println("파일임");
		}else {
			System.out.println("아님");
		}
		
		if(file2.isDirectory()) {
			System.out.println("dir임");
		}else {
			System.out.println("아님");
		}
	}

}
