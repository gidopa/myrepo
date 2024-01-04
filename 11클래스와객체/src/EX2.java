/*
	1.객체 모델링
	2.클래스 생성
	3.객체 생성
	
*/

public class EX2 {

	public static void main(String[] args) {

		Tv lg = new Tv();
		lg.height = 100;
		lg.width = 200;
		lg.size = 1000;
		lg.color = 'B';
		System.out.println(lg.ch);
		lg.changeCh(7);
		lg.power();
		System.out.println(lg.power);
		System.out.println(lg.vol);
		lg.volUp();
		System.out.println(lg.ch);
		lg.power();
		System.out.println();
		
		Tv samsung = new Tv();
		samsung.height = 160;
		samsung.width = 90;
		samsung.power = true;
		samsung.vol = 3;
		System.out.println(samsung.power);
		samsung.power();
		System.out.println(samsung.color);
		samsung.color = 'G';
		System.out.println(samsung.color);
		samsung.elec();
		samsung.volDown();
		samsung.volDown();
		samsung.volDown();
		samsung.volDown();
		samsung.volDown();
	}

}

//1단계 객체 모델링 
// LG TV
// 데이터 : 색 : 검정색,전원상태 : on, off, 채널 : 1, 볼륨 : 100, 높이 : 100cm, 길이 : 200cm, 크기 : 1000
// 기능 : 켜기, 끄기, 볼륨 높이기, 볼륨 낮추기, 채널 바꾸기

//2단계 클래스 생성
class Tv{
	char color;
	boolean power;
	int ch;
	int vol;
	int height ;
	int width;
	int size;
	
	void power() {
		power = !power;
		if(power == true) {
			System.out.println("TV 킴");
		}else {
			System.out.println("TV 끔");
		}
	}
	void volUp(){
		vol++;
		System.out.println("볼륨 : "+vol);
	}
	void volDown(){
		if(vol <=0) {
			System.out.println("볼륨이 0입니다");
		}else vol--;
		System.out.println("볼륨 : "+vol);
		
	}
	void changeCh(int x){
		ch = x;
		System.out.println("채널 : "+ch);
	}
	void elec() {
		power = false;
		System.out.println("과전류로 TV 꺼짐");
	}
}
