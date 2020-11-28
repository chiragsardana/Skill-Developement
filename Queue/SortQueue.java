package Queue;
//Write a program to sort the values in ascending order in a queue.
public class SortQueue {
//
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		QueueUsingNode<Integer> queue = new QueueUsingNode<>();//Chirag19CSU071
		queue.enqueue(new Integer(71));
		queue.enqueue(new Integer(22));
		queue.enqueue(new Integer(9));
		queue.enqueue(new Integer(34));
//		queue.enqueue(new Integer(56));
//		queue.enqueue(new Integer(99));
//		queue.enqueue(new Integer(11));
//		queue.enqueue(new Integer(30));
		
		System.out.println("The Size of Queue is : "+queue.size());
		
		System.out.print("The Queue Looks Like : ");
		queue.display();
		
//		System.out.println("The Minimum Value index in the Queue is : "+minIndex(queue,queue.size()));
		for(int i = 1;i<=queue.size();i++) {
			int minIndex = minIndex(queue, queue.size()-i);
			insertMinToRear(queue,minIndex);
		}
		
		System.out.print("The Sorted Queue Looks Like : ");
		queue.display();
		
	}
	static Integer minIndex(QueueUsingNode<Integer> queue, int sortIndex) {
		int minIndex = -1;
		int minValue = Integer.MAX_VALUE;
		int size = queue.size();
		for(int i = 0 ;i< size;i++) {
			int current = queue.dequeue();
			if (current <= minValue && i <= sortIndex) 
	        { 
	            minIndex = i; 
	            minValue = current; 
	        } 
			queue.enqueue(current);
		}
		return minIndex;
	}
	static void insertMinToRear(QueueUsingNode<Integer> queue,int minIndex) {
		int min_value = 0;  
        int s = queue.size(); 
        for (int i = 0; i < s; i++) 
        { 
        	int current = queue.dequeue(); 
        	if (i != minIndex) 
        		queue.enqueue(current); 
        	else
        		min_value = current; 
        } 
        queue.enqueue(min_value);
	}
}
