package Home;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("가장 높은 등급의 고객의 전화를 먼저 가져옴");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 skill이 가장 높은 상담원의 대기열에 우선 배분");
	}
	
}
