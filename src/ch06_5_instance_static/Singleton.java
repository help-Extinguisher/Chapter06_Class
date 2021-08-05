package ch06_5_instance_static;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}

}
