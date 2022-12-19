package video22;

// instance/non-static variable can be declared inside anonymous inner class
interface Interface1 {
	void m1();
}
public class Example1 {
	int x = 888;
	void m2() {
		Interface1 i = new Interface1() {
			int x = 999; // instance/non-static variable
			@Override
			public void m1() {
				System.out.println(this.x);
				System.out.println(Example1.this.x); // 888
			}
		};
		i.m1();
	}
	public static void main(String[] args) {
		Example1 e = new Example1();
		e.m2();
	}
}
