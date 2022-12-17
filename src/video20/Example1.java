package video20;

// anonymous inner class vs lambda expression
public class Example1 {
	public static void main(String[] args) {
		Runnable r = new Runnable() { // anonymous inner class, here we are creating object of implementation class of Runnable interface
			
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("child thread : " + i); // job of the thread
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("main thread : " + i);
		}
	}
}
