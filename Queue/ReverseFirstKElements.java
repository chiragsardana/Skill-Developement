package Queue;
//Write a program to reverse the first m elements from the queue, where m < n, 
//n is the total number of elements in queue.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ReverseFirstKElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//Chirag19CSU071
		Integer k = null;
		QueueUsingNode<Integer> queue = new QueueUsingNode<>();
		queue.enqueue(new Integer(1));
		queue.enqueue(new Integer(2));
		queue.enqueue(new Integer(3));
		queue.enqueue(new Integer(4));
		queue.enqueue(new Integer(5));
		queue.enqueue(new Integer(6));
		queue.enqueue(new Integer(7));
		queue.enqueue(new Integer(8));
		queue.enqueue(new Integer(9));
		queue.enqueue(new Integer(10));
		
		System.out.print("Enter the Value of k : ");
		try {
			k = Integer.parseInt(reader.readLine());
			while(k >= 10) {
				System.out.print("Please Enter k less than 10\nEnter the value of k : ");
				k = Integer.parseInt(reader.readLine());
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("The Value of k is : "+k);
		System.out.print("The Queue look like : ");
		queue.display();
		
		Stack<Integer> st = new Stack<>();
		
		for(int i = 0;i < k ;i++) {
			st.push(queue.dequeue());
		}
		for(int i =0 ;i<k;i++) {
			queue.enqueue(st.pop());
		}
		for(int i =k;i<10;i++) {
			queue.enqueue(queue.dequeue());
		}
		System.out.print("The Queue After Performing Certain Operation : ");
		queue.display();
	}

}
