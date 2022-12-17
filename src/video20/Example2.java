package video20;

public class Example2 {
	public static void main(String[] args) {
		Runnable r = ()->{ // lambda expression
			for (int i = 1; i <= 10; i++) {
				System.out.println("child thread : " + i);
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("main thread " + i);
		}
		
	}

}
