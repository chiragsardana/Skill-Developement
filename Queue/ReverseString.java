package Queue;
//Write a program to reverse the string using queue;
import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingStack<Character> queue = new QueueUsingStack<>();//Chirag19CSU071
		
		queue.enqueue(new Character('c'));
		queue.enqueue(new Character('h'));
		queue.enqueue(new Character('i'));
		queue.enqueue(new Character('r'));
		queue.enqueue(new Character('a'));
		queue.enqueue(new Character('g'));
		
		System.out.print("The Queue Looks Like : ");
		queue.display();
		
		Stack<Character> st = new Stack<>();
		while(!queue.isEmpty()) {
//			System.out.println(queue.peek());
			st.push(queue.dequeue());
		}
		
		while(!st.isEmpty()) {
			queue.enqueue(st.pop());
		}
		
		System.out.print("The Queue After Performing Certain Operation : ");
		queue.display();
	}

}
