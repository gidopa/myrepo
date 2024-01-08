
public class Ex1_2 {
public static void main(String[] args) {
	FruitSeller1 seller1 = new FruitSeller1(0,30,1500);
	//판매수익 : 0원 ,보유하고있는 사과의 개수 :30개, 개당가격 : 1,500
	FruitSeller1 seller2 = new FruitSeller1(0,20,1000);			
	//판매수익 : 0원 ,보유하고있는 사과의 개수 :20개, 개당가격 : 1,000
	FruitBuyer1 buyer = new FruitBuyer1(10000,0);
	buyer.buyApple(seller1, 4500);
	buyer.buyApple(seller2, 2000);
	System.out.println("--과일 장수1의 현재상황--");
	seller1.showSaleResult();
	System.out.println("--과일 장수2의 현재상황--");
	seller2.showSaleResult();
	System.out.println("--과일 구매자의 현재상황--");
	buyer.showBuyResult();
					
 }
}
class FruitSeller1{ 
final int APPLE_PRICE; //*******이부분 수정 작성1
int numOfApple; 
int myMoney;

FruitSeller1(int myMoney, int numOfApple, int APPLE_PRICE){
	this.myMoney = myMoney;
	this.numOfApple = numOfApple;
	this.APPLE_PRICE = APPLE_PRICE;
}

int saleApple(int money) { //사과구매액이 메소드의 매개변수로 전달받음
	int num = money / APPLE_PRICE;//사과 개당 1000원이라 가정
	
	//사과 판매후 사과의 수줄이기
	numOfApple -= num;
	
	//판매 수익 누적
	myMoney += money;
	
	//실제 구매(판매)가 발생한  사과의 수를 반환
	return num; 		
}


//사과판매후 남은 사과수,판매수익 출력 하는 기능의 메소드
public void showSaleResult(){
	System.out.println("남은 사과 : " + numOfApple);
	System.out.println("판매 수익 : " + myMoney);
		
}

}// FruitSeller 클래스 끝



class FruitBuyer1 {
/*변수*/
//현재 소유하고 있는 현금
int myMoney;  
//현재 소유하고 있는 사과수
int numOfApple;

FruitBuyer1(int myMoney, int numOfApple){
	this.myMoney = myMoney;
	this.numOfApple = numOfApple;
}
/*메소드*/
//과일구매 기능 메소드
//매개변수 : 구매하기위한 판매자대상, 구매금액
public void buyApple(FruitSeller1 seller , int money) {
	//판매자에게 과일 구매하기 ,구매한사과수 리턴 받아와서 현재사과수에 누적 
	numOfApple += seller.saleApple(money);
	//판매자에게 과일 구매후 현재 소유하고 있는 현금
	myMoney -= money;		
}	
//과일구매후 현재 남은 현금과 사과의수 출력 기능 
public void showBuyResult() {
	System.out.println("현재잔액 : " + myMoney);
	System.out.println("사과 개수 : " + numOfApple);
}		
}





