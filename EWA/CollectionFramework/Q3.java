package CollectionFramework;
/*
Q3. Explain what the following code prints. Draw a picture of the linked list and the iterator position after each step.
LinkedList<String> staff = new LinkedList<String>();
ListIterator<String> iterator = staff.listIterator();
iterator.add("Tom");
iterator.add("Diana");
iterator.add("Harry");
iterator = staff.listIterator();
iterator.next();
iterator.next();
iterator.add("Romeo");
iterator.next();
iterator.add("Juliet");
iterator = staff.listIterator();
iterator.next();
iterator.remove();
while (iterator.hasNext()) 
{ 
               System.out.println(iterator.next()); 
}
*/
import java.util.*;
class Q3
{
	public static void main(String[] args) 
	{
		LinkedList<String> staff = new LinkedList<String>();
		ListIterator<String> iterator = staff.listIterator();
//		iterator.remove();
		iterator.add("Tom");
		iterator.add("Diana");
		iterator.add("Harry");
		iterator = staff.listIterator();
		iterator.next();
		iterator.next();
		iterator.add("Romeo");
		iterator.next();						//Chirag19CSU071
		iterator.add("Juliet");
		iterator = staff.listIterator();
		iterator.next();
		iterator.remove();
		while (iterator.hasNext()) 
		{ 
			System.out.println(iterator.next()); 
		}
		System.out.println("The List in Reverse Order : ");
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
//		ListIterator<String> iterator1 = staff.listIterator();
//		iterator1.remove();
//		iterator.remove();
//		System.out.println("The Particular Elements : "+iterator.next());
//		iterator.remove();
//		System.out.println(staff);
	}
}