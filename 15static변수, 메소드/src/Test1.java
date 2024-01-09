/*
	자바에서 클래스 내부에 만드는 변수 연습 1
	class Student
		인스턴스 변수 num
*/
public class Test1 {

	public static void main(String[] args) {
		Student a_student = new Student();
		Student b_student = new Student();
		a_student.add(5);
		System.out.println("참조변수 a_student가 참조하는 객체의 정보");		  
		System.out.println("인스턴스 변수 num = "+a_student.num);            // a_student 객체 생성 시 heap에 num method부분에 staticNum 변수 메모리 올라감
		System.out.println("클래스 변수 staticNum = "+Student.staticNum);	  // a_ ~.add를 통해 a_~.num에 5 Student.staticNum에 5
		b_student.add(5);
			
		System.out.println("참조변수 b_student가 참조하는 객체의 정보");		// b_~.add를 통해 b_~.num에 5 Student.staticNum에는 기존 메모리에 5+ 5해서 10
		System.out.println("인스턴스 변수 num = "+b_student.num);
		System.out.println("클래스 변수 staticNum = "+Student.staticNum);
		
	}

}

class Student{
	int num;
	static int staticNum;
	public Student() {}
	
	void add(int n) {
		this.num += n;
		Student.staticNum += n;
	}
	
	
}
