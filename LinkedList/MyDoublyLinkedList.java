package LinkedLists;
public class MyDoublyLinkedList
{
	DoubleNode head;
	void insertAtBeg(int data)
	{
		DoubleNode newNode = new DoubleNode(data);
		if(head==null)
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
	void deleteAtBeg()
	{
		DoubleNode temp=head;
		if(head.next==null)
		{
			head=null;
		}
		head=head.next;
		head.prev=null;
	}
	void print(DoubleNode root)
	{
		DoubleNode temp=root;	
		System.out.print("The List is : ");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}
//javac -cp classes/ -d classes/ src/LinkedLists/MyDoublyLinkedList.java
//java -cp classes/ LinkedLists.MyDoublyLinkedList