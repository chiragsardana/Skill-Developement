//Write a program to replace the character ‘a’ with ‘ t’
//first time it occurs in a circular queue.
package Queue;

public class ReplaceFirstCircularQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueueUsingArray<Character> queue = new CircularQueueUsingArray<>();
		queue.enqueue('c');
		queue.enqueue('h');
		queue.enqueue('a');
		queue.enqueue('r');
		queue.enqueue('a');
		System.out.print("The Circular Queue is : ");
		queue.display();
		
		replaceFirst(queue);
		
		System.out.println("The Modified Queue is : ");
		queue.display();
	}
	static void replaceFirst(CircularQueueUsingArray<Character> queue) {
		int i;
		for(i = 0;i < queue.size();i++) {
			Character ch = queue.dequeue();
			if(ch == 'a') {
				ch = 't';
				queue.enqueue(ch);
				i++;
				break;
			}
			queue.enqueue(ch);
		}
		for(;i < queue.size();i++) {
			queue.enqueue(queue.dequeue());
		}
	}

}
