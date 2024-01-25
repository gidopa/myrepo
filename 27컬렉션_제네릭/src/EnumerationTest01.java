/*
  	Enumertion 인터페이스
  	- Collection인터페이스로 구현한 자식 클래스에 저장된 객체를 쉽게 꺼낼 수 있는 메소드 제공
  	 hasMoreElements(), nextElement() 
  	 자바에서 Iterator와 Enumeration은 컬렉션 라이브러리에서 제공하는 저장된 객체를 쉽게 꺼내올때 사용되는
  	 추상메소드를 제공하는 인터페이스 둘의 차이는
  	 1. 만들어진 시기
  	 Enumeration - JDK1.0 , Iterator - JDK1.2
  	 
  	 2. 컬렉션 배열의 타입
  	 Enumeration - Vector나 HashTable같은 구식 컬렉션에서 사용
  	 Iterator - 모든 컬렉션에서 사용
  	 
  	 3. Collection에 저장된 객체 제거
  	 Enumeration는 객체를 제거하는 기능의 메소드 제공 x
  	 Iteration 순회중 객체 동적 변경 가능(remove)
  	 
  	 4. 메소드 추가지원
  	 Iterator는 forEachRemaining()메소드 자원. 나머지 모든객체를 소비하면서 특정 동작 수행
 */

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest01 {

	public static void main(String[] args) {
		// 기본생성자일땐 10칸의 메모리 Vector에 객체가 가득 찬 상태에서 add메소드를 이용해서 추가하면 1칸씩 늘어남
		Vector vector = new Vector();
		for(int i=0; i<5;i++) {
			vector.add(Integer.valueOf(i*10));
		}
		Enumeration enu = vector.elements();
		
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
	}

}
