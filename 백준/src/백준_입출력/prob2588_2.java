package 백준_입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//곱셈 수기로 계산할때 나오는 값 계산
//472 * 385
//-----------
//472 * 5
//472 * 80  
//472 * 300
//--------------
//472*385
public class prob2588_2 {
	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	int A = Integer.parseInt(br.readLine());
	String B = br.readLine();

	char[] b = B.toCharArray();  //  character 배열로 만들어준 뒤 하나씩 배열에서 꺼내서 쓰는 방법이다.
				//나중에 문자열 길이가 가변적으로 입력으며 문자 하나씩 참조해야할 때 매우 유용한 메소드 중 하나
	
	System.out.println(A * (b[2]-'0'));
	System.out.println(A * (b[1]-'0'));
	System.out.println(A * (b[0]-'0'));
	System.out.println(A * Integer.parseInt(B));

	}

 }

