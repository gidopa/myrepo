package ch09.sec04.exam03;

public class AExam {

	public static void main(String[] args) {
		A a = new A();
		a.useB();
		
	}

}
class A{
	public A() {
		class B{
			int field1 = 1;
			static int field2 = 2;
			void method1() {
				System.out.println("메소드1");
			}
			static void method2() {
				System.out.println("메소드2");
			}
		}
		B b = new B();
		b.method1();
		B.method2();
		
			
		}
	void useB() {
		class B{
		int field1 = 1;
		static int field2 = 2;
		void method1() {
			System.out.println("메소드1");
		}
		static void method2() {
			System.out.println("메소드2");
		}
	}
	B b = new B();
	b.method1();
	B.method2();
	}
	
	}

