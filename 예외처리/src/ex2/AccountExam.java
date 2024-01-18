package ex2;


/*
	은행계좌 클래스의 출금 메소드에서 잔고 잔고 변수와 출금액(매개변수로전달)을 비교해서
	잔고가 부족하면 InsufficientException을 발생시키고 throws
	AccountExample은 withdraw()메소드를 호출할때 예외처리를 한다
*/
public class AccountExam {

	public static void main(String[] args) throws InsufficientException{
		Account acc = new Account();
		acc.deposit(10000);
		System.out.println(acc.getBalance());
		acc.withdraw(3000);
		System.out.println(acc.getBalance());
		acc.withdraw(8000);
		System.out.println(acc.getBalance());
	}

}

class Account{
	private long balance;
	
	public Account() {
		
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) throws InsufficientException{
		if(balance < money) {
		throw new InsufficientException("잔고 부족 : "+(money - balance) + " 모자람");
		}
				
		balance -= money;
	}
	
}

class InsufficientException extends Exception{
	public InsufficientException() {
	}
	public InsufficientException(String str) {
		super(str);
	}
}
