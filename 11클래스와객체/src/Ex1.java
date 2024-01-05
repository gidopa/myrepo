
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

	int saleApple(int money) {        // buyApple 했는데 구매자가 돈이 없을때 어떻게 구현?
		int num = money / applePrice;
		if(numOfApple - num < 0) {
			System.out.println("가진 모든 사과 "+numOfApple+"개를 판매함");
			int salesApple = numOfApple;
			myMoney += numOfApple * applePrice;
			numOfApple =0;
			return salesApple;
			
		}else if(numOfApple - num >= 0){
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
		int originNumOfApple = numOfApple;
		if (money > myMoney) {
	        System.out.println("돈이 부족합니다.");
	        return;
	        }
		numOfApple += seller.saleApple(money);
		if(seller.numOfApple == 0) {
			 
			myMoney -= (numOfApple-originNumOfApple) * seller.applePrice;
			
		}
		else if(myMoney - money <0) {
			System.out.println("돈이 부족함");
			numOfApple -= (numOfApple - originNumOfApple);
		}else {
			
			myMoney -= money;
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

