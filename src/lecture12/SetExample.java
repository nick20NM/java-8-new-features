package lecture12;

import java.util.HashSet;

public class SetExample {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<>();
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("A");
		System.out.println(h);
	}
}
