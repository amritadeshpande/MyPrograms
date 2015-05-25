
public class JavaThreads extends Thread {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		JavaThreads th = new JavaThreads();
		JavaThreads1 th1 = new JavaThreads1();
//		th.setPriority(MAX_PRIORITY);
		th1.start();
		th.start();
		th.join();
		th1.join();
		
		SingletonClass sigObj = SingletonClass.getInstance();
		System.out.println(sigObj.returnSum());
	}
 public void run() {
	 for (int i = 0; i < 10000; i++) {
		 //System.out.println("Hello world abcd");
		 SingletonClass sigObj = SingletonClass.getInstance();
		 sigObj.addNums(i, i);
		 
		 /*try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}
	

}
	
}
 class JavaThreads1 extends Thread{	
 public void run() {
	 for (int i = 0; i <10000; i++) {
		 //System.out.println("Good Bye");
		 SingletonClass sigObj = SingletonClass.getInstance();
		 sigObj.addNums_1(i, i);
		 
/*		 try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	

}
	
}
