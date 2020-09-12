/*
Write a program to perform the following set of operations on a singly linked list (SLL):
	• Swapping the first and last node of a singly linked list
	• Pairwise swap elements of a given linked list
	• Get the location of first and last occurrence of an element in a single LinkedList
	• Remove duplicates from an unsorted linked list
	• Delete alternate nodes of a Linked List
Defining of Done:
	a) Program should ask the user to enter the size and elements of the linked list
	b) It should display the output line by line as asked in the question
	c) Finally, should ask the user to continue (Y) or quit (N)
*/
package LinkedList;
import java.util.Scanner;
public class Q2
{
	
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		MyLinkedList<Integer> myLL=new MyLinkedList<>();
		System.out.print("Enter the Size of List : ");
		int size=input.nextInt();
		System.out.println("Enter the Elements of List One By 1");
		for(int i=0;i<size;i++)
		{
			myLL.insertAtEnd(input.nextInt());
		}
		System.out.println("The Original List is : "+myLL.print());
		myLL.swapFirstLast();
		System.out.println("The List After First and Last Swap is : "+myLL.print());
		myLL.pairWiseSwap();
		System.out.println("The List After pairWiseSwap is : "+myLL.print());
		System.out.print("Enter the Element to be Searched : ");
		int toBeSearch=input.nextInt();
		System.out.println("The first Occurrence and the Last Occurence is : "+myLL.FirstOccurence(toBeSearch)+" and "+myLL.LastOccurence(toBeSearch));
		myLL.removeDuplicates();
		System.out.println("The List After Removing Duplicates is : "+myLL.print());
		myLL.deleteAlternateNode();
		System.out.println("The List After Deleting Alternate Nodes is : "+myLL.print());

	}
}
/*
		myLL.insertAtBeginning(10);
		// myLL.insertAtBeginning(11);
		// myLL.insertAtBeginning(12);
		// myLL.insertAtBeginning(13);
		// myLL.insertAtEnd(10);
		// myLL.insertAtEnd(11);
		// myLL.insertAtEnd(12);
		// myLL.insertAtEnd(13);
		// myLL.insertAtSpecific(18,3);
		// myLL.insertAtSpecific(19,4);
*/