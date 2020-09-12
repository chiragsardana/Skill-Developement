/*
Write a program to check weather the given linked list is palindrome or not.
Example: Consider the given linked list:
R → A → D → A → R , is a palindrome
Definition of Done:
a) The program should ask user to enter the size and elements of the linked list
b) It should finally display weather the given LL is palindrome or not
*/
package LinkedList;
import java.util.Scanner;
public class Q4
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Size of List : ");
		int size=input.nextInt();
		MyLinkedList<Character> myLL=new MyLinkedList<>(); 
		System.out.println("Enter the elements of List One by 1");
		for(int i=0;i<size;i++)
		{
			myLL.insertAtEnd(input.next().charAt(0));
		}
		System.out.println("The List is  : "+myLL.print());	

		Node<Character> head=myLL.head;

		System.out.println("The List is Palindrome : "+isPalindrome(head,size));	
	}
	public static boolean isPalindrome(Node<Character> head,int size)
	{
		Node<Character> Middle=getMiddle(head);
		Middle=toReverse(Middle);
		for(int i=0;i<(size/2);i++)
		{
			if(Middle.data!=head.data)
				return false;
			Middle=Middle.next;
			head=head.next;
		}
		return true;
	}
	public static Node<Character> getMiddle(Node<Character> head)
	{
		Node<Character> slow=head;
		Node<Character> fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	public static Node<Character> toReverse(Node<Character> head)
	{
		Node<Character> Previous=null;
		Node<Character> Current=head;
		Node<Character> Next=null;
		while(Current!=null)
		{
			Next=Current.next;
			Current.next=Previous;
			Previous=Current;
			Current=Next;
		}
		head=Previous;

		return head;
	}	
}