package 백준;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class prob2588 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String[] b = br.readLine().split("");
		
		int[] c= new int[b.length];
			for(int i=c.length-1, j=0; i>=0 ; i--,j++) {
				c[j]=Integer.parseInt(b[i]);
			}
		for(int i=c.length-1;i>=0;i--) {
			System.out.println(a*c[i]);
		}
		int sum = 0;
		for (int i=0;i<c.length;i++) {
			sum += c[i] * Math.pow(10, i);
		}
	
		System.out.println(a*sum);
		
		}

	}
		
	

	

