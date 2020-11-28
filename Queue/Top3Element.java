//Write a program to delete the top 3 elements in a linear queue.
package Queue;

public class Top3Element {
	public static void main(String[] args) {
		QueueUsingNode<Integer> queue = new QueueUsingNode<>();
		queue.enqueue(new Integer(10));
		queue.enqueue(new Integer(20));
		queue.enqueue(new Integer(30));
		queue.enqueue(new Integer(40));
		queue.enqueue(new Integer(50));//Chirag19CSU071
		queue.enqueue(new Integer(60));
		
		System.out.print("The Queue is : ");
		queue.display();
		deleteTopThree(queue);
		System.out.print("\nThe Modified Queue : ");
		queue.display();
	}
	static void deleteTopThree(QueueUsingNode<Integer> queue) {
		for(int i = 0;i < 3 ;i++) {
			if(!queue.isEmpty()) {
				queue.dequeue();
			}
		}
	}
}
