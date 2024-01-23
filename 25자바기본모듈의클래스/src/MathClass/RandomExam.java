package MathClass;
import java.util.Arrays;
import java.util.Random;
public class RandomExam {

	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		Random random = new Random();
		int cnt=0;
		System.out.println("선택번호 : ");
		for(int i=0;i<selectNumber.length;i++) {
//			lotto[i] =(int)(Math.random()*45) +1;
			selectNumber[i] = random.nextInt(45)+1;
			
		}
		int[] lotto = new int[6];
		Random random1 = new Random();		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = random1.nextInt(45)+1;
			
		}
		Arrays.sort(selectNumber);
		Arrays.sort(lotto);
		for(int i=0;i<6;i++) {
			System.out.print(selectNumber[i]+", ");
		}
		System.out.println();
		System.out.println("복권번호 : ");
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i] +", ");
		}
		for(int i=0;i<selectNumber.length;i++) {
			
			if(selectNumber[i] == lotto[i]) {
				cnt++;
			}
		}
		System.out.println();
		switch(cnt) {
		case 6:
			System.out.println("1등");
			break;
		case 5:
			System.out.println("2등");
			break;
		case 4:
			System.out.println("3등");
		default :
			System.out.println("꽝");
		}
		
			
	}

}
