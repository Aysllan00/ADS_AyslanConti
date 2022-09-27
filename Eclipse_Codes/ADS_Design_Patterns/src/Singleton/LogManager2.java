package Singleton;

public class LogManager2 {

	private static LogManager2 instance;
	
	private LogManager2() {
		
	}
	
	public static LogManager2 getInstance() { //ctrl+3 -- gg - generate
		if(instance == null) {
			instance = new LogManager2();
		}
		
		return instance;
	}
	
	public void info(String msg) {
		System.out.println(msg); //syso + ctrl+space
	}

}
