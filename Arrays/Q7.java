/*
Write a method called swapPairs() that accepts an array of integers and swaps 
the elements at adjacent indexes. That is, elements 0 and 1 are swapped, 
elements 2 and 3 are swapped, and so on. If the array has an odd length, 
the final element should be left unmodified. For example, the list {10, 20, 30, 40, 50} 
should become {20, 10, 40, 30, 50} after a call to your method. 

Definition of Done: 

Program should ask the user to input array size and integer values 

In the next line, it should print the swapped elements as desired
*/
package Arrays;
import java.util.Scanner;
public class Q7
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
		System.out.println("Arrays Before Swapping");
		printArray(arr);
		System.out.println("Array After Swapping");
		swapPairs(arr);
	}
	static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	static void swapPairs(int[] arr)
	{
		for(int i=0;i<arr.length-1;i+=2)
		{
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		printArray(arr);
	}

}