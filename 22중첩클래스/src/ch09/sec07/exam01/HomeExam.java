
package ch09.sec07.exam01;

public class HomeExam {

	public static void main(String[] args) {
		Home home = new Home();
		home.use1();
		home.use2();
		home.use3(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("use3 킴");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("use3 끔");
				
			}
		});
	}

}

interface RemoteControl {
	void turnOn();
	void turnOff();
}

class Home {
	private RemoteControl rc = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("킴");
		}
		
		@Override
		public void turnOff() {
			System.out.println("끔");
		}
	};
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	public void use2() {
		RemoteControl rc1 = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("use2 킴");
			}
			
			@Override
			public void turnOff() {
				System.out.println("use2 끔");
			}
		};
		rc1.turnOn();
		rc1.turnOff();
	}
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}


