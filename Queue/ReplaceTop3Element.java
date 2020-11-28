//Write a program to replace the top 3 elements with characters –  
//‘a’, ‘r’, ‘g’ respectively in a linear queue .
package Queue;

public class ReplaceTop3Element {
	public static void main(String[] args) {
		QueueUsingNode<Character> queue = new QueueUsingNode<>();
		queue.enqueue('c');
		queue.enqueue('h');
		queue.enqueue('i');
		queue.enqueue('r');
		queue.enqueue('a');
		queue.enqueue('g');
		
		System.out.print("The Queue is : ");
		queue.display();
		
		replaceTopThree(queue);
		
		System.out.print("The Modified Queue is : ");
		queue.display();
	}
	static void replaceTopThree(QueueUsingNode<Character> queue) {
		for(int i = 0;i < queue.size() ;i++) {
			if(!queue.isEmpty() && i == 0) {
				queue.dequeue();
				queue.enqueue('a');
			}
			else if(!queue.isEmpty() && i == 1) {
				queue.dequeue();
				queue.enqueue('r');
			}
			else if(!queue.isEmpty() && i == 2) {
				queue.dequeue();
				queue.enqueue('g');
			}else {
				queue.enqueue(queue.dequeue());
			}
			
		}
	}
}
