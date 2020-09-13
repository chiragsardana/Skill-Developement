/*
. Write a program to create a Circular Linked List (CLL) of n nodes, and perform the following:
• Insertion
	At a specific location
• Deletion
	o At a specific location
Definition of Done
	a) The program should ask user to enter the size and elements of the linked list.
	b) The program should display a menu with the above choices and ask the user to
	choose one of the choices.
	c) The program should display the desired result
*/
package LinkedList;
import java.util.Scanner;
public class Q10
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		MyCircularLinkedList<Integer> myCLL= new MyCircularLinkedList<>();

		System.out.print("Enter the Size of List : ");
		int size=input.nextInt();

		System.out.println("Enter the Elements of List One by 1");

		for (int i=0;i<size ;i++ ) 
		{
			int newElement=input.nextInt();
			System.out.println("1. In the Beginning");
			System.out.println("2. In the Ending");
			System.out.println("3. In the Specific Position");
			int select=input.nextInt();
			switch(select)
			{
				case 1 : 
				{
					myCLL.insertAtBeginning(newElement);
					break;
				}
				case 2 :
				{
					myCLL.insertAtEnd(newElement);
					break;
				}
				case 3 :
				{
					System.out.print("Enter the Position : ");
					int Position=input.nextInt();
					myCLL.insertAtSpecific(newElement,Position);
					break;
				}
			}
			System.out.println("The List is : "+myCLL.print());
		}
		outer : 
		while(true)
		{
			System.out.println("\nEnter the Option From Below For Deletion");
			System.out.println("1. In the Beginning");
			System.out.println("2. In the Ending");
			System.out.println("3. In the Specific Position");
			System.out.println("Any Other Key to Exit ");
			int select=input.nextInt();
			switch(select)
			{
				case 1 : 
				myCLL.deleteAtBeginning();
				break;
				case 2 : 
				myCLL.deleteAtEnd();
				break;
				case 3 : 
				System.out.print("Enter the Position : ");
				int Position =input.nextInt();
				myCLL.deleteAtSpecific(Position);
				break; 
				default : 
					break outer;
			}
			System.out.println("The List is : "+myCLL.print());
		}



		System.out.println("The List is : "+myCLL.print());
	}
}
		//myCLL.insertAtBeginning(10);
		// myCLL.insertAtBeginning(11);
		// myCLL.insertAtEnd(12);
		// myCLL.insertAtEnd(13);
		// myCLL.insertAtSpecific(100,3);

		// myCLL.deleteAtBeginning();
		// myCLL.deleteAtEnd();
		// myCLL.deleteAtSpecific(3);