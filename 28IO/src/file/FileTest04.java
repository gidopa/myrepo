package file;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileTest04 {

	public static void main(String[] args)throws Exception {
		 try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
	            System.out.println("여러 줄의 텍스트를 입력하세요 (입력을 마치려면 빈 줄에서 엔터를 두 번 누르세요):");

	            StringBuilder userInput = new StringBuilder();
	            String line;
	            System.out.println("현재 디렉토리: " + System.getProperty("user.dir"));

	            // 빈 줄이 나올 때까지 계속 입력 받기
	            while (!(line = reader.readLine()).isEmpty()) {
	                userInput.append(line).append("\n");
	            }

	            // 입력 받은 데이터를 파일에 쓰기
	            try (FileWriter writer = new FileWriter("Text.txt")) {
	                writer.write(userInput.toString());
	                System.out.println("데이터가 성공적으로 파일에 쓰여졌습니다.");
	            } catch (IOException e) {
	                System.err.println("파일 쓰기 중 오류가 발생했습니다: " + e.getMessage());
	            }

	        } catch (IOException e) {
	            System.err.println("입력을 받는 동안 오류가 발생했습니다: " + e.getMessage());
	        }
	}

}
