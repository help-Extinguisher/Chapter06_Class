package ch06_1_oop;

public class StudentExample {
	public static void main(String[] args) {
		
		
//		**********���� �ʿ�***************
		
		Student s1 = new Student();
		System.out.println("S1 ������ Student ��ü�� �����մϴ�.");
		s1.num = 1;
		
		Student s2 = new Student();
		System.out.println("S2 ������ �� �ٸ� Student ��ü�� �����մϴ�.");
		s2.num = 2;
		
		System.out.println(s1.num);
		System.out.println(s2.num);
		
		
	} 

}
