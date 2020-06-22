package dp.singleton;

public class Singleton {

	private static final Singleton SINGLETONINSTANCE;
	
	static {
		
		SINGLETONINSTANCE = new Singleton();
		
	}
	
	private Singleton() {
		System.out.print("Instanciation");
	}
	
	public static Singleton getInstance() {
		return SINGLETONINSTANCE;
	}
	
	public void operation(String name) {
		System.out.print("Opération : + " + name);
		
		
		
	}
	
}
