package lecture9.example3;

// with lambda expression
interface Interface2 {
	int squareNumber(int i);
}
public class With {
	public static void main(String[] args) {
		Interface2 i1 = i->i*i;
		System.out.println(i1.squareNumber(3));
		System.out.println(i1.squareNumber(4));
	}
}
