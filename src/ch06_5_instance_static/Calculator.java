package ch06_5_instance_static;

public class Calculator {
	
	//�ʵ�
	static double pi = 3.14159; // �������� ������ ������ �Ǿ�����~^^
	
	
	
	//������
//	public Calculator() {
//		
//	}
	
	
	
	
	//�޼ҵ�
	static int plus(int x, int y) {
		return x + y;
//		return this.x + this.y  // ����ƽ (�������ñ�) �̶� �ȵ�
	}
	
	static int minus (int x, int y) {
		return x - y;
	}

}
