package video24;

interface I2 {
	default void m1() {
		System.out.println("default method");
	}
}

public class Example2 implements I2 {

	public static void main(String[] args) {
		Example2 e = new Example2();
		e.m1();
	}

}
