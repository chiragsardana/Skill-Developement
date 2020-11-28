package Queue;
//Write a program to find the element ‘s’ in a circular queue
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchCircularQueue {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		CircularQueueUsingArray<Integer> queue = new CircularQueueUsingArray<>(10);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Interger to Search : ");
		int search = Integer.parseInt(reader.readLine());
		
		queue.enqueue(new Integer(10));
		queue.enqueue(new Integer(20));
		queue.enqueue(new Integer(40));
//		queue.enqueue(new Integer(10));
		queue.enqueue(new Integer(30));
		queue.enqueue(new Integer(10));
		queue.enqueue(new Integer(20));			//Chirag19CSU071
//		queue.enqueue(new Integer(40));
//		queue.enqueue(new Integer(10));
		queue.enqueue(new Integer(30));
		
		boolean flag = false;
		for(int i = 0;i < queue.size();i++) {
			int value = queue.dequeue();
			if(search == value) {
				flag = true;
			}
			queue.enqueue(value);
		}
		if(flag) {
			System.out.println("The Element "+search+" is founded!!!");
		}else {
			System.out.println("The Element "+search+" is not founded!!!");
		}
	}

}
