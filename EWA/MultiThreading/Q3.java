package MultiThreading;
/*
 Write a program called ReverseHello.java that creates a thread (let's call it Thread 1). Thread 1
creates another thread (Thread 2); Thread 2 creates Thread 3; and so on, up to Thread 50.
Each thread should print "Hello from Thread <num>!", but you should structure your program
such that the threads print their greetings in reverse order.
Definition of Done:
i. Create thread either by extending Thread class or implementing Runnable interface
ii. Inside run() perform the desired operations
iii. Show the desired output
 */
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseHello reverse = new ReverseHello(0, "Hello 0");
		Thread reverseThread = new Thread(reverse);
		reverseThread.start();
	}

}
