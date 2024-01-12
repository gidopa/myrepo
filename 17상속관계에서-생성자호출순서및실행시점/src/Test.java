
public class Test {

	public static void main(String[] args) {
		Employee emp = new Employee("홍길동", 2000);
		Manager man = new Manager("이순신", 4000, "개발부서");
		emp.getEmployee();
		man.getStringBuilderManager();
		man.getManger();
		System.out.println(48-'0');
	}

}

class Employee{
	String name;
	int salary;
	private StringBuilder sb = new StringBuilder();
	
	public Employee() {

	}
	public Employee(String name, int salary) {
		this.name =name;
		this.salary = salary;
	}
	
	public void getEmployee() {
		System.out.println(name + ", " + salary);
	}
	
	public StringBuilder getStringEmployee() {
		
		sb.append(name + ", " + salary);
		return sb;
	}


	
}

class Manager extends Employee{
	String depart;
	
	public Manager(String name, int salary, String depart) {
		super(name,salary);
		this.depart = depart;
	}
	void getManger() {
		getEmployee();
		System.out.println(", "+ depart);
		System.out.println(super.name + ", " + super.salary + ", " + this.depart);
	}
	
	
	void getStringBuilderManager() {
		System.out.println("sb이용 : "+super.getStringEmployee().append(", "+depart));
		
	}
	
}






