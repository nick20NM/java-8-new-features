package video33;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
	String username;
	String password;
	User(String username, String password){
		this.username=username;
		this.password=password;
	}
}
public class UserAuthentication {

	public static void main(String[] args) {
		Predicate<User> p=u->u.username.equals("admin") && u.password.equals("admin");
		Scanner s = new Scanner(System.in);
		System.out.println("enter username");
		String username = s.next();
		System.out.println("enter password");
		String password = s.next();
		User user = new User(username, password);
//		if (p.test(new User(username, password))) {
			if (p.test(user)) {
			System.out.println("valid user");
		} else {
			System.out.println("invalid user");
		}
		s.close();
	}

}
