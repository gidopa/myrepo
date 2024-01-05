package 백준;

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
public class prob2588_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		br.close();
        
		StringBuilder sb = new StringBuilder();	//stringbuilder 에 대한 공부 !
		
        
		sb.append(A * (B%10));
		sb.append('\n');
		
		sb.append(A * ((B%100)/10));
		sb.append('\n');
        
		sb.append(A * (B/100));
		sb.append('\n');
        
		sb.append(A * B);
 
		System.out.print(sb);
        

	}

}
