
public class EX1_1 {

	public static void main(String[] args) {
		
		FruitSeller seller = new FruitSeller(1500,30,0,400);
		FruitSeller sellerPro = new FruitSeller(1100,20,0,300);
	
	
		FruitBuyer buyer = new FruitBuyer(10000,0);
		
		buyer.buyApple(seller, 2000);
		buyer.buyApple(sellerPro, 2000);
		buyer.showBuyResult();
		
	}

}

class FruitSeller {
	// 상수의 종류
	// 1. literal 상수 : 변하지 않는 고정된 값 -> 1, 100
	// 2. 상수메모리 : final로 선언 단 한번만 값을 지정
	// final int APPLE_PRICE = 1000; 	// 상수
	final int APPLE_PRICE;
	int wholesalePrice ;
	int numOfApple;
	int myMoney;
	

	int saleApple(int money) {        // buyApple 했는데 구매자가 돈이 없을때 어떻게 구현? -> 사전검사로 처리
		int num = money / APPLE_PRICE;		// 판매하는 사과의 개수
		if(numOfApple - num < 0) {
			System.out.println("가진 모든 사과 "+numOfApple+"개를 판매함");		// 가진 사과보다 더 많이 구매하려 할 때 가진것만 판매하고 남은 갯수는 0으로 처리
			int salesApple = numOfApple;					// numOfApple을 0으로 대입하기 위해 리턴값으로 0이 되기전 numOfApple 값 저장
			myMoney += numOfApple * APPLE_PRICE;				// 판 갯수만큼만 돈을 받음
			numOfApple =0;
			return salesApple;								// 원래 가지고 있던 모든 사과의 갯수 리턴
			
		}else if(numOfApple - num >= 0){			// 일반적 경우 
		numOfApple -= num;
		myMoney += num * APPLE_PRICE;
		}
		return num;
	}

	public void showSaleResult() {
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("가진 돈 : " + myMoney);
	}
	
	public FruitSeller (int applePrice, int numOfApple, int myMoney, int wholesalePrice) {
		this.APPLE_PRICE = applePrice;
		this.numOfApple = numOfApple;
		this.myMoney = myMoney;
		this.wholesalePrice = wholesalePrice;
	}
	
	void takeApple(int money) {
		int buying = money / wholesalePrice;			//구매한 사과의 갯수 총 돈 / 구매 가격
		int totApplePrice = wholesalePrice * buying;	//사과값 * 구매한 갯수  -> 실제 지불한가격
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
	        }										// 구매자가 가진 돈보다 많이 사려고 하면 return;으로 메서드 종료
		int originNumOfApple = numOfApple;			// saleApple로 구매자의 사과갯수를 바꾸기 때문에 최초 상태의 사과 갯수 저장
		numOfApple += seller.saleApple(money);		// saleApple로 상황에 따른 사과 갯수 누적
//		if(seller.numOfApple == 0) 
		{				// 판매자가 가진것보다 많은 양을 사려고 했을때 -> seller의 남은 사과를 0으로 만들어줌
			 
			myMoney -= (numOfApple-originNumOfApple) * seller.APPLE_PRICE;		// 판매자가 가진 양보다 많이 사려하면 판매자가 가진 양만큼만 구매
			
		}
//		else if(myMoney - money <0) {
//			System.out.println("돈이 부족함");						// 돈이 부족할때 였는데 앞의 사전검사로 예외는 처리
//			numOfApple -= (numOfApple - originNumOfApple);
//		else {
//		
//			myMoney -= money;						// 정상적인 경우
//		}
	}
	public void showBuyResult() {
		System.out.println("사과 개수 : "+ numOfApple);
		System.out.println("현재잔액 : "+ myMoney);
	
	}
	FruitBuyer(int myMoney, int numOfApple) {
		this.myMoney = myMoney;
		this.numOfApple = numOfApple;
	}
	int stealApple(FruitSeller seller, int n) {

		if(seller.numOfApple - n < 0) {
			System.out.println("판매자가 가진 모든 사과 "+seller.numOfApple+"개 훔침");  // 훔치려는 사과가 판매자가 가진 사과보다 많을때
			numOfApple += seller.numOfApple;									  // 판매자가 가진 사과갯수만큼 누적하고 판매자의 사과갯수를 0으로 만듦
			seller.numOfApple = 0;
			
		}else {
			numOfApple += n;
			seller.numOfApple -= n;					// 구매자가 훔친 n개 만큼 누적 판매자는 -
		}
		return numOfApple;
	}
}

