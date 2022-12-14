package video35_36_37;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	String name;
	String designation;
	double salary;
	String city;

	Employee(String name, String designation, double salary, String city) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

//	public String toString() {
//		String s = String.format("[%s,%s,%.2f,%s]", name, designation, salary, city);
//		return s;
//	}
	
	public String toString(){
		String s=String.format("[%s,%s,%.2f,%s]",name,designation,salary,city);
		return s;
	}
	
	// need to override equals()
	public boolean equals(Object obj){
		Employee e=(Employee)obj;
		if(name.equals(e.name) && designation.equals(e.designation) && salary==e.salary && city==e.city)
			return true;
		else
			return false;
	}
}

public class EmployeeManagementApp {

	public static void main(String[] args) {
//		ArrayList<Employee> l = new ArrayList<>();
//		Employee e1 = new Employee("tom", "ceo", 50000, "raipur");
//		Employee e2 = new Employee("jerry", "manager", 40000, "bilaspur");
//		l.add(e1);
//		l.add(e2);
//		System.out.println(l);
		
		ArrayList<Employee> list=new ArrayList<>();
		populate(list);
		
		Predicate<Employee> p1=e->e.designation.equals("manager");
		System.out.println("managers information:");
		display(p1,list);
		
		Predicate<Employee> p2=e->e.city.equals("bangalore");
		System.out.println("bangalore employees information:");
		display(p2, list);
		
		Predicate<Employee> p3=e->e.salary<60000;
		System.out.println("all employees information whose salary < 60000");
		display(p3, list);
		
		System.out.println("all managers from bangalore to give pink slip");
		display(p1.and(p2), list);
		
		System.out.println("managers or salary < 60000");
		display(p1.or(p3), list);
		
		System.out.println("not managers");
		display(p1.negate(), list);
		
		// isEqual(), toString() & equals() must be overrided
		Predicate<Employee> isCEO = Predicate.isEqual(new Employee("tom","ceo",50000,"bangalore"));
		Employee e1 = new Employee("tom","ceo",50000,"bangalore");
		Employee e2 = new Employee("jerry", "manager", 40000, "hyderabad");
		System.out.println(isCEO.test(e1));
		System.out.println(isCEO.test(e2));
	}
	
	public static void populate(ArrayList<Employee> list) {
		list.add(new Employee("tom", "ceo", 80000, "bangalore"));
		list.add(new Employee("jerry", "manager", 70000, "hyderabad"));
		list.add(new Employee("tony", "manager", 70000, "bangalore"));
		list.add(new Employee("jojo", "lead", 60000, "hyderabad"));
		list.add(new Employee("ben", "senior developer", 50000, "bangalore"));
		list.add(new Employee("adam", "senior developer", 50000, "hyderabad"));
		list.add(new Employee("binod", "junior developer", 40000, "bangalore"));
		list.add(new Employee("tommy", "junior developer", 40000, "hyderabad"));
		list.add(new Employee("jimmy", "junior developer", 40000, "bangalore"));
	}
	
	public static void display(Predicate<Employee> p,ArrayList<Employee> list) {
		for(Employee e:list) {
			if (p.test(e)) {
				System.out.println(e);
			}
		}
		System.out.println("-------------------------------------------------------");
	}

}
