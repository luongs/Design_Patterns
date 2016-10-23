package ch5;

public class EagerSingleton {
	
	// Fixes multithread problem
	// Use if singleton object created does not take up too many resources
	private static EagerSingleton uniqueInstance = new EagerSingleton();
	
	private EagerSingleton(){};
	
	public static EagerSingleton getEagerSingleton(){
		return uniqueInstance;
	}
}
