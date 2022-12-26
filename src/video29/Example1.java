package video29;

import java.util.function.Predicate;

public class Example1 {

	public static void main(String[] args) {
		Predicate<String> p=s->s.length()>5;
		System.out.println(p.test("hello hello"));
		System.out.println(p.test("hey"));
	}

}
