
public class Opr03_1 {

	public static void main(String[] args) {
		int numOfApple = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (numOfApple % sizeOfBucket) != 0 ? numOfApple / sizeOfBucket + 1 : numOfApple / sizeOfBucket;
		System.out.println(numOfBucket);
		
		
		
	}

	
}
