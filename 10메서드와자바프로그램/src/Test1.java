// x,y,z으,ㅣ 값을 바꾸는 코드
// x=2
// y=3
// z=1

public class Test1 {

	public static void main(String[] args) {
		int x=1;
		int y=2;
		int z=3;
		
		int temp=0;
		temp = x;
		x = y;
		y = z;
		z = temp;
		
		System.out.println("x=" +x);
		System.out.println("y=" +y);
		System.out.println("z=" +z);
		
	}

}
