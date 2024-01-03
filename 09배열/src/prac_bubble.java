
import java.io.IOException;
public class prac_bubble {

	public static void main(String[] args) throws IOException {
		 int[] number = new int[10];

         for (int i=0; i < number.length ; i++ ) {
               System.out.print(number[i] = (int)(Math.random() * 10));
         }
         System.out.println();
         // 랜덤으로 뽑은 수 회 출력
         for(int i =0;i<number.length;i++) {
        	 boolean changed = false;	// 자리를 바꾼 숫자가 있는지 체크할 changed 변수
        	 for(int j=0;j<number.length-1 ;j++) { 	
        		 if(number[j]>number[j+1]) {		//number를 돌면서 j보다 j+1이 크면 서로 자리 교체
        			 int temp =0;
        			 temp = number[j];
        			 number[j]=number[j+1];
        			 number[j+1] =temp;
        			  	
        			 changed = true;			// 자리교체 했으면 changed 변수 true로 바꿔줌
        		 }
        	 }
        	 for(int k=0;k<number.length;k++) {
        		 System.out.print(number[k]);
        	 }									// 한번 돌때마다 정렬된 수를 찍어준다
        	 System.out.println();
        	 if(!changed)  {
        		 break;
        		 }					// 더 이상 자리교체가 없으면 반복 종료
         }
         

	}
}
