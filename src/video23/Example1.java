package video23;

interface Interface1 {
	void m1();
}
public class Example1 {
	int x = 10;
	void m2() {
		int y = 20;
		Interface1 i = ()->{
			x=100;
/*			y=200;  Example1.java:12: error: local variables referenced from a lambda expression must be final or effectively final
					            y=200;
					            ^
					Example1.java:14: error: local variables referenced from a lambda expression must be final or effectively final
					            System.out.println(y); // enclosing method variable
					                               ^
					2 errors */
			System.out.println(x); // enclosing/outer class variable
			System.out.println(y); // enclosing method variable
		};
		i.m1();
	}
	public static void main(String[] args) {
		Example1 e = new Example1();
		e.m2();
	}

}
