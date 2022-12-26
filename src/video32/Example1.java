package video32;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Example1 {

	public static void main(String[] args) {
		String[] names= {"tony","",null,"stark","","tom",null};
		Predicate<String> p=n->n!=null && n.length()!=0;
		ArrayList<String> l=new ArrayList<>();
		for (String name : names) {
			if (p.test(name)) {
				l.add(name);
			}
		}
		System.out.print("valid names are:");
		System.out.println(l);
	}

}
