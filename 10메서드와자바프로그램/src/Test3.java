import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Test3 {

	public static void main(String[] args) throws IOException{
		Scanner Scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int str_num = Integer.parseInt(str);  // BufferReader input
		int rcv_num = Scan.nextInt();	// Scanner input
		int digitSum = 12345;  // 메서드용 num 변수
		int num = 12345;
		int sum = 0;
		for(int i=1;i<6;i++) {
			
			sum += num % 10;
			num /= 10;
			
			//sum += (num % Math.pow(10, i)) / Math.pow(10, i-1));
			
		}
		System.out.println("sum="+sum);
		SumofDigit(str_num);
		SumofDigit(rcv_num);
		SumofDigit(digitSum);
		
	}
	
	public static int SumofDigit(int number) {
		int digitSum =0;
		while(number>0) {
		digitSum += number % 10;
		number /= 10;
				}
		System.out.println(digitSum);
		return digitSum;
	}

}
