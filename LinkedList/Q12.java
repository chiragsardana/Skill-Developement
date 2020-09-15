/*
n children (numbered 1 to n) are arranged in a circle. An integer value 'm' is used to eliminate one child
at a time until only a single child is left. Starting at child 1, the children are counted from 1 to m and the
mth child is eliminated. Starting with the child after the one just eliminated, the children are again
counted from 1 to m and the mth child is eliminated. This is repeated until one child is left. Counting is
done circularly, and eliminated children are not counted.
Write a program to read values for n and m (> 0), play the game as described, and print the number of
the last remaining child.
Example:
Enter number of children and length of count-out: 4, 5
The winning child is: 2
Definition of Done:
a) The program should ask the user to enter the number of children and length of count-out
b) It should display the number of last remaining child
*/
package LinkedList;
import java.util.Scanner;
public class Q12
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		MyCircularLinkedList<Integer> myCLL=new MyCircularLinkedList<>();
		System.out.print("Enter the Number of Children : ");
		int size =input.nextInt();
		for(int i=0;i<size;i++)
		{
			myCLL.insertAtEnd((i+1));
		}
		System.out.print("Enter the Number of Length Count : ");
		int count=input.nextInt();

		System.out.println("The List is : "+myCLL.print());
		myCLL.head=playGame(myCLL.head,size-1,count);
		System.out.println("The Last Student is : "+myCLL.print());
	}
	 public static Node playGame(Node head, int x, int count) 
	 {
	    //Eliminate x children with countout length of m;

	    //last points to the last child which points to the first child

	 	if(count==1)
	 	{
	 		Node temp=head;
	 		while(temp.next!=head)
	 		{
	 			temp=temp.next;
	 			// System.out.println(temp.data);
	 		}
	 		temp.next=temp;
	 		return temp;
	 	}
       Node prev = null, curr = head; //curr points to first child
       //eliminate x children
       for (int h = 1; h <= x; h++) 
       {
          //curr is pointing at the first child to be counted;
          //count m-1 more to get to the mth child
          for (int c = 1; c < count; c++) 
          {
             prev = curr;
             curr = curr.next;
          }
          //delete the mth child
          prev.next = curr.next;
          curr = prev.next; //set curr to the child after the one eliminated
       }
       return curr;
    }

}
//1 2 3 4 
//size =count%size; --> 5%4=1
//count1=1
//size=5%3 =2 +1