package lecture9.example2;
// with lambda expression
interface Interface2 {
	int getLength(String s);
}
public class With {
	public static void main(String[] args) {
		Interface2 i1 = s->s.length();
		System.out.println(i1.getLength("hello"));
		System.out.println(i1.getLength("with lambda expression"));
	}
}
