	package 심화1;
	
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
	public class prob3003 {
	
		public static void main(String[] args) throws IOException{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			
			int[] chess = {1,1,2,2,2,8};
			String[] str = new String[6];
			str = br.readLine().split(" ");
			int arr[] = new int[6];
			for(int i=0;i<arr.length;i++) {
				arr[i]=Integer.parseInt(str[i]);
			}
			
			for(int i=0;i<arr.length;i++) {
				if(chess[i]==arr[i]) {
					sb.append(0).append(" ");
				}else if(chess[i]>arr[i]) {
					sb.append(chess[i]-arr[i]).append(" ");
				}else {
					sb.append(-(arr[i]-chess[i])).append(" ");
				}
			}
			System.out.println(sb);
			
		}
	
	}
