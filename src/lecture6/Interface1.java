package lecture6;

// example-1
@FunctionalInterface
public interface Interface1 {
	public void m1();
	
	default void m2() {
		
	}
	
	public static void m3() {
		
	}
}
