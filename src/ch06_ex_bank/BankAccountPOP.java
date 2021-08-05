package ch06_ex_bank;

/***
 *
 * 
 *	은행 계좌 기능 구현 클래스
 *	
 * 
 ***/




//class BankAccount {
//	String name;
//	int balance;
//	int number;
//	int ssn;
	
//}


public class BankAccountPOP {
	
	// 계좌 잔고 초기화 
	static int balance = 0;
	
	public static void main(String[] args) {
		
		
		BankAccount myAccount = new BankAccount();
//		myAccount.name = "바보바보바보바보";
		
		
		// 계좌 입금
		// -> 계좌 입금하기
		deposit(10000); // 10000원이 의미하는건 입금액임
		
		
				
		// 계좌 출금
		// -> 계좌 출금하기
		withdraw(3000);
		
		
		
		// 계좌 잔고 출력
		// -> 계좌 잔고 출력하기
		checkBalance();
		
		withdraw(1000);
		deposit(30000);
		
		checkBalance();

//		withdrawAmount = 1000;
//		balance = balance - withdrawAmount;
		
		
	}

	private static void checkBalance() {
		System.out.println("현재 잔고 : " + balance);

		
	}

	private static void withdraw(int withdrawAmount) {
		balance = balance - withdrawAmount;
		

		
	}

	private static void deposit(int depositAmount) {
//		i = 10000;
		balance = balance + depositAmount;
		
	}

}
