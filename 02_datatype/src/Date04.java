/*
 * 자료(데이터) 형변환
 * 상수 또한 자료형태가 나뉘고 상수마다 할당되는 메모리의 크기가 다 다름
 * 123456은 int 이지만 123456L은 Long
 * 상수값을 서로 다른 유형의 자료형으로 선언된 변수메모리에 저장할 경우
 * 자료의 형태가 변환되어 저장 이것을 데이터 형변환이라고 함
 * 
 * 형변환 종류
 * 1. 자동 형변환
 *  -> 대입연산자 기호 - 로 값을 변수에 대입할 경우
 *  	대입연산자 기호 = l-value와 r-value의 자료형과 저장할 값이 자료형이 서로 다른 경우
 *  	r-value의 값의 형변환이 일어남
 *  	컴파일러에 의해 자동으로 형변환이 일어나는 것을 자동 형변환이라고 함
 * 2. 강제 형변환
 * 		큰용량의 변수메모리에 저장된 값을
 *		작은 용량의 변수메모리에 저장 하려고 할 경우
 *		작은 용량의 변수메모리에 저장 하기에는 너무 큰 값이라 범람할 수 있으므로 문제가 발생할 수 있음
 *		이럴 경우 컴파일러가 자동으로 형변환을 하지 않기 때문에 개발자가 강제로 자료의 형을 변환
 *  */
public class Date04 {

	public static void main(String[] args) {
		/* 자료형 역할 1 : 변수 선언시 자료형을 사용하는데는 크게 2가지의 이유
		 * 변수 메모리에 저장되는 값의 형태 결정
		 * */
		int a =1;
		System.out.println((float)a);
		double b = a;
		System.out.println(b);
		long d = 123456L;
		int e = (int)d;
		System.out.println(e);
		
		byte var = 1;
		short var2 = 128;
		int var3 = 32768;
		//byte자료형 변수 var 메모리에 저장된 1이라는 값을 short 자료형 var2 메모리에 저장하려 할때 자바컴파일러는 byte자료형의 값1을 short 자료형의 값 1로 자동 형변환
		var2 = var;
		System.out.println(var2);
		var2 = (short)var3;
		System.out.println(var2); //overflow로 다른 값으로 바뀜
	}

}
