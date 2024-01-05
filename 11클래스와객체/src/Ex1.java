
public class Ex1 {

	public static void main(String[] args) {
		
		FruitSeller seller = new FruitSeller();
		seller.applePrice = 1000;
		seller.wholesalePrice = 400;
		FruitBuyer buyer = new FruitBuyer();
		buyer.myMoney=5000;
		seller.numOfApple = 7;
		buyer.buyApple(seller, 4000);
		
		System.out.println("--seller--");
		seller.showSaleResult();
		System.out.println("--buyer--");
		buyer.showBuyResult();
		
		
	}

}

class FruitSeller {
	// 상수의 종류
	// 1. literal 상수 : 변하지 않는 고정된 값 -> 1, 100
	// 2. 상수메모리 : final로 선언 단 한번만 값을 지정
	// final int APPLE_PRICE = 1000; 	// 상수
	int applePrice;
	int wholesalePrice ;
	int numOfApple;
	int myMoney;

	int saleApple(int money) {        // buyApple 했는데 구매자가 돈이 없을때 어떻게 구현? -> 사전검사로 처리
		int num = money / applePrice;
		if(numOfApple - num < 0) {
			System.out.println("가진 모든 사과 "+numOfApple+"개를 판매함");		// 가진 사과보다 더 많이 buy했을때 가진것만 판매하고 남은건 0으로 처리
			int salesApple = numOfApple;
			myMoney += numOfApple * applePrice;				// 판 갯수만큼만 돈을 받음
			numOfApple =0;
			return salesApple;
			
		}else if(numOfApple - num >= 0){			// 일반적 경우 
		numOfApple -= num;
		myMoney += money;
		}
		return num;
	}

	public void showSaleResult() {
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("가진 돈 : " + myMoney);
	}
	
	void takeApple(int money) {
		int buying = money / wholesalePrice;
		int totApplePrice = wholesalePrice * buying;
		if(myMoney - totApplePrice <0) {
			System.out.println("돈이 없음");
		}else {
		numOfApple += buying;
		myMoney -= totApplePrice;
		}
		
	}

}
class FruitBuyer{
	int myMoney ;
	int numOfApple ;
	
	public void buyApple(FruitSeller seller, int money) {
		// 과일을 구매 -> 판매자가 판매 하는 행위가 동시에 발생 -> seller.saleApple 호출 
		// 과일 구매를 위해 money 변수 값 전달하고 구매한 사과 갯수를 반환받아서 구매자 사과갯수에 누적
		if (money > myMoney) {
	        System.out.println("돈이 부족합니다.");
	        return;
	        }
		int originNumOfApple = numOfApple;			// 구매자가 가진 돈보다 많이 사려고 하면 return;으로 메서드 종료
		numOfApple += seller.saleApple(money);		// saleApple로 상황에 따른 사과 갯수 누적
		if(seller.numOfApple == 0) {
			 
			myMoney -= (numOfApple-originNumOfApple) * seller.applePrice;		// 판매자가 가진 양보다 많이 사려하면 판매자가 가진 양만큼만 구매
			
		}
//		else if(myMoney - money <0) {
//			System.out.println("돈이 부족함");						// 돈이 부족할때 였는데 앞의 사전검사로 예외는 처리
//			numOfApple -= (numOfApple - originNumOfApple);
		else {
			
			myMoney -= money;						// 정상적인 경우
		}
	}
	public void showBuyResult() {
		System.out.println("현재잔액 : "+ myMoney);
		System.out.println("사과 개수 : "+ numOfApple);
		
	}
	int stealApple(FruitSeller seller, int n) {

		if(seller.numOfApple - n < 0) {
			System.out.println("판매자가 가진 모든 사과 "+seller.numOfApple+"개 훔침");
			numOfApple += seller.numOfApple;
			seller.numOfApple = 0;
			
		}else {
			numOfApple += n;
			seller.numOfApple -= n;
		}
		return numOfApple;
	}
}

