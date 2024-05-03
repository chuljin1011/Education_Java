package oop;

public class SingletonApp {
	public static void main(String[] args) {
//		Singleton singleton1 = new Singleton();
//		Singleton singleton2 = new Singleton();
//		
//		singleton1.display();
//		singleton2.display();
		
		Singleton singleton1 = Singleton.getSingleton();
		Singleton singleton2 = Singleton.getSingleton();
		
		System.out.println(singleton1);
		System.out.println(singleton2);
		System.out.println(Singleton.getSingleton());
		
		singleton1.display();
		singleton2.display();
		System.out.println("===============================================");
		
		Singleton.getSingleton().display();
		
	}

}
