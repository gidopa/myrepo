package FilterIOStream;

import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy02 {

	public static void main(String[] args) {
		int data =0;
		
		FileReader reader = null;
		FileWriter writer = null;
		
		if(args.length<2) {
			System.out.println("java FileCopy01 원본파일명 복사파일명 을 입력하세요");
			System.exit(0);
		}
		try {
			reader = new FileReader(args[0]);
			writer = new FileWriter(args[1]);
			
			while((data = reader.read())!= -1) {
				writer.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
