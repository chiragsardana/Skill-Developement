/*
Write a program that constructs a jagged two-dimensional array to represent pascals triangle.
It takes advantage of the fact that, each value other than the 1s that appear in the beginning 
and at the end of each row is the sum of two values from the previous row.
1
1  1
1  2  1
1  3  3  1
1  4  6  4  1
...
*/
package Arrays;
import java.util.*;
public class Q11
{
	public static void main(String[] args) 
	{
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number of Rows : ");
        int n=input.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
                if(j==0 || j==i)
                    arr[i][j]=1;
                else
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
        }
        System.out.println("The Pascal Triangle is ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
                System.out.print(arr[i][j]+"\t");

            System.out.println();
        }
	}
}