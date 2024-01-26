package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] croatian = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
//		for(int i=0;i<croatian.length;i++) {
//			if(s.contains(croatian[i])) {
//				s = s.replace(croatian[i], "A");
//			}
//				
//		}
//		System.out.println(s.length());
		for(String value : croatian) {
			s = s.replace(value, "A");
		}
		System.out.println(s.length());
	}
	
}