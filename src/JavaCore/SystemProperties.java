package JavaCore;

public class SystemProperties {
	
	public static void main(String[] args) {
		System.out.println("java.home: " + System.getProperty("java.home"));
		System.out.println("java.version: " + System.getProperty("java.version"));
		System.out.println("os.arch: " + System.getProperty("os.arch"));
		System.out.println("os.name: " + System.getProperty("os.name"));
		System.out.println("os.version: " + System.getProperty("os.version"));
		
		System.out.println("user.dir: " + System.getProperty("user.dir"));
		System.out.println("user.home: " + System.getProperty("user.home"));
	}
}
