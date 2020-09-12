/*
Write a program to create a doubly linked list (DLL) of n nodes, and perform the following:
• Insertion
	o At the beginning
	o At the end
	o At a specific location
• Deletion
	o At the beginning
	o At the end
	o At a specific location
• Traversal
	o Forward
	o Reverse
Definition of Done
	a) The program should ask user to enter the size and elements of the linked list.
	b) The program should display a menu with the above choices and ask the user to
	choose one of the choices.
	c) The program should display the desired result
*/
package LinkedList;
import java.util.Scanner;
public class Q8
{
	static Scanner input=new Scanner(System.in);
	static MyDoublyLinkedList<Integer> myDLL=new MyDoublyLinkedList<>();
	public static void main(String[] args) 
	{
		
		System.out.print("Enter the Size of List : ");
		int size=input.nextInt();
		outer :
		while(true)
		{
			System.out.println("Select Your Option ");
			System.out.println("1. Insertion");
			System.out.println("2. Deletion");
			System.out.println("3. Traversal");
			System.out.println("Any Other Key to Exit");
			int Select=input.nextInt();
			switch(Select)
			{
				case 1 :
				InsertionMenu(size);
				toEnterMenu();
				break;
				case 2 : 
				DeletionMenu();
				toEnterMenu();
				break;
				case 3 :
				DoublyNode<Integer> Root=traversalForward(myDLL.head);
				Root=traversalBackward(Root);
				toEnterMenu();
				break;
				default :
				System.out.println("The Final List : "+myDLL.print());
				break outer;
			}
		}
		System.out.println();

	}
	public static DoublyNode<Integer> traversalForward(DoublyNode<Integer> head)
	{
		DoublyNode<Integer> Previous=null;
		System.out.print("The List While Forward Traversal : [");
		while(head!=null)
		{
			Previous=head;
			System.out.print(head.data);
			head=head.next;
			if(head!=null)
				System.out.print(", ");
		}
		System.out.println("]");
		return Previous;
	}
	public static DoublyNode<Integer> traversalBackward(DoublyNode<Integer> head)
	{
		DoublyNode<Integer> Previous=null;
		System.out.print("The List While Backward Traversal : [");
		while(head!=null)
		{
			Previous=head;
			System.out.print(head.data);
			head=head.prev;
			if(head!=null)
				System.out.print(", ");
		}
		System.out.println("]");
		return Previous;
	}
	public static void InsertionMenu(int size)
	{
		System.out.println("Enter the Elements of List one by 1");
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
					myDLL.insertAtBeginning(newElement);
					break;
				}
				case 2 :
				{
					myDLL.insertAtEnd(newElement);
					break;
				}
				case 3 :
				{
					System.out.print("Enter the Position : ");
					int Position=input.nextInt();
					myDLL.insertAtSpecific(newElement,Position);
					break;
				}
			}
			System.out.println("The List is : "+myDLL.print());
		}
	}
	public static void DeletionMenu()
	{
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
				myDLL.deleteAtBeginning();
				break;
				case 2 : 
				myDLL.deleteAtEnd();						
				break;
				case 3 : 
				System.out.print("Enter the Position : ");
				int Position =input.nextInt();
				myDLL.deleteAtSpecific(Position);
				break; 
				default : 
				System.out.println("The List After Deletion : "+myDLL.print());
				break outer;
			}
			System.out.println("The List is : "+myDLL.print());
		}
	}
	public static void toEnterMenu()
	{
		input.nextLine();
		System.out.println("Press Enter to Continue...");
		String str=input.nextLine();
		return;
	}
}
// myDLL.insertAtBeginning(12);
		// myDLL.insertAtBeginning(13);
		// myDLL.insertAtEnd(14);
		// myDLL.insertAtEnd(15);
		// myDLL.insertAtSpecific(11,3);

		// myDLL.deleteAtBeginning();

		// myDLL.deleteAtEnd();

		// myDLL.deleteAtSpecific(2);