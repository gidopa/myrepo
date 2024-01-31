package file;
//특정파일에 저장된 내용을 바이트단위로 읽어들여 모니터로 출력
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
public class IOTest03 {

	public static void main(String[] args) throws IOException, FileNotFoundException{
		int data = 0;
		String filePath = "C:\\Users\\605\\git\\myrepo\\27컬렉션_제네릭\\src\\Collection\\Collections01_HashSet.java";
		
		try {
			FileInputStream fis = new FileInputStream(filePath);
			while((data=fis.read()) != -1){
				System.out.write((char)data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
