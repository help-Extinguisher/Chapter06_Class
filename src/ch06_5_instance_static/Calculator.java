package ch06_5_instance_static;

public class Calculator {
	
	//필드
	static double pi = 3.14159; // 전역으로 빠지는 변수가 되었구나~^^
	
	
	
	//생성자
//	public Calculator() {
//		
//	}
	
	
	
	
	//메소드
	static int plus(int x, int y) {
		return x + y;
//		return this.x + this.y  // 스테틱 (정적뭐시기) 이라서 안됨
	}
	
	static int minus (int x, int y) {
		return x - y;
	}

}
