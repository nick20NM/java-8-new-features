package video17;

import java.util.TreeSet;

public class TreeSetWithLambdaExpression {
	public static void main(String[] args) {
//		TreeSet<Integer> treeSet = new TreeSet<>(); // [10, 20, 30, 50, 60, 90]
		TreeSet<Integer> treeSet = new TreeSet<>( (obj1, obj2) -> (obj1>obj2) ? -1 : (obj1<obj2) ? 1 : 0 );
		treeSet.add(50);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(60);
		treeSet.add(10);
		treeSet.add(90);
		System.out.println(treeSet); // [90, 60, 50, 30, 20, 10]
		
		
	}
}
