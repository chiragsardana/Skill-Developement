package LinkedLists;
class DoubleNode
{
	DoubleNode prev;
	DoubleNode next;
	int data;
	public DoubleNode(int data)
	{
		next=null;
		prev=null;
		this.data=data;
	}
}
//javac -cp classes/ -d classes/ src/LinkedLists/DoubleNode.java