package 백준;
//a*b 입력받아서 출력
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class prob10998_2 {

	public static void main(String[] args) throws IOException {
	     
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" "); // 공백 한칸으로 split하여 str을 입력받고 그걸 int로 나눠서 a*b 출력
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		System.out.println(a*b);
 
	}
 
}

