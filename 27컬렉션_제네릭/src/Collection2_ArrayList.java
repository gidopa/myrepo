import java.util.ArrayList;
import java.util.List;
/*
	List -> 요소는 index를 이용해 접근, List부모인터페이스는 Collection으로부터 상속되어 
	Collection의 메소드를 모두 사용할 수 있음.
		메소드					설명
		indexOf(Object o)		파라미터를 검색해서 index를 리턴, 없으면 -1
		lastIndexOf(Object o)	객체를 마지막 index부터 검색해서 인덱스 리턴 , 없으면 -1
		get(int index)			인덱스 위치의 객체를 리턴
		set(int index, E element) index위치의 객체를 element로 바꿈
		add						자료구조에 추가, index로 위치를 명시하면 기존 객체는 그 다음 index로 밀림.
		remove(int index)		index의 객체를 삭제, 삭제에 성공하면 true 실패하면 false 리턴
		remove(Object o)		전달받은 객체를 삭제, 삭제에 성공하면 true 실패하면 false 리턴
		
			
*/
public class Collection2_ArrayList {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(0,3);
		list.add("five");
		list.add(1,list);
		System.out.println(list);
		list.set(0,"one");
		System.out.println(list);
	}

}
