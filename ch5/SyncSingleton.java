package ch5;

public class SyncSingleton {
	
private static SyncSingleton uniqueInstance;
	
	private SyncSingleton(){};
	
	// Fixes multiple thread problem
	// Synchronize call decrease performance consider other options 
	// if this is called in a high traffic portion of code 
	public static synchronized SyncSingleton getInstance(){
		if (uniqueInstance == null){
			uniqueInstance = new SyncSingleton();
		}
		return uniqueInstance;
	}
	
	// other methods...

}
