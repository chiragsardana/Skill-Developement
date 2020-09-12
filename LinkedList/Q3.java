/*
Write a program to check weather the given linked lists are identical or not. It should contain a static
function findIdentical() which returns TRUE if the lists are identical and FALSE otherwise.
Example: if the two lists were:
	1 -> 2 -> 3 -> 4 -> 5 -> X
	1 -> 2 -> 3 -> 4 -> 5 -> X
findIdentical() should return true, because the list have same values in each position.
Definition of Done:
	a) The program should ask user to enter the size and elements of both the linked lists
	b) It should finally return TRUE/FALSE based on the element positions
*/
package LinkedList;
import java.util.Scanner;
public class Q3
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Size of List 1 : ");
		int size1=input.nextInt();
		MyLinkedList<Integer> myLL1=new MyLinkedList<>();
		System.out.println("Enter the Elements of List 1  One by 1");
		for(int i=0;i<size1;i++)
		{
			myLL1.insertAtEnd(input.nextInt());
		}
		System.out.print("Enter the Size of List 2 : ");
		int size2=input.nextInt();
		MyLinkedList<Integer> myLL2=new MyLinkedList<>();
		System.out.println("Enter the Elements of List 2  One by 1");
		for(int i=0;i<size2;i++)
		{
			myLL2.insertAtEnd(input.nextInt());
		}
		System.out.println("The List 1 is : "+myLL1.print());
		System.out.println("The List 2 is : "+myLL2.print());
		System.out.println("The List are Identical : "+findIdentical(myLL1,myLL2));
	}
	static boolean findIdentical(MyLinkedList myLL1,MyLinkedList myLL2)
	{
		Node<Integer> head1=myLL1.head;
		Node<Integer> head2=myLL2.head;
		while(head1!=null && head2!=null && head1.data==head2.data)
		{
			head1=head1.next;
			head2=head2.next;
		}
		if(head1!=null || head2!=null)
			return false;
		return true;
	}
}