package Map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/*
	HashMap 클래스
	- Map인터페이스의 자식클래스로 key-value쌍으로 저장하는 자료구조, 해시테이블과 비슷하다
	- key와 value는 모두 객체로 저장 ,  key는 중복 데이터를 저장 할 수 없고, value는 가능
	- 기존에 저장된 키와 동일한 키로 저장하면 기존의 value를 삭제하고 새로 갱신
	Method						설명
	V put(K key,V value)  		key-value쌍 추가, 저장하고 value 리턴(객체추가)
	containsKey(Object key)		주어진 키가 존재하는지 boolean 리턴
	containsValue(Object value)	주어진 value가 존재하는지 boolean 리턴
	V get(Object key)           주어진 key의 value를 리턴
	isEmpty()					해시맵이 비어 있는지 boolean리턴  
	Set<K> keySet				key 들을 HashSet로 반환 
	int size()					해시맵의 key의 갯수 리턴
	Collection<V> values 		해시맵에 모든 value를 ArrayList로 리턴. 
	clear()						모든 key-value 쌍 삭제
	V remove(Object key)		해당 key-value쌍을 삭제하고 삭제한 value 리턴.
	Set<Map.Entry<K,V>>	entrySet 맵의 키-값 쌍을 나타내는 Map.Entry 객체들로 이루어진 Set을 반환합니다.
*/
public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.replace("홍길동", 95);
		System.out.println(map);
		System.out.println(map.size());
		String key = "홍길동";
		int val = map.get(key);
		System.out.println(val);
		System.out.println();
		// keySet() 으로부터 키를 꺼내오며 하나씩 추력해보기 
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		Iterator<String> keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			String k = keyIter.next();
			Integer v = map.get(k);
			System.out.println("key : "+ k + " value : " + v);
		}
		Collection<Integer> arrList = map.values();
		for(int value : arrList) {
			System.out.println(value);
		}
		System.out.println();
		//HashMap에 저장된 모든 key들을  얻어 Entry를 구현한 자식 Entry객체에 저장 후 
		//Entry객체를 HashSet배열에 저장후 배열을 리턴
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIter = entrySet.iterator();
		while(entryIter.hasNext()) {
			Entry<String, Integer> entry = entryIter.next();
			String keys = entry.getKey();
			Integer values = entry.getValue();
			System.out.println("key : " + keys + " values : " + values);
		}
	}

}
