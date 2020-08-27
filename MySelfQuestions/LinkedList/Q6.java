/*
Find the minimum and maximum element in the linked list.
*/
package LinkedList;
public class Q6
{
	public static void main(String[] args) 
	{
		MyLinkedList myLL=new MyLinkedList();
		myLL.add(10);//Adding in the Last
		myLL.add(20);//Adding in the Last
		myLL.add(50);//Adding in the Last
		myLL.addFirst(222);//Adding in the First 
		myLL.add(2);//Adding in the Last
		myLL.add(20);//Adding in the Last
		myLL.add(80);//Adding in the Last
		myLL.addFirst(20);//Adding in the First 
		System.out.println("Max element : "+myLL.max());
		System.out.println("Max element : "+myLL.min());
	}
}