package lecture10;

// threads -> without lamba expression
class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) { // job of the thread/method
			System.out.println("child thread:"+i);
		}
	}
}
public class Without {
	public static void main(String[] args) {
		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread:"+i);
		}
	}
}
