package Queue;
//Write a program to check the number is palindrome or not in a linear queue.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeQueue {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		boolean flag = false;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Number : ");
		int Number = Integer.parseInt(reader.readLine());
		QueueUsingNode<Integer> queue = new QueueUsingNode<>();//Chirag19CSU071
		
		int temp = Number;
		while(temp > 0) {
			queue.enqueue((temp%10));
			temp = temp / 10;
		}
		System.out.print("The Queue is  : ");
		queue.display();
		
		int reverseNumber = 0;
		
		while(!queue.isEmpty()) {
			reverseNumber = (reverseNumber ) * 10 + queue.dequeue() ;
		}
		System.out.println("The Reversed Number is : "+reverseNumber);
		
		
		if(Number == reverseNumber) {
			System.out.println("The Number is Palindrome!!!");
		}else {
			System.out.println("The Number is Not Palindrome!!!");
		}
	}

}
