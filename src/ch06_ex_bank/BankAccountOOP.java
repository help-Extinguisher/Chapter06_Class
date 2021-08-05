package ch06_ex_bank;

/*
 * 
 * 	은행 계좌 기능 구현 OOP 
 * 
 */

public class BankAccountOOP {
	public static void main(String[] args) {
		
		BankAccount kimAccount 
		= new BankAccount("kim");
		
		System.out.println(kimAccount.name);
		System.out.println(kimAccount.number);
		System.out.println(kimAccount.balance);
		
		kimAccount.deposit(10000);
		kimAccount.withdraw(3000);
		kimAccount.checkbalance();
	
		
		
		
		
		
		BankAccount leeAccount 
		= new BankAccount("lee", "777-777", 10000);
		
		leeAccount.deposit(10000);
		leeAccount.checkbalance();

	
	
	}
	

}
