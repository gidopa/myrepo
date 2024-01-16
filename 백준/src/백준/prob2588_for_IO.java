package 백준;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class prob2588_for_IO {
	// 곱셈 수기로 계산할때 나오는 값 계산
	// 472 * 385
	//-----------
	// 472 * 5
	// 472 * 80  
	// 472 * 300
	//--------------
	// 472*385
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String[] b = br.readLine().split(""); 		// String 배열 b로 숫자를 받음
		
		int[] c= new int[b.length];
			for(int i=c.length-1, j=0; i>=0 ; i--,j++) {	// b에 있는 string 숫자들을 거꾸로 int형 배열에 하나씩 저장
				c[j]=Integer.parseInt(b[i]);
			}
		for(int i=c.length-1;i>=0;i--) {
			System.out.println(a*c[i]);				// c를 돌면서 a에 곱해줌
		}
		int sum = 0;
		for (int i=0;i<c.length;i++) {				// sum 변수를 만들고 sum에 c 배열 각칸에 있는 숫자를 자릿수를 맞춰 곱해주고 누적
			sum += c[i] * Math.pow(10, i);
		}
	
		System.out.println(a*sum);
		
		}

	}
		
	

	

