// 기본자료형과 참조자료형 비교
// 기본자료형 : int char double long float boolean
// 참조자료형(레퍼런스형) -> 생성된 객체 메모리를 참조하기 위해 쓰는 자료형
// String, Class 


public class Ex4 {

	public static void main(String[] args) {
		MyDate d = new MyDate();
		MyDate e;
		//각자 독립적인 메모리를 가짐
		int x = 7;
		int y = x;
		System.out.println(y);
		// 같은 주소를 참조 -> 같은 객체 메모리를 공유함
		e = d;
		d.year=2024;
		System.out.println(e.year);
		
		e.year = 2020;
		System.out.println(d.year);
	}

}

class MyDate{
	int year = 2016;
	int month = 1;
	int day = 5;
}
