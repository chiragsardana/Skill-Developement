package LinkedList;
public class MyCircularLinkedList<E>
{
	Node<E> head;
	boolean isEmpty()
	{
		if(head==null)
			return true;
		return false;
	}
	//Insertion
	void insertAtBeginning(E data)
	{
		Node<E> newNode=new Node<>(data);
		if(isEmpty())
		{
			head=newNode;
			newNode.next=head;
			return;
		}
		Node<E> temp=head;
		while(temp.next!=head)
		{
			temp=temp.next;
		}
		newNode.next=head;
		temp.next=newNode;
		head=newNode;
	}
	void insertAtEnd(E data)
	{
		Node<E> newNode=new Node<>(data);
		if(isEmpty())
		{
			head=newNode;
			newNode.next=head;
			return;
		}
		Node<E> temp=head;
		while(temp.next!=head)
		{
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.next=head;
	}
	void insertAtSpecific(E data,int Position)
	{
		if(Position==0)
			return;
		if (Position==1) 
		{
			insertAtBeginning(data);
			return;
		}
		Node<E> newNode=new Node<>(data);
		int count=1;
		Node<E> temp=head;
		while(temp.next!=head && count<Position-1)//1 2 3 4 5 
		{
			temp=temp.next;
			count++;
		}
		if(temp!=head && (count+1)==Position)
		{
			Node<E> Next=temp.next;
			temp.next=newNode;
			newNode.next=Next;
		}
	}
	//Deletion
	void deleteAtBeginning()
	{
		if(isEmpty())
			return;
		if(head.next==head)
		{
			head=null;
			return;
		}
		Node<E> temp=head;
		while(temp.next!=head)
		{
			temp=temp.next;
		}
		temp.next=head.next;
		head=temp.next;
	}
	void deleteAtEnd()
	{
		if(isEmpty())
			return;
		if(head.next==head)
		{
			head=null;
			return;
		}
		Node<E> temp=head;
		while(temp.next!=head && temp.next.next!=head)
		{
			temp=temp.next;
		}
		temp.next=head;
	}
	void deleteAtSpecific(int Position)
	{
		if(Position==0)
			return;
		if(isEmpty())
			return;
		Node<E> temp=head;
		int count=1;
		if(Position==1)
		{
			deleteAtBeginning();
			return;
		}
		while(temp.next!=head && count<Position-1)
		{
			temp=temp.next;
			count++;
		}
		if(temp!=head && temp.next==head)
		{
			return;
		}
		Node<E> Next=temp.next.next;
		temp.next=Next;
	}
	String print()
	{
		Node<E> temp =head;
		String str="[";
		if(temp==null)
		{
			str+="]";
			return str;
		}
		do
		{
			str+=temp.data;
			temp=temp.next;
			if(temp!=head)
				str+=", ";
		}
		while(temp!=head);
		str+="]";
		return str;
	}
	int length()
	{
		Node<E> temp=head;
		int count=0;
		do
		{
			count++;
			temp=temp.next;
		}
		while(temp!=head);
		return count;
	}
}