package 백준_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob2675 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t  = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<t;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int repeat = Integer.parseInt(st.nextToken());
			String target = st.nextToken();
			
			for(int j =0;j<target.length();j++) {
				for(int k =0;k<repeat;k++) {
					sb.append(target.charAt(j));
				}
			}sb.append("\n");
			
		}
		System.out.println(sb);
		
		
	}

}
