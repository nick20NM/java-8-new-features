package video38;

import java.util.function.Predicate;

// isEqual() in Predicate
// it is static method
public class Example1 {

	public static void main(String[] args) {
		Predicate<String> p = Predicate.isEqual("HELLO");
		System.out.println(p.test("HELLO"));
		System.out.println(p.test("TOM"));
	}

}
