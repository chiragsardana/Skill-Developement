package MultiThreading;
/*
 * Write a program to depict “two people one bank account” problem and How Ryan and Monica
end up with inconsistent amount leading to concurrency issues and how you can solve this issue
using the synchronized block/keyword.
Definition of Done:
i. Create two thread objects namely Ryan and Monica either by extending Thread class or
implementing Runnable interface
ii. You can ask the user to enter the initial amount and perform the desired operation
inside run()
iii. Show the desired result
 */
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RyanAndMonica ryanAndMonica = new RyanAndMonica();
		Thread Ryan = new Thread(ryanAndMonica,"Ryan");
		Thread Monica = new Thread(ryanAndMonica, "Monica");
		
		Ryan.start();
		Monica.start();
	}

}
