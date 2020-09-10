package LinkedLists;
public class MyLinkedList
{
	static Node head;
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
	void removeDuplicates()//Remove duplicates from an unsorted linked list 
	{
		
	}
	Node getMiddle(Node root)
	{
		

	}
	int FirstOccurence(int element)// Get the location of first and last occurrence of an element in a single LinkedList 
	{
		Node temp=head;
		int count=0;
		boolean flag=false;
		while(temp!=null)
		{
			count++;
			if(temp.data==element)
			{
				flag=true;
				break;
			}
			temp=temp.next;
			
		}
		if(flag)
			return count;
		else
			return -1;
	}
	int LastOccurence(int element)// Get the location of first and last occurrence of an element in a single LinkedList 
	{
		Node temp=head;
		int count=0;
		boolean flag=false;
		int countElement=0;
		while(temp!=null)
		{
			count++;
			if(temp.data==element)
			{
				countElement=count;
				flag=true;
			}
			temp=temp.next;
			
		}
		if(flag)
			return countElement;
		else
			return -1;
	}
	void PairWiseSwap()//Pairwise swap elements of a given linked list  
	{
		if(head==null || head.next==null)
			return ;
		Node Current=head.next;
		Node Next=null;
		Node Previous=head;
		head=Current;
		while(true)
		{
			Next=Current.next;
			Current.next=Previous;
			if(Next == null || Next.next==null)
			{
				Previous.next=Next;
				break;
			}
			Previous.next=Next.next;
			Previous=Next;
			Current=Previous.next;
		}
	}
	void SwappingFirstLast()//Swapping the first and last node of a singly linked list  
	{
		if(head==null || head.next==null)
			return;
		Node p=head;
		Node Current=head;
		Node Previous=null;
		while(Current.next!=null)
		{
			Previous=Current;
			Current=Current.next;
		}
		Current.next=head.next;
		Previous.next=head;
		head.next=null;
		head=Current;
	}
	void addLast(int data)//addNodeAtEnd()
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
	void add(int pos, int data)// add element at specified position...
	{
		if(pos>length())
		{
			return;
		}
		Node toAdd=new Node(data);
		if(isEmpty())
		{
			head=toAdd;
			return;
		}
		if(pos==1)
		{
			addFirst(data);
			return;
		}
		if(pos==length())
		{
			addLast(data);
			return;
		}
		int count=1;
		Node temp=head;
		while(count < pos-1 && temp != null)
		{
			temp=temp.next;
			count++;
		}	
		if(temp.next!=null)
		{
			Node next=temp.next;
			temp.next=toAdd;
			toAdd.next=next;
		}
		else
		{
			addLast(data);
		}
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
	void deleteData(int data)//delete any Element
	{
		Node temp = head, prev = null; 

        if (temp != null && temp.data == data) 
        { 
            head = temp.next; // Changed head 
            return; 
        } 
        while (temp != null && temp.data != data) 
        { 
            prev = temp; 
            temp = temp.next; 
        }     
        if (temp == null) 
        	return; 
        prev.next = temp.next;
	}
	void deleteFirst()
	{
		if(isEmpty())
		{
			return;
		}
		Node temp=head;
		if(temp.next==null)
		{
			head=null;
		}
		else
		{
			head=head.next;
		}
	}
	void deleteLast()
	{
		if(isEmpty())
		{
			return;
		}
		Node temp=head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next=null;
	}
	void delete(int pos)// Delete element at specified position...
	{
		if(pos>length())
		{
			return;
		}
		if(isEmpty())
		{
			return;
		}
		if(pos==1)
		{
			deleteFirst();
			return;
		}
		if(pos==length())
		{
			deleteLast();
			return;
		}
		int count=1;
		Node temp=head;
		while(count < pos-1 && temp.next.next != null)
		{
			temp=temp.next;
			count++;
		}	
		temp.next=temp.next.next;
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