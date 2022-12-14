package lecture9.example2;

// without lambda expression
interface Interface1{
	int getLength(String s);
}
class Class1 implements Interface1 {
	@Override
	public int getLength(String s) {
		return s.length();
	}
}
public class Without {
	public static void main(String[] args) {
		Interface1 i1 = new Class1();
		System.out.println(i1.getLength("hello"));
		System.out.println(i1.getLength("without lambda expression"));
	}
}
