/*
Write a program to read numbers in an integer array of size 5 and display the following: 

Sum of all the elements 

Sum of alternate elements in the array 

Second highest element in the array 

Definition of Done 

The program should ask user to enter the elements of the array. 

The program should display a menu with the above choices and ask the user to                                                                       choose one of the choices. 

The program should display the result. 
*/
package Arrays;
import java.util.Scanner;
public class Q3
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int n=5;
		int arr[]=new int[n];
		System.out.println("Enter the 5 elements 1 by one ");
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		System.out.print("Main Menu\n1. Sum of all the elements\n2. Sum of alternate elements in the array\n3. Second highest element in the array\nEnter Your Choice : ");
		int sel=input.nextInt();
		switch(sel)
		{
			case 1:
			System.out.println("Sum of all the elements is : "+sumAll(arr));
			break;
			case 2:
			System.out.println("Sum of alternate elements is : "+sumAlternate(arr,0)+" and "+sumAlternate(arr,1));
			break;
			case 3:
			System.out.println("Second highest element in the array : "+secondHighest(arr));
			break;
			default:
			System.out.println("You have entered invalid option");
			break;	
		}
	}
	static int sumAll(int[] arr)
	{
		int sum=0;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	static int sumAlternate(int[] arr,int k)
	{
		int sum=0;
		int n=arr.length;
		for(int i=k;i<n;i+=2)
		{
			sum+=arr[i];
		}
		return sum;
	}
	static int secondHighest(int[] arr)
	{
		int max=Integer.MIN_VALUE;
		int SecondMax=Integer.MIN_VALUE;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				SecondMax=max;
				max=arr[i];
			}
		}
		return SecondMax;
	}
}