package video19;

import java.util.ArrayList;
import java.util.Collections;

// custom/user-defined class object sorting
class Employee {
	int eno;
	String ename;
	
	public Employee(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}
	
	@Override
	public String toString() {
		return eno + " : " + ename;
	}
	
}
public class EmployeeTest {
	
//	example-1
//	public static void main(String[] args) {
//		Employee e1 = new Employee(20, "tom");
//		System.out.println(e1); // without overriding toString() -> video19.Employee@4617c264
//	}
	
	public static void main(String[] args) {
		ArrayList<Employee> e= new ArrayList<>();
		e.add(new Employee(20, "tom"));
		e.add(new Employee(50, "jerry"));
		e.add(new Employee(30, "ben"));
		e.add(new Employee(60, "donny"));
		e.add(new Employee(10, "sonny"));
		System.out.println("before sorting : " + e);
		Collections.sort(e, (e1, e2) -> (e1.eno>e2.eno) ? 1 : (e1.eno<e2.eno) ? -1 : 0 );
		System.out.println("after sorting : " + e);
	}
}
