package ch06_5_instance_static;

public class Car_ {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car_ myCar = new Car_();
		myCar.speed = 60;
		myCar.run();
	}

}
