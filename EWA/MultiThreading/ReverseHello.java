package MultiThreading;

public class ReverseHello implements Runnable {
	static int maxValue = 50;
	private int counter;
	private String threadName;
	public ReverseHello(int counter,String threadName) {
		// TODO Auto-generated constructor stub
		this.counter = counter;
		this.threadName = threadName;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(counter <= maxValue) {
			counter++;
			createNewThread();
		}
	}
	public void createNewThread() {
		ReverseHello reverse = new ReverseHello(counter,("Hello "+counter));
		Thread creating = new Thread(reverse);
		creating.start();
		try {
			creating.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.threadName);
	}

}
