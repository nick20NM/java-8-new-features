package video34;

import java.util.function.Predicate;

class SoftwareEngineer {
	String name;
	int age;
	boolean isHavingGF;

	SoftwareEngineer(String name, int age, boolean isHavingGF) {
		this.name = name;
		this.age = age;
		this.isHavingGF = isHavingGF;
	}

	public String toString() {
		return name;
	}
}

public class Test {

	public static void main(String[] args) {
		SoftwareEngineer[] a= {
				new SoftwareEngineer("tony", 20, true),
				new SoftwareEngineer("tom", 50, false),
				new SoftwareEngineer("jerry", 17, true),
				new SoftwareEngineer("ben", 25, false),
				new SoftwareEngineer("dora", 27, true),
				new SoftwareEngineer("binod", 30, true)
		};
		Predicate<SoftwareEngineer> p=s->s.age>18 && s.isHavingGF==true;
		for(SoftwareEngineer s:a) {
			if (p.test(s)) {
				System.out.println(s);
			}
		}
	}

}
