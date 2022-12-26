package video35;

import java.util.ArrayList;

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

	public String toString() {
		String s = String.format("(%s, %s, %.2f, %s)", name, designation, salary, city);
		return s;
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
		System.out.println(list);
		
	}
	
	public static void populate(ArrayList<Employee> list) {
		list.add(new Employee("tom", "ceo", 80000, "raipur"));
		list.add(new Employee("jerry", "manager", 70000, "bilaspur"));
		list.add(new Employee("tony", "manager", 70000, "raigarh"));
		list.add(new Employee("jojo", "lead", 60000, "delhi"));
		list.add(new Employee("ben", "senior developer", 50000, "pune"));
		list.add(new Employee("adam", "senior developer", 50000, "kolkata"));
		list.add(new Employee("binod", "junior developer", 40000, "bangalore"));
		list.add(new Employee("tommy", "junior developer", 40000, "sakti"));
		list.add(new Employee("jimmy", "junior developer", 40000, "hyderabad"));
	}

}
