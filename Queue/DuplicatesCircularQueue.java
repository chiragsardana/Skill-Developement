package Queue;
//Write a program to find duplicates elements in a circular queue.
public class DuplicatesCircularQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueueUsingArray<Integer> queue = new CircularQueueUsingArray<>(10);
//		System.out.println(queue.size());
		queue.enqueue(new Integer(10));
		queue.enqueue(new Integer(20));
		queue.enqueue(new Integer(40));
//		queue.enqueue(new Integer(10));
		queue.enqueue(new Integer(30));
		queue.enqueue(new Integer(10));						//Chirag19CSU071
		queue.enqueue(new Integer(20));
//		queue.enqueue(new Integer(40));
//		queue.enqueue(new Integer(10));
		queue.enqueue(new Integer(30));
		
		System.out.println("The Size of Circular Queue : "+queue.size());
		
		for(int i = 1;i<=queue.size();i++) {
			int minIndex = minIndex(queue, queue.size()-i);
			insertMinToRear(queue,minIndex);
		}
		
		System.out.print("The Sorted Circular Queue : ");
		queue.display();
		
		System.out.print("The Duplicates Element in the Circular Queue : ");
		for(int i = 1;i<=queue.size();i++) {
			int current = queue.dequeue();
			int special = i;
			while(current == queue.peek()) {
				i++;
				queue.enqueue(current);
				current = queue.dequeue();
			}
			if(special!=i) {
				System.out.print(current+" ");
			}
			queue.enqueue(current);
		}
		
		System.out.print("\nThe Circular Queue : ");
		queue.display();
		
	}
	
	static Integer minIndex(CircularQueueUsingArray<Integer> queue, int sortIndex) {
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
	static void insertMinToRear(CircularQueueUsingArray<Integer> queue,int minIndex) {
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