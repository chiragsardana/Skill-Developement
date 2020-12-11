package MultiThreading;
/*
 * Write a producer-consumer program for Ryan and Monica where Monica (Producer) keeps on
depositing the money up to a certain limit and Ryan (Consumer) keeps withdrawing the money
up to a certain number of times.
When the balance gets insufficient, Ryan will wait for Monica to deposit more money and notify
him again.
Definition of Done:
i. Create two thread objects either by extending the Thread class or implementing the
Runnable interface
ii. You can ask the user to enter the initial amount and perform the desired operation inside
run()
iii. Show the desired result
 */
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProducerConsumer RyanAndMonica = new ProducerConsumer();
		Thread Ryan = new Thread(RyanAndMonica, "Ryan");
		Thread Monica = new Thread(RyanAndMonica, "Monica");
		Ryan.start();
		Monica.start();
	}

}
