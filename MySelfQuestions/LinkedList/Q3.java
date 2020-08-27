/*
Create a method to delete any Element in the above create linked list
*/
package LinkedList;
public class Q3
{
	public static void main(String[] args) 
	{
		MyLinkedList myLL=new MyLinkedList();
		myLL.add(10);//Adding in the Last
		myLL.add(20);//Adding in the Last
		myLL.add(50);//Adding in the Last
		myLL.addFirst(222);//Adding in the First 
		System.out.print("The LL before deleting : ");
		myLL.print();
		myLL.delete(20);
		System.out.print("The LL after deleting : ");
		myLL.print();
		System.out.println();
	}
}