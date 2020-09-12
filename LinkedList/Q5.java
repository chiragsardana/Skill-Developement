/*
Write a program to reverse the linked list in pairs.
If you have a linked list that holds 1 --> 2 --> 3 --> 4 --> 5, then after the function has been called the
linked list would hold 2 --> 1 --> 4 --> 3 --> 5
Definition of Done:
	a) The program should ask user to enter the size and elements of the linked list
	b) The program should display the desired result
*/
package LinkedList;
import java.util.Scanner;
public class Q5
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Size of List : ");
		int size=input.nextInt();
		MyLinkedList<Integer> myLL=new MyLinkedList<>();
		System.out.println("Enter the Elements of List One By 1");
		for(int i=0;i<size;i++)
		{
			myLL.insertAtEnd(input.nextInt());
		}
		System.out.println("The List is : "+myLL.print());
		myLL.pairWiseSwap();
		System.out.println("The List After Pair Wise Swap : "+myLL.print());
	}
}