package video18;

import java.util.TreeMap;

// video18
public class TreeMapWithLambdaExpression {
	public static void main(String[] args) {
//		TreeMap<Integer, String> treeMap = new TreeMap<>(); // {100=sonny, 200=jerry, 300=donny, 400=ben, 500=tom, 800=monny}
		TreeMap<Integer, String> treeMap = new TreeMap<>( (obj1, obj2) -> (obj1>obj2) ? -1 : (obj1<obj2) ? 1 : 0 ); // (obj1, obj2) -> (obj1>obj2) ? -1 : (obj<obj2) ? 1 : 0
		treeMap.put(500, "tom");
		treeMap.put(200, "jerry");
		treeMap.put(400, "ben");
		treeMap.put(300, "donny");
		treeMap.put(100, "sonny");
		treeMap.put(800, "monny");
		System.out.println(treeMap);
	}
}
