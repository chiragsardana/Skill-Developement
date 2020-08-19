/*
Given an array of integers, return the number of times that two 6's are next to each 
other in the array. Also count instances where the second element is 7. 

arrayFunc([6, 6, 2]) → 1 

arrayFunc([6, 6, 2, 6]) → 1 

arrayFunc([6, 7, 2, 6]) → 1 

Definition of Done: 

Program should ask the user the array size & then input integer values 

In the next line It should print the number of occurrences of two 6’s 

It should also print the occurrences of ‘6’ followed by ‘7’ 
*/
package Arrays;
import java.util.Scanner;
public class Q6
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int n=input.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Elements of Array one by 1");
		for(int i=0;i<n;i++)
			arr[i]=input.nextInt();
		System.out.println("The number of occurrences of two 6s : "+twoSixes(arr));
		System.out.print("The occurrences of 6 followed by 7 : "+sixSeven(arr));
	}	
	static int twoSixes(int arr[])
	{
		int n=arr.length;
		int count=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]==arr[i+1] && arr[i]==6)
				count++;
		}
		return count;
	}
	static int sixSeven(int arr[])
	{
		int n=arr.length;
		int count=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]==6 && arr[i+1]==7)
				count++;
		}
		return count;
	}
}