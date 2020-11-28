//Write a program to replace the character ‘e’
//with ‘a’ each times it comes in a circular queue.
package Queue;

public class ReplaceCircularQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueueUsingArray<Character> queue = new CircularQueueUsingArray<>();
		queue.enqueue('a');
		queue.enqueue('b');
		queue.enqueue('c');
		queue.enqueue('d');	//Chirag19CSu071
		queue.enqueue('e');
		System.out.print("The queue is : ");
		queue.display();
		replace_e_with_a(queue);
		System.out.print("\nThe Modified Queue : ");
		queue.display();
	}
	static void replace_e_with_a(CircularQueueUsingArray<Character> queue) {
		for(int i = 0;i < queue.size();i++) {
			Character ch = queue.dequeue();
			if(ch == 'e') {
				ch = 'a';
			}
			queue.enqueue(ch);
		}
	}

}
