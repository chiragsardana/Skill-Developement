package LinkedLists;
public class BasicDoublyLinkedList
{
	public static void main(String[] args) 
	{
		MyDoublyLinkedList my=new MyDoublyLinkedList();
		my.insertAtBeg(1);
		my.insertAtBeg(2);
		my.insertAtBeg(3);
		my.insertAtBeg(4);
		my.insertAtBeg(5);
		DoubleNode temp =my.head;
		my.print(temp);
	}
}
//java -cp classes/ LinkedLists.BasicDoublyLinkedList