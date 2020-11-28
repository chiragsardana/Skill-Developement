package Queue;

//Write a menu – driven program to Implement Circular Queue Using Array.
//Definition of Done:
//a) The program should display a menu 
//(1) Enqueue (2) Dequeue (3) Display (4) Exit. 
//b) The program should define functions for the menu item listed above.

public class QueueTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueueUsingArray<String> queue = new CircularQueueUsingArray<>();
		queue.enqueue(new String("Chirag"));
		queue.enqueue(new String("Sardana"));
		queue.enqueue(new String("19"));
		queue.enqueue(new String("CSU"));
		queue.enqueue(new String("071"));
		
		System.out.print("The Elements in the Queue is : ");
		queue.display();
//		for(int i =0;i<5;i++) {
//			queue.dequeue();
//			queue.display();
//		}
		
		System.out.println("T he Dequeue Element in the Queue  is : "+queue.dequeue());
		System.out.println("The Dequeue Element in the Queue  is : "+queue.dequeue());
		System.out.println("The Peek Element in the Queue  is : "+queue.peek());
		System.out.println("The Dequeue Element in the Queue  is : "+queue.dequeue());
		System.out.println("The Dequeue Element in the Queue  is : "+queue.dequeue());
//		System.out.println("The Dequeue Element in the Queue  is : "+queue.dequeue());
//		System.out.println("The Dequeue Element in the Queue  is : "+queue.dequeue());
		System.out.println("The Peek Element in the Queue  is : "+queue.peek());
		
		System.out.print("The Elements left in the Queue : ");
		queue.display();
	}

}
