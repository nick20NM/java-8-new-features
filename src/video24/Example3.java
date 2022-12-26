package video24;

interface I3{
	default void m1() {
		System.out.println("default method");
	}
}
public class Example3 implements I3 {
	public void m1() {
		System.out.println("my own implementation");
	}
	public static void main(String[] args) {
		Example3 e = new Example3();
		e.m1();
	}

}
