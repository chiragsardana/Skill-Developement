package LinkedList;
public class MyDoublyLinkedList<E>
{
	DoublyNode<E> head;
	boolean isEmpty()
	{
		if(head==null)
		{
			return true;
		}
		return false;
	}
	//Insertion
	void insertAtBeginning(E data)
	{
		DoublyNode<E> newNode=new DoublyNode<E>(data);
		if(isEmpty())
		{
			head=newNode;
		}
		else
		{
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
	}
	void insertAtEnd(E data)
	{
		DoublyNode<E> newNode=new DoublyNode<>(data);
		if(isEmpty())
		{
			head=newNode;
		}
		else
		{
			DoublyNode<E> Current=head;
			while(Current.next!=null)
			{
				Current=Current.next;
			}
			Current.next=newNode;
			newNode.prev=Current;
		} 
	}
	void insertAtSpecific(E data,int Position)
	{
		DoublyNode<E> newNode=new DoublyNode<>(data);
		if(Position==1)
		{
			insertAtBeginning(data);
			return;
		}
		int count = 1;
		DoublyNode<E> temp=head;
		while(temp!=null && count<Position-1)//1 2 3 4 5
		{
			temp=temp.next;
			count++;
		}
		if(temp!=null && temp.next==null)
		{
			temp.next=newNode;
			newNode.prev=temp;
			return;
		}
		if(temp!=null)
		{
			DoublyNode<E> Next=temp.next;
			temp.next=newNode;
			newNode.prev=temp;
			newNode.next=Next;
			Next.prev=newNode;
		}
	}
	//Deletion
	void deleteAtBeginning()
	{
		if(isEmpty())
		{
			return;
		}
		head=head.next;
		head.prev=null;
	}
	void deleteAtEnd()
	{
		if(isEmpty())
			return;
		DoublyNode<E> Current=head;
		while(Current.next!=null)
		{
			Current=Current.next;
		}
		DoublyNode<E> Previous=Current.prev;
		Previous.next=null;
	}
	void deleteAtSpecific(int Position)
	{
		if(Position==1)
		{
			deleteAtBeginning();
			return;
		}
		int count=1;
		DoublyNode<E> Current=head;
		while(Current!=null && count<Position-1)
		{
			count++;
			Current=Current.next;
		}
		if(Current!=null && Current.next==null)
		{
			return;
		}
		DoublyNode<E> Next=Current.next.next;
		Current.next=Next;
		Next.prev=Current;
	}
	String print()
	{
		DoublyNode<E> temp=head;
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

}