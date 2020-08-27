/*
Create a method to Count the numbers of a specific value in the above
created linked list
*/
package LinkedList;
public class Q5
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
		System.out.println(myLL.count(20));
	}
}