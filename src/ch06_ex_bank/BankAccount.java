package ch06_ex_bank;

public class BankAccount {
	
//	�ʵ�
	
	String name;
	String number;
	int balance;
	
	
//	������
	
	public BankAccount(String name) {
		this(name, "123-456", 0); // �⺻���� �����ִµ��ϴ�
//		this.name = name;
		
		
	}
	
	public BankAccount(String name, String number) {
		this(name, number, 0); // �ΰ��� ������ �������� 0���� ����? �ε�
		//		this.name = name;
		//		this.number = number;
	}
	
	public BankAccount(String name, String number, int balance) {
		this.name = name;
		this.number = number;
		this.balance = balance;
	}

//	�޼ҵ�
	public void deposit(int amount) {
		this.balance += amount;
		
	}

	public void withdraw(int amount) {
		this.balance -= amount;
		
	}

	public void checkbalance() {
		System.out.println(this.name + " ������ ���� �ܰ� : " + this.balance);
		
	}
	
	
//	������ �����ڵ�^^...
//	
//	�Աݾ�();
//	��ݾ�();
//	�����ܰ�();
//
//	// ���� �Ա�
//	int �Աݾ� = 1000; 
//			
//			
//	// ���� ���
//	int ��ݾ� = 100;
//
//			
//	// ���� �ܰ� ���
//	�����ܰ� = �����ܰ� + �Աݾ�; 
	
	
	


}
