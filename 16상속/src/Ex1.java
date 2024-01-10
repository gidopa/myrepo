/*
  상속
 	-새로운 클래스를 만들때 기존의 클래스의 멤버를 상속받는것
 	1.슈퍼클래스(부모)
 	- 기존의 멤버를 상속해주는 클래스
 	2.서브클래스(자식)
 	- 새로 만들어지는 클래스
 	
*/
public class Ex1 {

	public static void main(String[] args) {
		Child child = new Child();   // 서브클래스의 객체를 생성하면 슈퍼클래스의 객체도 만들어짐 서로. 다른 메모리에 생성
		child.parentPrn();			 // Parent 객체 메모리에 접근하여 메소드 호출
		Parent parent = new Parent();  // Parent 객체만 생성
		
		
	}

}
class Parent{
	Parent(){
		System.out.println("Parent 생성");
	}
	
	void parentPrn() {
		System.out.println("Parent클래스의 메소드는 상속된다");
	}
	
}

class Child extends Parent{
	Child(){
		System.out.println("Child 생성");
	}
	// 상속받아 부모객체 메모리에 접근해서 사용되는 메소드 void parentPrn()
	// 서브클래스의 객체는 슈퍼클래스의 객체에 접근해서 사용 
	void childPrn() {
		System.out.println("Child클래스의 메소드는 Parent에서 사용 못함");
	}
	
}
/*
 상속을 하는 이유는 슈퍼 클래스의 멤버를 상속받아 서브클래스를 만들고
 서브클래스의 객체를 만들어 슈퍼클래스의 멤버들에 접근해 사용하기 위함
 */
 