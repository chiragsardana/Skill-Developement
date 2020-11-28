package Queue;
//Write a menu-driven program for the Implementation of DEQUEUE
public class DequeueTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DequeueUsingArray<Integer> queue = new DequeueUsingArray<>();
		//queue.enqueueFront(new Integer(10));
		//System.out.println("The Size of Queue is : "+queue.size());
		
		queue.enqueueFront(new Integer(10));
		queue.enqueueRear(new Integer(20));
		queue.enqueueRear(new Integer(30));
		queue.enqueueFront(new Integer(40));
		queue.enqueueFront(new Integer(50));		//Chirag19CSU071
		queue.enqueueRear(new Integer(60));
		queue.enqueueRear(new Integer(70));
		queue.enqueueFront(new Integer(80));
		queue.enqueueFront(new Integer(90));
		queue.enqueueRear(new Integer(100));
//		System.out.println("The Size of Queue is : "+queue.size());
		queue.dequeueFront();
		queue.dequeueRear();
		queue.dequeueFront(); 
		System.out.print("The Doubly Ended Queue : ");
		queue.display();
		
		System.out.println("The Size of Queue is : "+queue.size());
		
		System.out.println("The Rear Peak Element is : "+queue.peekRear());
		System.out.println("The Front Peak Element is : "+queue.peekFront());
	}

}
