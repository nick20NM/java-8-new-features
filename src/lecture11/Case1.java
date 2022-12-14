package lecture11;

// case-1, when more than one abstract methods
interface Interface1 {
	void m1(int i);
//	void m2(int i);
}
public class Case1 {
	public static void main(String[] args) {
		Interface1 i1 = i->System.out.println(i*i);
		i1.m1(5);
	}
}
//Case1.java:10: error: incompatible types: Interface1 is not a functional interface
//Interface1 i1 = i->System.out.println(i*i);
//                ^
//multiple non-overriding abstract methods found in interface Interface1
//1 error

