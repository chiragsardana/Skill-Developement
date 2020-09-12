package LinkedList;
public class MyLinkedList<E>
{
	Node<E> head;
	Node<E> tail;
	//Checking for Empty
	boolean isEmpty()
	{
		if(head==null || tail==null)
		{
			return true;
		}
		return false;
	}
	//Insertion
	void insertAtBeginning(E data)//Insertion at Beginning
	{
		Node<E> newNode=new Node<>(data);
		if(isEmpty())
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
	}
	void insertAtEnd(E data)//Insertion at End
	{
		Node<E> newNode=new Node<>(data);
		if(isEmpty())
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			Node<E> temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
			tail=newNode;
		}
	}
	void insertAtSpecific(E data,int Position)//Insertion at Specific Position
	{
		Node<E> newNode=new Node<>(data);
		int count=1;
		Node<E> temp=head;
		if(Position==1)
		{
			insertAtBeginning(data);
			return;
		}
		while(temp!=null && count<Position-1)//1 2 3 4 5 
		{
			temp=temp.next;
			count++;
		}
		if(temp!=null && temp.next==null)
		{
			temp.next=newNode;
			tail=newNode;
		}
		if(temp!=null)
		{
			Node<E> Next=temp.next;
			temp.next=newNode;
			newNode.next=Next;
		}
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		tail=temp;
	}
	String print()//Print
	{
		Node<E> temp =head;
		String str="[";
		while(temp!=null)
		{
			str+=temp.data;
			temp=temp.next;
			if(temp!=null)
				str+=", ";
		}
		str+="]";
		return str;
	}
	//Deletion
	void deleteAtBeginning()//Deletion at Beginning
	{
		if(isEmpty())
		{
			return;
		}
		else
		{
			head=head.next;
			if(isEmpty())
			{
				tail=null;
			}
		}
	}
	void deleteAtEnd()//Deletion at End
	{
		if(isEmpty())
		{
			return;
		}
		if(head.next==null)
		{
			head=null;
			tail=null;
			return;
		}
		Node<E> temp=head;
		while(temp.next!=null && temp.next.next!=null)//1 2 3 4 5 6  
		{
			temp=temp.next;
		}
		tail=temp;
		temp.next=null;
	}
	void deleteAtSpecific(int Position)//Deletion at Specific Position
	{
		if(isEmpty())
		{
			return;
		}
		if(Position==1)
		{
			deleteAtBeginning();
			return;
		}
		int count=1;
		Node<E> temp=head;
		while(temp!=null && count<Position-1)
		{
			temp=temp.next;
			count++;
		}
		if(temp!=null && temp.next==null)
			return;
		else
		{
			Node<E> Next=temp.next.next;
			temp.next=Next;
		}
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		tail=temp;
	}
	void swapFirstLast()
	{
		Node<E> temp=head;
		Node<E> First=head.next;
		if(isEmpty())
		{
			return;
		}
		if(head.next!=null && head.next.next==null)
		{
			// Node<E> First=head.next;
			head.next=null;
			First.next=head;
			head=First;
			tail=head.next;
		}
		Node<E> Previous=null;
		while(temp.next!=null)
		{
			Previous=temp;
			temp=temp.next;// 1 2 3 4 5 
		}
		head.next=null;
		Previous.next=head;
		tail=head;
		temp.next=First;
		head=temp;

	}
	void pairWiseSwap()//Pairwise swap elements of a given linked list
	{
		if(head==null || head.next== null)
			return;
		Node<E> Current=head.next;
		Node<E> Previous=head;
		Node<E> Next=null;
		head=Current;
		while(true)
		{
			Next=Current.next;
			Current.next=Previous;
			if(Next ==null || Next.next==null)
			{
				Previous.next=Next;
				break;
			}
			Previous.next=Next.next;
			Previous=Next;
			Current=Previous.next;
		}
		while(Current.next!=null)
		{
			Current=Current.next;
		}
		tail=Previous;
	}
	int FirstOccurence(E Element)//Get the location of first and last occurrence of an element in a single LinkedList
	{
		int count=1;
		Node<E> temp=head;
		while(temp!=null)
		{
			if(temp.data==Element)
			{
				return count;
			}
			count++;
			temp=temp.next;
		}
		return -1;
	}
	int LastOccurence(E Element)//Get the location of first and last occurrence of an element in a single LinkedList
	{
		int count=1;
		int countElement=0;
		boolean flag=false;
		Node<E> temp=head;
		while(temp!=null)
		{
			if(temp.data==Element)
			{
				flag=true;
				countElement=count;
			}
			count++;
			temp=temp.next;
		}
		if(flag)
			return countElement;
		return -1;
	}
	void removeDuplicates()//Remove duplicates from an unsorted linked list
	{
		Node<E> temp=head;
		while(temp!=null && temp.next!=null)
		{
			Node<E> temp2=temp;
			while(temp2.next!=null)
			{
				if(temp2.next.data==temp.data)
				{
					temp2.next=temp2.next.next;
				}
				else
				{
					temp2=temp2.next;
				}
			}
			temp=temp.next;
		}
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		tail=temp;
	}
	void deleteAlternateNode()//Delete alternate nodes of a Linked List
	{
		Node<E> odd=head;
		Node<E> even = head.next;
		while(even!=null && even.next!=null)
		{
			odd.next=even.next;
			odd=odd.next;
			even.next=odd.next;
			even=even.next;
		}
		odd.next=null;
		tail=odd;
	}
}
/*
javac -cp classes/ -d classes/ src/LinkedList/MyLinkedList.java
*/


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
*/