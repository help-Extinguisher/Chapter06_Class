package ch06_ex_bank;

/***
 *
 * 
 *	���� ���� ��� ���� Ŭ����
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
	
	// ���� �ܰ� �ʱ�ȭ 
	static int balance = 0;
	
	public static void main(String[] args) {
		
		
		BankAccount myAccount = new BankAccount();
//		myAccount.name = "�ٺ��ٺ��ٺ��ٺ�";
		
		
		// ���� �Ա�
		// -> ���� �Ա��ϱ�
		deposit(10000); // 10000���� �ǹ��ϴ°� �Աݾ���
		
		
				
		// ���� ���
		// -> ���� ����ϱ�
		withdraw(3000);
		
		
		
		// ���� �ܰ� ���
		// -> ���� �ܰ� ����ϱ�
		checkBalance();
		
		withdraw(1000);
		deposit(30000);
		
		checkBalance();

//		withdrawAmount = 1000;
//		balance = balance - withdrawAmount;
		
		
	}

	private static void checkBalance() {
		System.out.println("���� �ܰ� : " + balance);

		
	}

	private static void withdraw(int withdrawAmount) {
		balance = balance - withdrawAmount;
		

		
	}

	private static void deposit(int depositAmount) {
//		i = 10000;
		balance = balance + depositAmount;
		
	}

}
