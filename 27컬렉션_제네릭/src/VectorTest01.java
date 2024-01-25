//vector를 만들때 사용되는 Vector 클래스

import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		//4개의 요소를 저장할 수 있는 Vector배열 add할때마다 3칸씩 늘어남 
		Vector vector = new Vector(4,3);
		System.out.println("벡터 칸의 갯수 : " + vector.capacity());
		System.out.println("벡터 내의 객체의 개수 : " + vector.size());
		for(int i=0;i<5;i++) {
			vector.add(i*10);
		}
		System.out.println("벡터 칸의 갯수 : " + vector.capacity());
		System.out.println("벡터 내의 객체의 개수 : " + vector.size());
		
		System.out.println(vector.firstElement());
		System.out.println(vector.get(2));
		System.out.println(vector.lastElement());
	}

}
