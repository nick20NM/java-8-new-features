package lecture9.example1;

// without lambda expression
interface Interface1 {
	void add(int a, int b);
}
class Class1 implements Interface1 {

	@Override
	public void add(int a, int b) {
		System.out.println("sum is:"+(a+b));
	}
}
public class Without {
	public static void main(String[] args) {
		Interface1 i1 = new Class1();
		i1.add(10, 20);
		i1.add(100, 200);
	}
}
