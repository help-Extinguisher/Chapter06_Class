package ch06_1_oop;

public class KoreanExample {
	public static void main(String[] args) {
		
		Korean k1 = new Korean("���ڹ�", "000000-000000");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("���ڹ�", "111111-1111111");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn );
	}

}
