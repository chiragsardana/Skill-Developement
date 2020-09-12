/*
Write a program to rotate a doubly linked list (DLL) by a N nodes in a counter-clockwise direction.
Example: consider the given linked list
A → B → C → D → E → F → G → H
Rotate by 4th Node
E → F → G → H → A → B → C → D
Definition of Done:
a) The program should ask the user to enter the elements into a DLL and rotate position
b) The value of N should be less than length of the list
c) Finally, it should display the desired result
*/
package LinkedList;
import java.util.Scanner;
public class Q9
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		MyDoublyLinkedList<Character> myDLL=new MyDoublyLinkedList<>();
		System.out.print("Enter the Size of List : ");
		int size=input.nextInt();
		System.out.println("Enter the Elements of List One by 1");
		for(int i=0;i<size;i++)
		{
			myDLL.insertAtEnd(input.next().charAt(0));
		}
		System.out.println("The List : "+myDLL.print());
		DoublyNode<Character> head=myDLL.head;
		int N=size+1;
		while(N>size)
		{
			System.out.print("Enter the Rotate Postion : ");
			N=input.nextInt();
		}
		myDLL.head=toRotate(myDLL.head,N);
		System.out.println("The List : "+myDLL.print());
	}
	public static DoublyNode<Character> toRotate(DoublyNode<Character> head,int N)
	{
		DoublyNode<Character> Current=head;
		int count=1;
		while(Current!=null && count<N)
		{
			Current=Current.next;
			count++;
		}
		if(Current == null )
			return head;
		DoublyNode<Character> Last=Current;

		while(Current.next!=null)
		{
			Current=Current.next;
		}
		Current.next=head;
		head.prev=Current;

		head=Last.next;
		head.prev=null;
		Last.next=null;
		return head;
	}
}