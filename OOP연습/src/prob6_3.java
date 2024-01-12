
public class prob6_3 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println(s.getTotal());
		System.out.println(s.getAverage());
	}

}
class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public int getTotal(){
		int sum=0;
		sum += kor + eng + math;
		return sum;
	}
	public float getAverage() {
		float avg = 0;
		avg = (float)(kor + eng + math) /3;
		return avg;
	}
}