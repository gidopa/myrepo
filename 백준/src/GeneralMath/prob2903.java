package GeneralMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob2903 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int p = 2;
		for(int i=0;i<n;i++) {
			p += p-1;
		}
		System.out.println(p*p);
		
	}

}
