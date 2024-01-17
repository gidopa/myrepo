package 백준_iter;
// 간단한 반복문 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob25314_반복문 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int iter = n / 4;
		for(int i=0;i<iter;i++) {
			System.out.print("long ");
		}
		System.out.print("int");
	}

}
