package video30;

import java.util.function.Predicate;

public class Example1 {

	public static void main(String[] args) {
//		int[] a= {0,5,10,15,20,25,30};
		int[] a= {5,10,15,20,25,30};
		Predicate<Integer> p1=i->i>10;
		Predicate<Integer> p2=i->i%2==0;
		System.out.println("numbers greater than 10 are:");
		m1(p1, a);
		System.out.println("even numbers are:");
		m1(p2, a);
		System.out.println("numbers not greater than 10 are:");
		m1(p1.negate(), a);
		System.out.println("numbers greater than 10 and even are:");
		m1(p1.and(p2), a);
		System.out.println("numbers greater than 10 or even are:");
		m1(p1.or(p2), a);
		System.out.println("non even numbers are:");
		m1(p2.negate(), a);
	}
	
	public static void m1(Predicate<Integer> p,int[] a) {
		for (int i : a) {
			if (p.test(i)) {
				System.out.println(i);
			}
		}
	}

}
