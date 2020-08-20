/*
Write a program that initializes an array with ten random integers and then prints four lines of output, containing:  

Every element at an even index 

Every odd element 

All elements in reverse order 

Only the first and last element 

Defining of done: 

Program should ask the user to input 10 integer values 

It should display the output line by line as asked in the question 

Finally, should ask the user to continue (Y) or quit (N) 
*/
package Arrays;
import java.util.Scanner;
public class Q2
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter the 1O Elements 1 by One");
		for(int i=0;i<10;i++)
			arr[i]=input.nextInt();
		System.out.print("Elements at Even index : ");
		evenIndex(arr);
		System.out.print("Elements at Odd index : ");
		oddIndex(arr);
		System.out.print("All Elements in Reverse Order : ");
		reverseIndex(arr);
		System.out.print("The First And the Last in the Array : ");
		firstLast(arr);
		System.out.print("Enter Y to continue or N to quit the Program : ");
		char ch=input.next().charAt(0);
		if(ch=='Y' || ch=='y')
			main(args);
		else if(ch=='N' || ch=='n')
			System.exit(1);
	}
	static void evenIndex(int[] arr)
	{
		for(int i=0;i<10;i=i+2)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	static void oddIndex(int[] arr)
	{
		for(int i=1;i<10;i=i+2)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	static void reverseIndex(int[] arr)
	{
		for(int i=9;i>=0;i--)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	static void firstLast(int[] arr)
	{
		System.out.println(arr[0]+" "+arr[9]);
	}
}