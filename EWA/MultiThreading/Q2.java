package MultiThreading;
/*
 Write a program, which can run two-thread simultaneously. One thread will calculate the
factorial of a number and another thread will calculate the factors of that number. Make
sure main thread finishes last.
Definition of Done:
i. Create threads either by extending Thread class or by implementing Runnable interface
ii. Inside run() perform the desired operations
iii. Use join() to ensure that main thread finishes last
 */
public class Q2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FactorialThread factorial = new FactorialThread("factorial", 5);
		FactorThread factor = new FactorThread("factor",12);
		Thread factorialThread = new Thread(factorial);
		Thread factorThread = new Thread(factor);
		factorialThread.start();
		factorThread.start();
		factorialThread.join();
		factorThread.join();
		Thread main = Thread.currentThread();
		
		System.out.println("Exiting "+main.getName());
	}

}
