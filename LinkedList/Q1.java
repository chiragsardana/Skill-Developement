/*
Write a program to create a singly linked list of n nodes and perform:
	• Insertion
	o At the beginning
	o At the end
	o At a specific location
	• Deletion
	o At the beginning
	o At the end
	o At a specific location

	Definition of Done:
	a) The program should ask user to enter the size and elements of the linked list
	b) The program should display the choices to perform every operation
	c) The program should also display the linked list status after every operation as desired
*/
package LinkedList;
import java.util.Scanner;
public class Q1
{
	public static void main(String[] args) {
		MyLinkedList<Integer> myLL=new MyLinkedList<>();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Size of List : ");
		int size=input.nextInt();
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
					myLL.insertAtBeginning(newElement);
					break;
				}
				case 2 :
				{
					myLL.insertAtEnd(newElement);
					break;
				}
				case 3 :
				{
					System.out.print("Enter the Position : ");
					int Position=input.nextInt();
					myLL.insertAtSpecific(newElement,Position);
					break;
				}
			}
			System.out.println("The List is : "+myLL.print());
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
				myLL.deleteAtBeginning();
				break;
				case 2 : 
				myLL.deleteAtEnd();
				break;
				case 3 : 
				System.out.print("Enter the Position : ");
				int Position =input.nextInt();
				myLL.deleteAtSpecific(Position);
				break; 
				default : 
					break outer;
			}
			System.out.println("The List is : "+myLL.print());
		}

		System.out.println("The List is : "+myLL.print());

	}
}
/*
java -cp classes/ LinkedList.Q1
*/

/*
		myLL.insertAtBeginning(10);
		myLL.insertAtBeginning(11);
		myLL.insertAtBeginning(12);
		myLL.insertAtBeginning(13);
		myLL.insertAtEnd(14);
		myLL.insertAtEnd(15);
		myLL.insertAtEnd(16);
		myLL.insertAtEnd(17);
		myLL.insertAtSpecific(18,3);
		myLL.insertAtSpecific(19,4);
		System.out.println("The List is : "+myLL.print());

		myLL.deleteAtBeginning();
		myLL.deleteAtBeginning();
		myLL.deleteAtEnd();
		myLL.deleteAtEnd();
		myLL.deleteAtSpecific(2);
		myLL.deleteAtSpecific(3);
		System.out.println("The List is : "+myLL.print());
		*/