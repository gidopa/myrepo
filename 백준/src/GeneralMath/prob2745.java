package GeneralMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob2745 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String str = st.nextToken();
		int sum = 0;
		int step = 1;
		int unit = Integer.parseInt(st.nextToken());
		for(int i=str.length()-1;i>=0;i--) {
			char in = str.charAt(i);
			if(in>='A' && in<='Z') {
				sum += (in - 'A' + 10) * step;
			}else {
				sum += (in - '0') * step;
			}
			step= step * unit;
		}
		System.out.println(sum);
	}

}
