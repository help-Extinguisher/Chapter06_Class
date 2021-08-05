package ch06_ex_bank;

public class BankAccount {
	
//	필드
	
	String name;
	String number;
	int balance;
	
	
//	생성자
	
	public BankAccount(String name) {
		this(name, "123-456", 0); // 기본값을 정해주는듯하다
//		this.name = name;
		
		
	}
	
	public BankAccount(String name, String number) {
		this(name, number, 0); // 두개를 받으면 나머지는 0으로 하자? 인듯
		//		this.name = name;
		//		this.number = number;
	}
	
	public BankAccount(String name, String number, int balance) {
		this.name = name;
		this.number = number;
		this.balance = balance;
	}

//	메소드
	public void deposit(int amount) {
		this.balance += amount;
		
	}

	public void withdraw(int amount) {
		this.balance -= amount;
		
	}

	public void checkbalance() {
		System.out.println(this.name + " 계좌의 현재 잔고 : " + this.balance);
		
	}
	
	
//	내가한 망한코딩^^...
//	
//	입금액();
//	출금액();
//	계좌잔고();
//
//	// 계좌 입금
//	int 입금액 = 1000; 
//			
//			
//	// 계좌 출금
//	int 출금액 = 100;
//
//			
//	// 계좌 잔고 출력
//	계좌잔고 = 현재잔고 + 입금액; 
	
	
	


}
