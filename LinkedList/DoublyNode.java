package LinkedList;
public class DoublyNode<E>
{
	DoublyNode<E> next;
	DoublyNode<E> prev;
	E data;
	DoublyNode(E data)
	{
		this.data=data;
		next=null;
		prev=null;
	}
}
/*
javac -cp classes/ -d classes/ src/LinkedList/DoublyNode.java
*/