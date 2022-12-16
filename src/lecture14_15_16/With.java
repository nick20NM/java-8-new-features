package lecture14_15_16;

import java.util.ArrayList;
import java.util.Collections;

// sorting objects with lambda expression
public class With {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(80);
		arrayList.add(40);
		arrayList.add(20);
		arrayList.add(60);
		arrayList.add(10);
		System.out.println("before sorting : " + arrayList);
		Collections.sort(arrayList);
		System.out.println("after sorting : " + arrayList);
		Collections.sort(arrayList, (obj1, obj2) -> (obj1>obj2) ? -1 : (obj1<obj2) ? 1 : 0 );
		System.out.println("descending order : " + arrayList);
	}
}
