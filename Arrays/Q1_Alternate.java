/*
Create an array of integer with size n. Return the difference between the largest and the smallest value inside that array. 

Definition of Done: 

a) The program should ask user to enter the size and elements of the array. 

b) The program should display the difference b/w the largest & smallest element. 
 */
package Arrays;
import java.util.Scanner;
public class Q1_Alternate
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
		Pair minmax=new Pair();
		int i=0;
		while (i < n - 1) 
		{ 
            if (arr[i] > arr[i + 1]) 
            { 
                if (arr[i] > minmax.max) 
                { 
                    minmax.max = arr[i]; 
                } 
                if (arr[i + 1] < minmax.min) 
                { 
                    minmax.min = arr[i + 1]; 
                } 
            } 
            else 
            { 
                if (arr[i + 1] > minmax.max) 
                { 
                    minmax.max = arr[i + 1]; 
                } 
                if (arr[i] < minmax.min) 
                { 
                    minmax.min = arr[i]; 
                } 
            } 
            i += 2; 
        }
        if(i!=n)
        {
        	if(arr[i]<minmax.min)
        	{
        		minmax.min=arr[i];
        	}
        	if(arr[i]>minmax.max)
        	{
        		minmax.max=arr[i];
        	}
        }

		System.out.println("The Difference between the largest and smallest is : "+(minmax.max-minmax.min));
	}
	static class Pair
	{
		int min;
		int max;
		Pair()
		{
			max=Integer.MIN_VALUE;
			min=Integer.MAX_VALUE;
		}
	}
}