/*
	패키지 : .class파일을 압축한 폴더
	라이브러리 : 관련 있는 재사용 가능한 코드들의 집합 .jar파일
	프레임워크 : 라이브러리를 압축한 큰 단위의 폴더
	API : application programming interface 특정 프로그램끼리의 플랫폼을 연결하는 중간 프로그램(JDBC API)
	
	컬렉션 라이브러리
	- 데이터를 저장할 가변길이의 자료구조 메모리를 만들때 사용되는 클래스들을 제공하는 패키지들의 모음.
	최상위 인터페이스 - Collection 
	하위 인터페이스
	Set - 객체 저장 중복 X, 순서 X 
	List - 객체 저장 중복 O, 순서 O
	Queue 
	Map - 객체 데이터를 단독으로 저장하지 않고 , key : value(객체데이터) 쌍으로 구현
		  key를 통해 value를 추출 할 수 있다.
*/
package Collection;

import java.util.HashSet;
import java.util.Set;

public class Collections01_HashSet {

	public static void main(String[] args) {
		Set set = new HashSet();
		System.out.println(set.size());
		set.add("하나");
		set.add(2); // 오톱가싱
		set.add(3.42);
		set.add("4시");
		set.add("1");
		set.add("2");
		System.out.println(set.size());
		System.out.println(set);
	}

}
