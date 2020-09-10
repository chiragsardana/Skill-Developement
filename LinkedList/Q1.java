/*
Write a program to create a singly linked list of n nodes and perform: 

Insertion 

At the beginning 

At the end 

At a specific location 

Deletion 

At the beginning 

At the end 

At a specific location 

Definition of Done: 

a) The program should ask user to enter the size and elements of the linked list 

b) The program should display the choices to perform every operation 

c) The program should also display the linked list status after every operation as desired
*/
package LinkedLists;
import java.util.Scanner;
public class Q1
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		MyLinkedList myLL=new MyLinkedList();// object of my linked list....
		System.out.print("Enter the size of LinkedList : ");
		int n=input.nextInt();
		System.out.println("Enter the Elements of Linked List one by one ");
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the Element : ");
			int ele=input.nextInt();
			System.out.println("Enter your Option from below");
			System.out.println("1. Insertion at Beginning");
			System.out.println("2. Insertion at End");
			System.out.println("3. Insertion at Specific Position ");
			int sel=input.nextInt();
			switch(sel)
			{
				case 1 : 
				myLL.addFirst(ele);
				break;
				case 2 :
				myLL.addLast(ele);
				break;
				case 3 :
				System.out.print("Enter the Specific Position : ");
				int temp=input.nextInt(); 
				myLL.add(temp,ele);
				break;
			}
		}
		System.out.print("The Linked List After Insertion Operation is : ");
		myLL.print();
		System.out.println("Enter your Option from below");
		System.out.println("1. Deletion at Beginning");
		System.out.println("2. Deletion at End");
		System.out.println("3. Deletion at Specific Position ");
		int sel=input.nextInt();
		switch(sel)
		{
			case 1 : 
			myLL.deleteFirst();
			break;
			case 2 :
			myLL.deleteLast();
			break;
			case 3 :
			System.out.print("Enter the Specific Position : ");
			int temp=input.nextInt(); 
			myLL.delete(temp);
			break;
		}
		System.out.print("The Linked List After Deletion Operation is : ");
		myLL.print();
	}
}