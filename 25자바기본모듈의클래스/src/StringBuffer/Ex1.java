package StringBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	한번 생성한 객체 메모리에 변경하지 않을 문자열을 저장하고 싶을때 String 객체메모리 생성
	같은 String 클래스의 참조변수에 문자열객체메모리를 생성해서 주소를 넣을때마다
	새로운 String 클래스에대한 객체메모리가 새로 할당되기 때문에 성능 저하 
	변경하지 않을 문자열만 String 쓰자 !
	
	StringBuffer 클래스
	-변경을 많이 할 문자열을 저장할 객체를 생성할때 사용
	최근의 Java 버전에서는 대부분의 상황에서 StringBuilder를 사용하는 것이 권장되며, 스레드 안전성이 필요한 경우에 한정적으로 StringBuffer를 사용
*/
public class Ex1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		sb.append("JAVA");
		sb.append(br.readLine());
		System.out.println(sb);
		
		
	}

}
