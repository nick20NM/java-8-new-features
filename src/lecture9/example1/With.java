package lecture9.example1;

// with lambda expression
interface Interface2 {
	void add(int a, int b);
}
public class With {
	public static void main(String[] args) {
		Interface2 i1 = (a, b)->System.out.println("sum is:"+(a+b));
		i1.add(10, 20);
		i1.add(100, 200);
	}
}
