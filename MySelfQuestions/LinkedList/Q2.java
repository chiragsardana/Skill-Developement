/*
Create a method to search an element in the above created linked list
*/
package LinkedList;
public class Q2
{
	public static void main(String[] args) 
	{
		MyLinkedList myLL=new MyLinkedList();
		myLL.add(10);//Adding in the Last
		myLL.add(20);//Adding in the Last
		myLL.add(50);//Adding in the Last
		myLL.addFirst(222);//Adding in the First 
		System.out.println(myLL.search(222));
	}
}