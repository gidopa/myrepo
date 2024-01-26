// ArrayList에 저장된 객체를 index로 접근해 꺼내와 사용하는 예제
package Collection;

import java.util.ArrayList;
import java.util.List;

public class Collection04_ArrayList {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("하나");
		list.add(2);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add(Integer.valueOf(6));
		System.out.println(list);
		System.out.println(list.get(4));
		list.add(0, "시작");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println();
		for(int i=0;i<list.size();i++) {
			System.out.println(i+"번째 index의 객체 : "+list.get(i));
		}
		for(Object values : list) {
			System.out.println(values);
		}
	}

}
