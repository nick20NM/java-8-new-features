package lecture14_15_16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// sorting objects without lambda expression
class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
//		if (o1>o2) {
//			return -1;
//		} if(o1<o2) {
//			return +1;
//		} else {
//			return 0;
//		}
		return (o1>o2) ? -1 : (o1<o2) ? 1 : 0;
	}
	
}
public class Without {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(50);
		al.add(60);
		al.add(10);
		al.add(30);
		al.add(70);
		System.out.println("before sorting:"+al);
		Collections.sort(al);
		System.out.println("after sorting:"+al);
		Collections.sort(al, new MyComparator());
		System.out.println("descending order:"+al);
		
	}
}
