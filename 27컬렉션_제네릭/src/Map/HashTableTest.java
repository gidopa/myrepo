package Map;

import java.util.Enumeration;
import java.util.Hashtable;

// Map인터페이스를 구현한 HashTable -> 딕셔너리 키,밸류 쌍
public class HashTableTest {

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("사과", "Apple");
		ht.put("딸기", "Strawberry");
		ht.put("포도", "Grapes");
		
		//Object obj = ht.get("사과");
		//String value = (String)ht.get("사과") 아래의 코드와 주석 두줄이 같은 내용 
		String value = (String)ht.get("사과");
		System.out.println(value);
		if(value != null) {
			System.out.println("key에 대한 value를 반환받음 value -> " + value );
		}else {
			System.out.println("key가 존재하지 않음");
		}
		// 키 객체들을 Enumeration 배열에 담아 배열 자체를 반환
		Enumeration<String> enu = ht.keys();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement() + "에 대한 value : " + ht.get(enu.nextElement()));
		} // enu.nextElement = key , ht.get(enu.nextElement) = value
		System.out.println(ht.keySet());
		
		
	}

}
