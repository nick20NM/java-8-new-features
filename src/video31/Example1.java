package video31;

import java.util.function.Predicate;

public class Example1 {

	public static void main(String[] args) {
		String[] names = { "tony", "ben", "stark", "bindo", "tom", "ballu" };
		Predicate<String> p = n -> n.charAt(0) == 'b';
		System.out.println("name starts witk k are:");
		for (String name : names) {
//			if (p.negate().test(name)) {
				if (p.test(name)) {
				System.out.println(name);
			}
		}
	}

}
