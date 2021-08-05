package ch06_5_instance_static;

public class SingletonExample {
	public static void main(String[] args) {
		/*
		 * Singleton obj1 = new Singleton(); // �� new�ȵ�~
		 * Singleton obj2 = new Singleton();
		 */
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� singleton ��ü�Դϴ�.");
		}
		
		
	}

}
