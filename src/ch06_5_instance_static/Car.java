package ch06_5_instance_static;

public class Car {
	// �ʵ�
	String model;
	int speed;
	
	
	//������
	Car(String model) {
		this.model = model;
	}

		
		
		//�޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	void run() {
//		for (int i = 10; i <= 50; i += 10) {
		for (int i = 0; i < 5; i++) {
			this.setSpeed(i * 10);
			System.out.println(this.model + " �� �޸��ϴ�. (�ü� :" + this.speed + "km/h)");
		}
	}
		
		
		
		
}
	
//		A.pi;
//		
//		
//	}
//
//}
//
//class A {
//	static double pi = 3.141592; 
//	// ��ǻ� �ٱ��� �����ִ°��� static���� ����ż� Ŭ���� A������ �ƴ�
//	String name;
//}
//
//class B {
//	String name;
//}
//
//class C {
//	String name;
//}
