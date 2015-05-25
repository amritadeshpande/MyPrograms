
public class JavaThreadsPractice extends Thread {
	
	@Override
	public void run() {
		System.out.println("Thread running");
	}
	
	public static void main(String[] args) throws InterruptedException {
		JavaThreadsPractice j1 = new JavaThreadsPractice();
		
		
		ThreadsusingRunnable m1 = new ThreadsusingRunnable();
		Thread t1 = new Thread(m1);
		
		t1.setPriority(10);
		j1.start();
		t1.start();
	}

}

class ThreadsusingRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread using runnable");
		
	}
	
}
