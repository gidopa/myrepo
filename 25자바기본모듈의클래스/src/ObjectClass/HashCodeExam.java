package ObjectClass;
/*
	Student 객체를 동등 비교하기 위해 hashCode()와 equals()메소드를 오버라이딩
	학생번호와 이름으로 해시코드를 생성하고, 학생번호와 이름이 동일한 경우에만 equals()의 결과를 true로 리턴하도록
*/

public class HashCodeExam {

	public static void main(String[] args) {
		// == 레퍼런스를 비교 equals는 시퀀스를 비교한다
		// "홍길동"과 "홍길동" 은 같은 레퍼런스를 참조하지만
		// 아래와 같이 new 를 통해 다른 객체로 참조하므로 ==을 이용하면 false를 반환 equals는 true를 반환해준다
		Student s1 = new Student(1, new String("홍길동"));
		Student s2 = new Student(1, new String("홍길동"));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		if(s1.hashCode() == s2.hashCode()) {
			if(s1.equals(s2)) {
				System.out.println("동등 객체입니다");
			}else {
				System.out.println("데이터가 다르므로 동등 객체가 아님");
			}
		}else {
			System.out.println("해시코드가 다르므로 동등 객체가 아님");
		}
	}

}

class Student{
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no=no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		int hashCode= this.no + this.name.hashCode();
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			if(this.no == target.getNo() &&  this.name.equals(target.getName())) {
			//if(this.no == target.getNo() &&  this.name==target.getName()) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	
	
}
