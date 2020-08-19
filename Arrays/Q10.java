/*
 Write a program that accepts an array of Strings as its argument and indicates whether 
 that array is a palindrome—that is, it reads the same forwards as backwards.  

 

For example, the array {"alpha", "beta", "gamma", "delta", "gamma", "beta", "alpha"} is a palindrome. 

 

Definition of Done: 

Program should ask the user to enter the array size and input String values 

In the next line, it should print whether the entered array is palindrome or not 
*/
package Arrays;
import java.util.*;
public class Q10
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Size of String Array : ");
		int n=input.nextInt();
		String[] arr=new String[n];
		System.out.println("Enter the String One by 1");
		for(int i=0;i<n;i++)
			arr[i]=input.next();
		boolean flag=true;
		for(int i=0;i<n/2;i++)
		{
			if(!arr[i].equals(arr[n-i-1]))
			{
				flag=false;
				break;
			}
		}
		if(flag==false)
			System.out.print("Given Arrays is Not Palindrome");
		else
			System.out.print("Given Arrays is Palindrome");
	}
}