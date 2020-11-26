// Find maximum sum possible equal sum of three stacks
// Given three stack of the positive numbers, the task is to find the possible equal maximum sum
// of the stacks with removal of top elements allowed. Stacks are represented as array, and the
// first index of the array represent the top element of the stack.
/*
Examples:
Input : stack1[] = { 3, 10}
 stack2[] = { 4, 5 }
 stack3[] = { 2, 1 }
Output : 0
Sum can only be equal after removing all elements from all stacks.

*/
package Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Q10
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Maximum sum possible equal sum of three Stacks.");

		System.out.print("Enter the size of Stack 1 : ");
		int size1 = Integer.parseInt(reader.readLine());
		System.out.println("Enter the Elements One by one.");
		int st1[] = new int[size1];
		for(int i = 0 ;i < size1 ;i++)
		{
			st1[i]=Integer.parseInt(reader.readLine());
		}

		System.out.print("Enter the size of Stack 2 : ");
		int size2 = Integer.parseInt(reader.readLine());
		System.out.println("Enter the Elements One by one.");
		int st2[] = new int[size2];
		for(int i = 0 ;i < size2 ;i++)
		{
			st2[i]=Integer.parseInt(reader.readLine());
		}
		
		System.out.print("Enter the size of Stack 3 : ");
		int size3 = Integer.parseInt(reader.readLine());
		System.out.println("Enter the Elements One by one.");
		int st3[] = new int[size3];
		for(int i = 0 ;i < size3 ;i++)
		{
			st3[i]=Integer.parseInt(reader.readLine());
		}
			
		System.out.println("The Maximum sum is : "+maxSum(st1,st2,st3));
	}
	public static int maxSum(int[] st1,int[] st2,int[] st3)
	{
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;

		if(st1.length == 0 || st2.length == 0 || st3.length == 0)
			return 0;
		for(int i = 0;i< st1.length;i++)
		{
			sum1 += st1[i];
		}
		for(int i = 0;i< st2.length;i++)
		{
			sum2 += st2[i];
		}
		for(int i = 0;i< st3.length;i++)
		{
			sum3 += st3[i];
		}

		int top1 = 0, top2 = 0, top3 = 0;
      	int ans = 0;
      	while (true)
      	{
          if (top1 == st1.length || top2 == st2.length || top3 == st3.length)
             return 0;
      
          if (sum1 == sum2 && sum2 == sum3)
             return sum1;

          if (sum1 >= sum2 && sum1 >= sum3)
             sum1 -= st1[top1++];
          else if (sum2 >= sum1 && sum2 >= sum3)
             sum2 -= st2[top2++];
          else if (sum3 >= sum2 && sum3 >= sum1)
             sum3 -= st3[top3++];
       }
		
	}
}