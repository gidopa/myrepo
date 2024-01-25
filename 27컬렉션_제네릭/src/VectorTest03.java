import java.util.Vector;

public class VectorTest03 {

	public static void main(String[] args) {
		Vector vector = new Vector();
		vector.add("AAAA");
		vector.add(123);
		vector.add('a');
		vector.add(true);
		vector.add(3.14);
		System.out.println(vector);
		
		vector.addElement("HI");
		System.out.println(vector);
		
		vector.add(0, "Hi");
		System.out.println(vector);
		// 수정전 원래 있던 객체를 반환하고 , 새로운 객체를 저장 
		Object obj = vector.set(0, "setted");
		String temp = (String)obj;
		System.out.println(temp);
		System.out.println(vector);
		vector.remove("HI");
		System.out.println(vector);
		vector.clear();
		System.out.println(vector);
	}

}
