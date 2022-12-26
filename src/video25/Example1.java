package video25;

interface Left {
	default void m1() {
		System.out.println("left default method");
	}
}

interface Right {
	default void m1() {
		System.out.println("right default method");
	}
}
 public class Example1{
//public class Example1 implements Left, Right { // compile time error
//	Example1.java:15: error: types Left and Right are incompatible;
//	public class Example1 implements Left, Right {
//	       ^
//	  class Example1 inherits unrelated defaults for m1() from types Left and Right
//	1 error
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
