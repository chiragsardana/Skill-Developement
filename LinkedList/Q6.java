/*
Write a function that, given an integer n, converts n to binary and stores each bit in one node of a linked
list with the least significant bit at the head of the list and the most significant bit at the tail.
For example, given `13`, the bits are stored in the order 1 0 1 1, from head to tail.
Definition of Done:
	a) The program should ask the user to enter only integer value (without decimal) and prompts the
	user to enter again in case if it’s a String/floating value
	b) It should display the binary representation of the given integer value as desired
*/
package LinkedList;
import java.util.Scanner;
public class Q6
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Number to Convert to Binary : ");
		String Num=input.next();
		while(!onlyDigits(Num))
		{
			System.out.print("Please Enter the Number to Convert to Binary : ");
			Num=input.next();
		}

		int Number = Integer.parseInt(Num);

		MyLinkedList<Integer> binary= new MyLinkedList<>();

		while(Number>0)
		{
			binary.insertAtEnd(Number%2);
			Number/=2;
		}

		System.out.print("The Binary List Look Like : ");

		Node<Integer> head=binary.head;

		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	public static boolean onlyDigits(String str) 
    { 
    	int n=str.length();
        for (int i = 0; i < n; i++) 
        { 
           	if (str.charAt(i)=='.' || !Character.isDigit(str.charAt(i))) 
           	{ 
                return false; 
            } 
        } 
        return true; 
    } 
}