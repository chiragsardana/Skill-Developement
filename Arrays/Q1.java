/*
Create an array of integer with size n. Return the difference between the largest and the smallest value inside that array. 

Definition of Done: 

a) The program should ask user to enter the size and elements of the array. 

b) The program should display the difference b/w the largest & smallest element. 
 */
package Arrays;
import java.util.Scanner;
public class Q1
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int n=input.nextInt();
		int arr[]=new int[n];
		System.out.println();
		System.out.println("Now Enter the Elements 1 by 1");
		for(int i=0;i<n;i++)
			arr[i]=input.nextInt();	
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("The Difference between the largest and smallest is : "+(max-min));
	}
}