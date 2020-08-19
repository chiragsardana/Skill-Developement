/*
Given an array of pairs of integers. The task is to sort the array with respect to
 second element of the pair. 

 

Example: 

Input: [(2, 1), (5, 3), (6, 2), (1, 7)] 

Output: [(1, 2), (3, 5), (2, 6), (1, 7)] 

 

Definition of Done: 

Create a class Pair and store the pairs in an array 

Ask the user to enter the array size and elements into it 

Define a static function sort that sorts an array of pairs w.r.t the second element of the pair 
*/
package Arrays;
import java.util.*;
public class Q9
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Number of Pairs : ");
		int n=input.nextInt();
		System.out.println("Enter the Value of Pair One by 1");
		Pair arr[]=new Pair[n];
		for(int i=0;i<n;i++)
		{
			int a=input.nextInt();
			int b=input.nextInt();
			arr[i]=new Pair(a,b);
		}
		System.out.println("Array Before Sort ");
		printPair(arr,n);
		arr=sortPair(arr,n);
		System.out.println("\nArray After Sort ");
		printPair(arr,n);
	}
	static void printPair(Pair[] arr,int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print("["+arr[i].a+","+arr[i].b+"] ");
		}
	}
	static Pair[] sortPair(Pair[] arr,int n)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i].a>arr[i].b)
			{
				int temp=arr[i].a;
				arr[i].a=arr[i].b;
				arr[i].b=temp;
			}
		}
		return arr;
	}
	static class Pair
	{
		int a;
		int b;
		Pair(int a,int b)
		{
			this.a=a;
			this.b=b;
		}
	}
}