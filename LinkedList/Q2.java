/*
Write a program to perform the following set of operations on a singly linked list (SLL):  

Swapping the first and last node of a singly linked list  

Pairwise swap elements of a given linked list  

Get the location of first and last occurrence of an element in a single LinkedList  

Remove duplicates from an unsorted linked list 

Delete alternate nodes of a Linked List 

Defining of Done: 

Program should ask the user to enter the size and elements of the linked list 

It should display the output line by line as asked in the question 

Finally, should ask the user to continue (Y) or quit (N) 
*/
package LinkedLists;
public class Q2
{
	public static void main(String[] args) 
	{
		MyLinkedList my = new MyLinkedList();
		my.addLast(1);
		my.addLast(2);
		my.addLast(3);
		my.addLast(4);
		my.addLast(5);
		my.addLast(6);
		my.addLast(7);
		my.addLast(5);
		my.addLast(6);
		my.addLast(1);


		System.out.print("The List is : ");
		my.print();

		System.out.print("The List after Swapping First Last: ");
		my.SwappingFirstLast();
		my.print();

		my.SwappingFirstLast();//To convert the List into Original

		System.out.print("The List After Pairwise Swap :");
		my.PairWiseSwap();
		my.print();

		my.PairWiseSwap();//To Convert it to Original

		System.out.println("The First and Last occurrence of an Element 2 is : "+my.FirstOccurence(2)+" and "+my.LastOccurence(2));

		System.out.print("The List After Removing Dupplicates : ");
		my.print();

	}
}
/*
javac -cp classes/ -d classes/ src/LinkedLists/MyLinkedList.java
javac -cp classes/ -d classes/ src/LinkedLists/Q2.java
java -cp classes/ LinkedLists.Q2
*/