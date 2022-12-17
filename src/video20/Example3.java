package video20;

public class Example3 {

	public static void main(String[] args) {
		Thread t = new Thread( ()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("child thread " + i);
			}
		});
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread " + i);
		}
	}

}
