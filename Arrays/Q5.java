/*
Write a program that reads a 2-D integer array with each element of maximum 2 digits and prints the following: 

a) Elements of the entered array. 

b) Elements of the array after each element is multiplied by 2 if it is an odd number. 

 Definition of Done: 

The program should generate an error message if the number of digits in the array is more than two and ask the user to re-enter the number. 

The program should use continue statement for ignoring even elements. 

The array elements should be displayed in tabular form with width set to 
*/
package Arrays;
import java.util.Scanner;
public class Q5
{
	public static Scanner input=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number of Rows : ");
		int r=input.nextInt();
		System.out.print("\nEnter the Number of Columns : ");
		int c=input.nextInt();
		int arr[][]=new int[r][c];
		System.out.println("\nEnter the elements in the 2-D Array 1 by one");
		for (int i=0;i<r ;i++ ) 
		{
			for (int j=0;j<c ;j++ ) 
			{
				int temp=input.nextInt();
				arr[i][j]=checkNumber(temp);
			}
		}
		System.out.println("Elements of the array is Given Below ");
		printAllElements(arr,r,c);
		System.out.println("Elements of Array after multiplied by 2 ");
		changesInArray(arr,r,c);
	}
	static void printAllElements(int arr[][],int r,int c)
	{

		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	static void changesInArray(int arr[][],int r,int c)
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(arr[i][j]%2!=0)
				{
					arr[i][j]*=2;
				}	
				else
					continue;
			}
		}
		printAllElements(arr,r,c);
	}
	static int checkNumber(int num)
	{
		if(num<10 || num>=100)
		{
			System.out.println("You have to re-enter the value in between 10-100 ");
			num=input.nextInt();
		}
		return num;
	}
}