package exam01;
// 멤버객체의 동등 비교를 위해 오브젝트 클래스의 equals 메소드 오버라이딩
// 객체의 멤버 id가 같은지 확인하는 메소드 equals로 구현
public class EqualsExam {

	public static void main(String[] args) {
		Member a = new Member("blue");
		Member b = new Member("red");
		Member c = new Member("blue");
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
	}

}

class Member{
	String id;
	public Member(String id) {
		this.id = id;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			if(this.id.equals(target.id)) {
				
				return true;
			}
			return false;
		}
		return false;
		
	}
}
