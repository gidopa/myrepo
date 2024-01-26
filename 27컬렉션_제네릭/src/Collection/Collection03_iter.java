/*
	Iterator인터페이스를 구현한 Iterator객체의 메소드를 이용해 쉽게 ArrayList 배열의 객체 추출
*/
package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Collection03_iter {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("하나");
		list.add(2);
		list.add(3.42);
		list.add("넷");
		list.add("다섯");
		list.add(6);
		for(Object value : list) {
			System.out.println(value);
		}
		System.out.println();
		//ArrayList$Itr이라는 이름의 배열메모리에 저장 후 배열 자체를 반환
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
