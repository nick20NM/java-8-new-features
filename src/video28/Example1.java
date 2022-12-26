package video28;

import java.util.function.Predicate;

public class Example1 {

	public static void main(String[] args) {
		Predicate<Integer> p=i->i>0;
		System.out.println(p.test(100));
		System.out.println(p.test(5));
//		System.out.println(p.test("hello")); // compile time error
	}

}
