package FilterIOStream;

import java.io.PrintStream;

public class PrintStreamTest {

	public static void main(String[] args) {
		try {
			PrintStream ps = new PrintStream("ps.txt");
			
			ps.println(10);
			ps.println(3.4);
			ps.println('a');
			ps.println(true);
			ps.println("Hello");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
