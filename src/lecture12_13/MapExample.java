package lecture12_13;

import java.util.HashMap;

public class MapExample {
	public static void main(String[] args) {
		HashMap<String, String> m = new HashMap<>();
		m.put("A", "Apple");
		m.put("B", "Ball");
		m.put("C", "Cat");
		m.put("D", "Dog");
		System.out.println(m);
	}
}
