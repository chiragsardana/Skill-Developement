package LinkedList;
public class Node<E>
{
	Node<E> next;
	E data;
	Node(E data)
	{
		this.data=data;
		next=null;
	}
}
/*
javac -cp classes/ -d classes/ src/LinkedList/Node.java


java -cp classes/ LinkedList.Node
*/