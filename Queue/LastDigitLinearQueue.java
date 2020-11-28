//Write a program to check if the last digit contains 0 
//in a linear queue.
package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LastDigitLinearQueue {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		QueueUsingNode<Integer> queue = new QueueUsingNode<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the Number : ");
		int Number = Integer.parseInt(reader.readLine());
		
		int temp = Number;
		while(temp > 0) {
			queue.enqueue(temp % 10);
			temp = temp / 10;
		}
		
		System.out.print("The Queue is : ");		//Chirag19CSU071
		queue.display();
		
		
		System.out.println("The Last Digit in the Number is : "+lastDigit(queue));
		
	}
	static boolean lastDigit(QueueUsingNode<Integer> queue) {
		boolean flag = false;
		for(int i = 0;i < queue.size();i++) {
			if(i==0) {
				Integer temp = queue.dequeue();
				if(temp == 0) 
					flag= true;
				
				queue.enqueue(temp);
			}else {
			queue.enqueue(queue.dequeue());
			}
		}
		return flag;
	}	
}