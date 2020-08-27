package LinkedList;
public class MyLinkedList
{
	Node head;
	static class Node//createNewNode()
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	void add(int data)//addNodeAtEnd()
	{
		Node toAdd =new Node(data);

		if(isEmpty())
		{
			head=toAdd;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=toAdd;
	}
	void addFirst(int data)//addNodeAtBegin()
	{
		Node toAdd=new Node(data);
		if(isEmpty())
		{
			head=toAdd;
			return;
		}
		toAdd.next=head;
		head=toAdd;
	}
	boolean isEmpty()// empty
	{
		if(head==null)
			return true;
		return false;
	}
	void print()// print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	int length()// length()
	{
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		// System.out.println(count);
		return count;
	}
	boolean search(int data)//search an element
	{
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data==data)
			{
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	void delete(int data)//delete any Element
	{
		Node temp = head, prev = null; 
  
        // If head node itself holds the data to be deleted 
        if (temp != null && temp.data == data) 
        { 
            head = temp.next; // Changed head 
            return; 
        } 
  
        // Search for the datato be deleted, keep track of the 
        // previous node as we need to change temp.next 
        while (temp != null && temp.data != data) 
        { 
            prev = temp; 
            temp = temp.next; 
        }     
  
        // If data was not present in linked list 
        if (temp == null) 
        	return; 
  
        // Unlink the node from linked list 
        prev.next = temp.next;
	}
	Node Nth(int num)
	{
		int len=length();
		System.out.println(len);
		if(num>len)
		{
			return null;
		}
		Node temp=head;
		int count=1;
		while(count<num &&  temp!=null )
		{
			temp=temp.next;
			count++;
		}
		return temp;
	}
	int count(int data)
	{
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			if(temp.data==data)
				count++;
			temp=temp.next;
		}
		return count;
	}
	int max()
	{
		Node temp=head;
		int max=head.data;
		temp=temp.next;
		while(temp!=null)
		{
			if(temp.data>max)
			{
				max=temp.data;
			}
			temp=temp.next;
		}
		return max;
	}
	int min()
	{
		Node temp=head;
		int min=head.data;
		temp=temp.next;
		while(temp!=null)
		{
			if(temp.data<min)
			{
				min=temp.data;
			}
			temp=temp.next;
		}
		return min;
	}
}