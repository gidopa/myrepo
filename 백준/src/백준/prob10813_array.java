package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob10813_array {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken()) ;
		int m = Integer.parseInt(st.nextToken()) ;
		int[] array = new int[n];
		
		for(int i=0;i<array.length;i++) {
			array[i]=i+1;
		}
		for(int j=0;j<m;j++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
			int k = Integer.parseInt(st1.nextToken())-1;
			int l = Integer.parseInt(st1.nextToken())-1;
			int temp=0;
			temp = array[k];
			array[k]=array[l];
			array[l]=temp;
			}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		}
	}


