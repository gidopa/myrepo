
public class Marin {
	int x, y;
	int hp =60;
	static int weapon = 6;
	static int armor = 0;
	
	static void weaponUp() {
		weapon++;
	}
	static void armorUp() {
		armor++;
	}
	void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
		

} // 객체에 종속되지 않는 클래스 수준의 변수나 메소드들은 static을 붙혀서 전 객체에 동일한 기능 및 상태를 유지 
// 클래스 메소드는 클래스 변수들에 대한 작업을 수행할때 
