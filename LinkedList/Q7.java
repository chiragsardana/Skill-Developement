/*
Given two lists, create a static method shuffleMerge() to merge their nodes together to make one list,
taking nodes alternately between the two lists.
So shuffleMerge() with {1, 2, 3} and {7, 13, 1} should yield {1, 7, 2, 13, 3, 1}. If either list runs out of
elements, all the nodes should be taken from the other list.
Definition of Done:
	a) The program should ask user to enter the size and elements of both the linked list
	b) It should return a single linked list containing all the elements merged alternatively
*/
package LinkedList;
import java.util.Scanner;
public class Q7
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Size of List 1 : ");
		int size1=input.nextInt();
		MyLinkedList<Integer> myLL1=new MyLinkedList<>();
		System.out.println("Enter the Elements of List 1 One by 1");
		for(int i=0;i<size1;i++)
		{
			myLL1.insertAtEnd(input.nextInt());
		}
		System.out.print("Enter the Size of List 2 : ");
		int size2=input.nextInt();
		MyLinkedList<Integer> myLL2=new MyLinkedList<>();
		System.out.println("Enter the Elements of List 2 One by 1");
		for(int i=0;i<size2;i++)
		{
			myLL2.insertAtEnd(input.nextInt());
		}

		System.out.println("The List 1 is : "+myLL1.print());
		System.out.println("The List 2 is : "+myLL2.print());

		Node<Integer> head1=myLL1.head;
		Node<Integer> head2=myLL2.head;
		myLL1.head=alternativelyJoining(head1,head2);
		System.out.println("The New List : "+myLL1.print());
	}
	public static Node<Integer> alternativelyJoining(Node<Integer> head1,Node<Integer> head2)
	{
		Node<Integer> newHead=new Node<>(0);
		Node<Integer> temp=newHead;
		while(head1!=null && head2!=null)
		{
			temp.next=head1;
			head1=head1.next;
			temp=temp.next;
			temp.next=head2;
			head2=head2.next;
			temp=temp.next;
		}
		while(head1!=null)
		{
			temp.next=head1;
			head1=head1.next;
			temp=temp.next;
		}
		while(head2!=null)
		{
			temp.next=head2;
			head2=head2.next;
			temp=temp.next;
		}
		return newHead.next;
	}
}