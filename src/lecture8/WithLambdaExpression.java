package lecture8;

// with lambda expression
interface Interface2 {
	void m1();
}

public class WithLambdaExpression {
	public static void main(String[] args) {
		Interface2 i1 = ()->System.out.println("with lambda expression");
		i1.m1();
	}
}
