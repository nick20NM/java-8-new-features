package lecture8;

// without lambda expression
interface Interface1 {
	void m1();
}

class Class1 implements Interface1 {

//	@Override
	public void m1() {
		System.out.println("without lambda expression");
	}
	
}

public class WithoutLambdaExpression {
	public static void main(String[] args) {
		Interface1 i1 = new Class1();
		i1.m1();
	}
}
