// 같은 패키지에서 접근제어자를 이용해 멤버 만들고 사용 실습

public class Test2 {

	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder();
	
		Sub sub = new Sub();
//		sub.print();
		sub.printArr();
		
	}

}

class Super{
	
	Sub sub ;
	
	
	public int num1 = 10;
	protected int num2 = 20;
	int num3 = 30;
	private int num4 = 40;
	int[] arr = new int[5];
	
	public Super() {
		arr[0]=num1;
		arr[1]=num2;
		arr[2]=num3;
		arr[3]=num4;
		Sub.setNum5(50);
		arr[4]=Sub.getNum5();
	}

	public int getNum() {
		return this.num4;
	}
	public int[] getArr() {
		return arr;
	}
}

class Sub extends Super{
	private static int num5;
	
	public void print() {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(getNum());
		System.out.println(num5);
		}
	public static void setNum5(int x) {
		num5 = x;
	}
	public static int getNum5() {
		return num5;
	}
	public void printArr() {
		int[] array = getArr();
		for(int i=0;i<arr.length;i++) {
			System.out.println(array[i]);
		}
	}
	}

