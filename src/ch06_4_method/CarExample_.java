package ch06_4_method;

public class CarExample_ {
	public static void main(String[] args) {
		Car_ nCar = new Car_();
		nCar.keyTurnOn();
		nCar.run();
		int speed = nCar.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");
		
	}

}
