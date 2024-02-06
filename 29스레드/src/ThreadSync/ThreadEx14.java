package ThreadSync;
/*
	Thread 객체들 간의 데이터 교환
	1. 특정 파이값(3.141592)을 계산하는 스레드
	2. PI값을 가져다 사용하는 보조작업 스레드
	3. 각 스레드들간의 파이값을 공유할 코드가 적혀있는 일반 클래스
	4. 메인
*/
public class ThreadEx14 {

	public static void main(String[] args) {
		PiCalc piCalc = new PiCalc();
		PiPrint piPrint = new PiPrint();
		sharedArea sa = new sharedArea();
		//파이값 산출 스레드 객체 내부의 인스턴스 변수 sa에 공유영역객체 (new SharedArea()의 주소 저장
		piCalc.sa = sa;
		piPrint.sa = sa;
		piCalc.start();
		piPrint.start();
	}

}
class PiCalc extends Thread{
	//공용변수를 가지는 객체 sa를 멤버로 가짐 
	sharedArea sa;
	//파이값 산출
	@Override
	public void run() {
		double pi = 3.141592;
		sa.res = pi;
		sa.isReady = true;
	}
}
class PiPrint extends Thread{
	sharedArea sa;
	@Override
	public void run() {
		//공유영역에 파이값이 저장되어 있지 않으면 파이값을 가져다 사용하는 작업 중지
		while(sa.isReady == false) {
			continue;
		}
		//공유영역에 파이값이 저장되어 있으면 파이값을 공유 받아 출력
		System.out.println("PiPrint 스레드가 파이값을 공유받아 사용한 값 : "+sa.res);
	}
}
class sharedArea{
	//두개의 스레드의 데이터 교환을 위해 공동으로 사용할 공용변수
	double res;
	//공유시킬 산출된 파이값이 공유영역에 저장되어 있는지 여부를 저장하는 플래그변수
	boolean isReady;
}
