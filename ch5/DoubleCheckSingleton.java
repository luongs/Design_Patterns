package ch5;

public class DoubleCheckSingleton {
	// use if sync performance is an issue
	// first check if an instance is created, if not then synchronize
	private volatile static DoubleCheckSingleton uniqueInstance;
	
	private DoubleCheckSingleton(){};
	
	public static DoubleCheckSingleton getInstance(){
		if (uniqueInstance == null){
			synchronized (DoubleCheckSingleton.class){
				if (uniqueInstance == null){
					uniqueInstance = new DoubleCheckSingleton();
				}
			}
		}
		return uniqueInstance;
	}
}
