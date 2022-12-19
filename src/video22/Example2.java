package video22;

// variable declared inside lambda expression is local variable
interface Interface2 {
	void m1();
}
public class Example2 {
	int x = 888;
	void m2() {
		Interface2 i = ()->{
			int x = 999; // local variable
			System.out.println(this.x); // 888
		};
		i.m1();
	}
	public static void main(String[] args) {
		Example2 e = new Example2();
		e.m2();
	}
}
