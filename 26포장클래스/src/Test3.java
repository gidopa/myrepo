/*
문제 : static 메소드를 이용한 객체 생성
 
	기본자료형 데이터를 이용한 Wrapper클래스의 객체 생성방법에는(간단히 줄여서 박싱에는)
	다음과 같이 두가지가 존재 한다. 
		1번. 키워드 new를 이용한 일반적인 객체생성방법
		2번. static 메소드를 이용한 객체 생성방법
	그런데 앞서 보인 것은 모두 키워드 new를 이용하는 방법 이었습니다.
	그래서 지금 위의 2번에서 static 메소드를 이용한 객체생성 방법도 존재한다는 힌트를 제공하고 있습니다.
	이 힌트를 근거로 API문서를 참조하자.
	그리고 다음 예제를 static 메소드를 이용해서 박싱 처리하는 형태로 변경 해 보자.

*/

public class Test3 {
	public static void main(String[] args) {
//		Integer iValue1= new Integer(10);
	//1번. new를 이용한방법 -> Integer iValue1 = new Integer(10);
	//바로 위의 1번. new를 이용한 방법 을 아래 줄의 2번. 설명을 읽고 바꿔서 작성하기
	//2번. static메소드를 이용하여 객체생성하기 ,참조변수 iValue1
		Integer iValue = Integer.valueOf(10);
				
	//1번. new를 이용한방법  -> Integer iValue2 = new Integer(10);	
	//바로 위의 1번. new를 이용한 방법 을 아래 줄의 2번. 설명을 읽고 바꿔서 작성하기
	//2번. static메소드를 이용하여 객체생성하기, 참조변수 iValue2
		Integer iValue2 = Integer.valueOf(10);
	
	//두 iValue1,iValue2참조변수가 참조하고 있는 객체가 동일한지 비교하기
		// 두참조변수가 동일한 객체를 참조하면?
				if(iValue == iValue2) {
					//"iValue1과 iValue2는 동일 객체 참조" 출력문
					System.out.println("iValue와 iValue2는 동일 객체 참조");
				}else {// 두참조변수가 다른 객체를 참조하면?
					System.out.println("iValue와 iValue2는 다른객체참조");
				}
				
		
				
			//"iValue1과 iValue2는 다른 객체 참조" 출력문
			
			
			
	//-----------------------------------------------------
			
		//1번. 키워드 new를 이용한 일반적인 객체생성방법(박싱방법)
		// 과....
		//2번. static 메소드를 이용한 객체 생성방법 (박싱방법)
		//의 실행 결과를 보면.. 박싱방법의 차이점이 있는데..
		//두가지 박싱 방법중 어느것이 더 효율적인가요??
		//: -> 2
				
		
		
		
		
		//만약 두개중 하나의 방법이 효율적이라면 그이유를 쓰시오.
		//: -> 같은 value 일때 같은 객체를 참조함으로써 new에 의한 새로운 객체를 생성하는 메모리 낭비 x  가비지 컬렉터 오버헤드 발생 x 




	}
}
