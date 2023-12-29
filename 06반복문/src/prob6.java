
public class prob6 {
	public static void main(String[] args) {

		for(int i=1;i<6;i++) {
			for( int j=1;j<2*i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	      for(int i=0; i<6; i++){
	            //1번
	            for(int j=5; j>i; j--){
	                System.out.print(" ");
	            }
	            //2번
	            for(int j=0; j<=i; j++){
	                System.out.print("*");
	            }
	            //3번
	            for(int j=0; j<i; j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	


		
	}
}
