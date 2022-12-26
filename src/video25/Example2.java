package video25;

interface Left2{
	default void m1() {
		System.out.println("left default method");
	}
}
interface Right2{
	default void m1() {
		System.out.println("right implementation method");
	}
}
public class Example2 implements Left, Right {
	public void m1() {
//		System.out.println("my own implementation");
//		Left.super.m1();
		Right.super.m1();
	}
	public static void main(String[] args) {
		Example2 e = new Example2();
		e.m1();
	}

}
