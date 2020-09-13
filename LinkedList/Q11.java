/*
Write a program to rearrange a given linked list such that it consists of alternating minimum & maximum
elements. The first element of the list should be minimum, and second element should be maximum of
all elements present in the list. Similarly, third element will be next minimum element and fourth
element is next maximum element and so on. Use of extra space is not permitted.
Example:
Input: [1 3 8 2 7 5 6 4]
 Output: [1 8 2 7 3 6 4 5]
Definition of Done:
a) The program should ask the user to enter the size and elements of the linked list
b) The program should not use any extra space for its operations
c) It should display the desired result
*/
package LinkedList;
import java.util.Scanner;
public class Q11
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Size of List : ");
		int size=input.nextInt();
		MyLinkedList<Integer> myLL=new MyLinkedList<>();
		System.out.println("Enter the Elements of List one By 1");
		for(int i=0;i<size;i++)
		{
			myLL.insertAtEnd(input.nextInt());
		}

		System.out.println("The List is : "+myLL.print());
		Node<Integer> head=myLL.head;
		myLL.head=mergeSort(head);
		Node<Integer> mid=getMiddle(head);
		Node<Integer> NextOfMiddle=mid.next;
		mid.next=null;
		NextOfMiddle=toReverse(NextOfMiddle);
		Node<Integer> result=new Node<Integer>(0);
		Node<Integer> newHead=result;
		while(head!=null || NextOfMiddle !=null)
		{
			if(head!=null)
			{
				result.next=head;
				result=result.next;
				head=head.next;
			}
			if(NextOfMiddle!=null)
			{
				result.next=NextOfMiddle;
				NextOfMiddle=NextOfMiddle.next;
				result=result.next;
			}
		}
		myLL.head=newHead.next;
		
		System.out.println("The List is : "+myLL.print());	
	}
	public static Node<Integer> getMiddle(Node<Integer> head)
	{
		Node<Integer> slow=head;
		Node<Integer> fast=head;
		while(fast.next!=null && fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	public static Node<Integer> mergeSort(Node<Integer> head)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		Node<Integer> mid=getMiddle(head);
		Node<Integer> NextOfMiddle=mid.next;
		mid.next=null;
		Node<Integer> left=mergeSort(head);
		Node<Integer> right=mergeSort(NextOfMiddle);
		Node<Integer> SortedList=sortList(left,right);
		return SortedList;
	}
	public static Node sortList(Node<Integer> head1,Node<Integer> head2)
	{
		Node<Integer> result =null;
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		if (head1.data <= head2.data) 
		{ 
            result = head1; 
            result.next = sortList(head1.next, head2); 
        } 
        else 
        { 
            result = head2; 
            result.next = sortList(head1, head2.next); 
        } 
		return result;
	}
	public static Node<Integer> toReverse(Node<Integer> head)
	{
		Node<Integer> Previous=null;
		Node<Integer> Current=head;
		Node<Integer> Next=null;
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