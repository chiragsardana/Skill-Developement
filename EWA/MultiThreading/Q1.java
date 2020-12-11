package MultiThreading;


/*Write a java program that implements a multi-thread application that has different threads. First
thread generates random integer every 1 second and if the value is even, second thread
computes the square of the number and prints. If the value is odd, the thread will print the
value of the number.
Definition of Done:
i. Create threads either by extending Thread class or by implementing Runnable interface
ii. Use Math.random() for generating random integer numbers
iii. Put the thread logic inside run()
iv. Show the desired output*/
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstThread first = new FirstThread("first");
		Thread firstThread = new Thread(first);
		firstThread.start();
	}

}
