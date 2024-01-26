// 주제 : Queue인터페이스를 구현한 자식 LinkedList 클래스에 대해 알아보고
// 		 List 인터페이스를 구현한 LinkedList클래스와 ArrayList클래스의 차이점을 알아보자.
package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListTest {

	public static void main(String[] args) {
		Queue myQue = new LinkedList(); // 터널과 같은 메모리 공간 
		myQue.offer("1-JAVA");
		myQue.offer("2-C++");
		myQue.offer("3-API");
		myQue.offer("4-JSP");
		
		System.out.println(myQue.peek());
		while(!myQue.isEmpty()) {
			System.out.println(myQue.poll()); 
		}
		System.out.println();
		List<Integer> aryList = new ArrayList<Integer>();
		aryList.add(10);
		aryList.add(20);
		aryList.add(30);
		for(int value : aryList) {
			System.out.println(value);
		}
		aryList.remove(1);
		System.out.println(aryList);
		System.out.println();
		
		//	List 인터페이스를 구현한 자식 LinkedList 클래스
		List<Integer> linkedList = new LinkedList<Integer>();
		LinkedList<Integer> llist = new LinkedList<Integer>();
		linkedList.add(40);
		linkedList.add(50);
		linkedList.add(60);
		for (int value : linkedList) {
			System.out.println(value);
		}
		linkedList.remove(1);
		System.out.println(linkedList);
	
	}

}
