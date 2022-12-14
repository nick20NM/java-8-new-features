package lecture11;

// case-2, advantage of @FunctionalInterface -> is to tell an interface can contain only one abstract method
@FunctionalInterface
interface Interface2 {
	void m1();
//	void m2(); // compile time error
}
public class Case2 {
	public static void main(String[] args) {
		Interface2 a = ()->System.out.println("hello");
		a.m1();
	}
}
//Case2.java:4: error: Unexpected @FunctionalInterface annotation
//@FunctionalInterface
//^
//  Interface2 is not a functional interface
//    multiple non-overriding abstract methods found in interface Interface2
//Case2.java:11: error: incompatible types: Interface2 is not a functional interface
//                Interface2 a = ()->System.out.println("hello");
//                               ^
//    multiple non-overriding abstract methods found in interface Interface2
//2 errors
