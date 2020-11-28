package Queue;
//Write a program to count the even numbers in a queue using arrays.
public class CountEvenNumbers {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingArray<Integer> queue = new QueueUsingArray<>();//Chirag19CSU071
		queue.enqueue(new Integer(1));
		queue.enqueue(new Integer(2));
		queue.enqueue(new Integer(3));
		queue.enqueue(new Integer(4));
		queue.enqueue(new Integer(5));
		queue.enqueue(new Integer(6));
		queue.enqueue(new Integer(7));
		queue.enqueue(new Integer(8));
		queue.enqueue(new Integer(9));
		
		System.out.print("The Queue is : ");
		queue.display();
		System.out.println("The Number of Even Elements in the Queue is : "+countEven(queue));
	}
	@SuppressWarnings("unchecked")
	public static<E> E countEven(QueueUsingArray<E> queue) {
		Integer count = 0;
//		System.out.println("Dequeued Element : "+queue.dequeue());
		while(!queue.isEmpty()) {
			if((Integer)queue.dequeue() % 2 == 0) {
				count++;	
			}
		}
		
		
		return (E)count;
		
	}

}
