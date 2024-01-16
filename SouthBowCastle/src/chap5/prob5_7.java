package chap5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob5_7 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int money = Integer.parseInt(br.readLine()) ;
		
		int[] coinUnit = {500,100,50,10};
		int[] coin = {5,5,5,5};
		
		for(int i=0;i<coinUnit.length;i++) {
			int coinNum = 0;
			int c=0;
			
			coinNum += money / coinUnit[i];
			c = coinNum; 
			if(coinNum>5) {
				coinNum=5;
				money += coinUnit[i] * (c-5);
			}
			coin[i] -= coinNum;
			money -= c * coinUnit[i];
			
			System.out.println(coinUnit[i]+"원: "+coinNum);
		}
		if(money>0) {
			System.out.println("거스름돈 부족");
			System.exit(0);
		}
		System.out.println("남은 동전의 갯수");
		for(int i =0; i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"원:"+coin[i]);
			
		}
	}

}
