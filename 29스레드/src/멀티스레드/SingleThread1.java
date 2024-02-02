package 멀티스레드;
import java.text.DecimalFormat;

public class SingleThread1 {

	public static void main(String[] args) throws InterruptedException {
		//System.currentTimeMillis() : 1970년1월1일 0시0분0초부터 현재까지 경과된 시간을 long값으로 반환(1/1000초 단위)
		long startTime = System.currentTimeMillis();
		
		DecimalFormat df = new DecimalFormat("#.##");
		for(int i=0;i<10;i++) {
			
			System.out.println("*");
			Thread.sleep(1000);
		}
		double seconds = (System.currentTimeMillis()-startTime)/1000.0 ;
		System.out.println(df.format(seconds)+"초");
		
		for(int i=0;i<10;i++) {
			System.out.println("#");
			Thread.sleep(1000);
		}
		seconds = (System.currentTimeMillis()-startTime)/1000.0 ;
		System.out.println(df.format(seconds)+"초");
	}

}
