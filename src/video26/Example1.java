package video26;
// interface static method
// 1) main purpose of interface static method is to define general utility method
// 2) by default not available to the implementation class
// 3) can be called by using interface name only
interface I{
	public static void m1() {
		System.out.println("interface static method");
	}
}
public class Example1 implements I {

	public static void main(String[] args) {
//		m1();
//		Example1 e = new Example1();
//		e.m1();
//		Example1.m1();
		I.m1(); // only one way to call interface static method
	}

}
