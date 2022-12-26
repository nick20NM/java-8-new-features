package video29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Example2 {

	public static void main(String[] args) {
		Predicate<Collection> p=c->c.isEmpty();
	    ArrayList l1=new ArrayList<>();
	    l1.add(10);
	    System.out.println(p.test(l1));
	    
	    ArrayList l2=new ArrayList<>();
	    System.out.println(p.test(l2));
	}

}
