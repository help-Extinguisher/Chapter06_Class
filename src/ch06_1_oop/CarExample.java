package ch06_1_oop;

public class CarExample {
	public static void main(String[] args) {
		
//		객체 생성 (인스턴스화)
//		Car myCar = new Car();
		Car myCar = new Car("기아차", "카니발", "흰색");
		
//		필드값 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명:  " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		
		
//		필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
		
		
		
//		생성자 오버로딩
		Circle c1 = new Circle(1);
		Circle c2 = new Circle(100);
		
		
		
	}

}
