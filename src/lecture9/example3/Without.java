package lecture9.example3;

// without lambda expression
interface Interface1 {
	int squareNumber(int i);
}
class Class1 implements Interface1{
	@Override
	public int squareNumber(int i) {
		return i*i;
	}
}
public class Without {
	public static void main(String[] args) {
		Interface1 i1 = new Class1();
		System.out.println(i1.squareNumber(4)); 
		System.out.println(i1.squareNumber(5)); 
	}
}
