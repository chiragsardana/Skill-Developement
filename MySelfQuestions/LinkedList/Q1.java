/*
Create	a	Singly	Linked	list	class	(members->	value	and	next	pointer),	
with	the	following	methods:
1. createNewNode()
2. addNodeAtBegin()
3. addNodeAtEnd()
4. length()
5. print()
*/
package LinkedList;
public class Q1
{
	public static void main(String[] args) 
	{
		MyLinkedList myLL=new MyLinkedList();
		myLL.add(10);//Adding in the Last
		myLL.add(20);//Adding in the Last
		myLL.add(50);//Adding in the Last
		myLL.addFirst(222);//Adding in the First 
		myLL.print();//Printing The List
		myLL.length();//Printing The Lenght
	}
}