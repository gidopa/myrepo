// 주제 : Queue인터페이스를 구현한 자식 LinkedList 클래스에 대해 알아보고
// 		 List 인터페이스를 구현한 LinkedList클래스와 ArrayList클래스의 차이점을 알아보자.

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
		List list = new LinkedList();
		List aryList = new ArrayList();
		aryList.add(3);
		aryList.add(4);
		
	}

}
