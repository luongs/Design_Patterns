package ch5;

public class ClassicSingleton {
	
	private static ClassicSingleton uniqueInstance;
	
	private ClassicSingleton(){};
	
	// Problem arises if multiple threads use this code
	public static ClassicSingleton getInstance(){
		if (uniqueInstance == null){
			uniqueInstance = new ClassicSingleton();
		}
		return uniqueInstance;
	}
	
	// other methods...
}
