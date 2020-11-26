/*
Delete all odd elements from a stack
Given a stack with n elements, the task is to remove all the elements of the stack without affecting the
order of elements.
Examples:
Input : s = 16 <- 15 <- 29 <- 24 <- 19 (TOP)
Output: 24 16
24 <-16 is the order of even elements in which
they will be popped from the given stack.
Input : s = 1 <- 2 <- 3 <- 4 <- 5 (TOP)
Output: 4 2
*/
package Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Q6
{
	public static void main(String[] args)throws IOException
	{
		Stack<Integer> stack = new ListStack<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Elements (to Stop Enter \"stop\") ");
		while(true)
		{
			String str = reader.readLine();
			if(str.equals("stop"))
			{
				break;
			} 
			else
			{
				stack.push(Integer.parseInt(str));
			}
		}

		Stack<Integer> temp = new ListStack<>();

		while(!stack.isEmpty())
		{
			if(stack.peek() % 2 == 0)
			{
				temp.push(stack.peek());
			}
			stack.pop();
		}
		while(!temp.isEmpty())
		{
			stack.push(temp.pop());
		}
		System.out.println("The Stack is  : "+stack);

	}
}