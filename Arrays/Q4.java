/*
4. Write a program that count occurrence of a given number in the array and its frequency. 

Definition of Done: 

The program should ask user to enter the elements of the array 

The program should ask the user to enter a number to search and display the frequency of the searched element. 
*/
package Arrays;
import java.util.*;
public class Q4
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int n=input.nextInt();
		int arr[]=new int[n];
		System.out.println("\nEnter the Elements of Array 1 by One");
		for(int i=0;i<n;i++)
			arr[i]=input.nextInt();
		System.out.print("Enter the Element to be Searched : ");
		int k=input.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==k)
				count++;
		}	
		System.out.println("The frequency of Searched Element "+k+" is "+count);
	}
}