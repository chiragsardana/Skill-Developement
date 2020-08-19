/*
Write a method called median() that accepts an array of integers as its argument and 
returns the median of the numbers in the array. The median is the number that will appear 
in the middle if you arrange the elements in order. Assume that the array is of odd size 
(so that one sole element constitutes the median) and that the numbers in the array are between 
0 and 99 inclusive.  

For example, the median of {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17} is 5 and the median of 
{42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27} is 25. 

Similarly, in case of even size, the median would be the average of middle two numbers.  

Definition of Done: 

Program should ask the user to enter the array size and input integer values 

The median() method should return the median of the array based on its size 
*/
package Arrays;
import java.util.*;
public class Q8
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
		System.out.println("The Median is : "+Median(arr));
	}
	static float Median(int arr[])
	{
		float med;
		Arrays.sort(arr);
		if(arr.length%2!=0)
		{
			med=(float)(arr[arr.length/2]);
		}
		else
		{
			med=(float)(arr[arr.length/2]+arr[(arr.length/2)-1])/2;
		}
		return med;
	}
}