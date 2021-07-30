package ch06_1_oop;

public class StudentExample {
	public static void main(String[] args) {
		
		
//		**********이해 필요***************
		
		Student s1 = new Student();
		System.out.println("S1 변수가 Student 객체를 참조합니다.");
		s1.num = 1;
		
		Student s2 = new Student();
		System.out.println("S2 변수가 또 다른 Student 객체를 참조합니다.");
		s2.num = 2;
		
		System.out.println(s1.num);
		System.out.println(s2.num);
		
		
	} 

}
