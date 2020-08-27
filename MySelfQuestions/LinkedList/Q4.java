/*Create a method to provide the “N th ” Node from the above created linked
list.*/
package LinkedList;
public class Q4
{
	public static void main(String[] args) 
	{
		MyLinkedList myLL=new MyLinkedList();
		myLL.add(10);//Adding in the Last
		myLL.add(20);//Adding in the Last
		myLL.add(55);//Adding in the Last
		myLL.addFirst(222);//Adding in the First 
		System.out.println(myLL.Nth(4).data);
	}
}