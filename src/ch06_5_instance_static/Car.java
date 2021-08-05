package ch06_5_instance_static;

public class Car {
	// 필드
	String model;
	int speed;
	
	
	//생성자
	Car(String model) {
		this.model = model;
	}

		
		
		//메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	void run() {
//		for (int i = 10; i <= 50; i += 10) {
		for (int i = 0; i < 5; i++) {
			this.setSpeed(i * 10);
			System.out.println(this.model + " 가 달립니다. (시속 :" + this.speed + "km/h)");
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
//	// 사실상 바깥에 나와있는거임 static으로 선언돼서 클래스 A꺼만이 아님
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
