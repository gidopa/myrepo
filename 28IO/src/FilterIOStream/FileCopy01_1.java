package FilterIOStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy01_1 {

	public static void main(String[] args)throws Exception {
		int len = 0;
		if(args.length<2) {
			System.out.println("java FileCopy01 원본파일명 복사파일명 을 입력하세요");
			System.exit(0);
		}
		BufferedReader br = new BufferedReader(new FileReader(new File(args[0])));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(args[1])));
		String line;
		while((line=br.readLine())!= null) {
			bw.write(line);
			
		}
	}

}
