
public class Test2_1 {

	public static void main(String[] args) {
		Sub1 sub1 = new Sub1();
		sub1.setNum5(50);
		sub1.printArray();
	}

}

class Super1 {
//    Sub1 sub ;
    
    public int num1 = 10;
    protected int num2 = 20;
    int num3 = 30;
    private int num4 = 40;
    int[] arr = new int[5];
    
    public Super1() {
        arr[0] = num1;
        arr[1] = num2;
        arr[2] = num3;
        arr[3] = getNum();
        // Initialize num4 in Subclass to access it
//        sub.setNum5(50);
//        arr[4] = sub.getNum5();
    }
    
    public int getNum() {
        return this.num4;
    }
    
    public int[] getArray() {
        return arr;
    }
}

class Sub1 extends Super1 {
    private int num5;
    
    public Sub1() {
        super();  // Add this line to call the Super class constructor
        setNum5(50);  // Initialize num5 in Subclass to access it
        arr[4] = getNum5();  // Initialize arr[4] in Subclass to access it
    }
    
    public void setNum5(int value) {
        num5 = value;
    }
    
    public int getNum5() {
        return num5;
    }
    
    public void printArray() {
        int[] array = getArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

