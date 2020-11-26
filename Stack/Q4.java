/*. Check for balanced parentheses in an expression
Given an expression string exp , write a program to examine whether the pairs and the orders
of {,},(,),[,] are correct in exp.
Example:
Input: exp = [()]{}{[()()]()}
Output: Balanced
Input: exp = [(])
Output: Not Balanced
*/
package Stack;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Q4
{
	public static void main(String[] args)throws IOException
	{
		System.out.print("Enter String :Like ({}[]) ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String expression = reader.readLine();

		if(checkingBalanced(expression))
		{
			System.out.println("Balanced.");
		}
		else
		{
			System.out.println("Not Balanced.");
		}
	}
	private static boolean checkingBalanced(String str)
	{
		int size = str.length();
		char x;
		if(size % 2 != 0)
			return false;
		ListStack<Character> stack = new ListStack<>();
		for(int i = 0;i < size ;i++)
		{
			char in = str.charAt(i);
			if(in == '(' || in == '[' || in == '{')
			{
				stack.push(in);
				continue;
			}


			if(stack.isEmpty())
				return false;

			switch(in)
			{
			case ')' : 
			x = stack.pop();
			if(x == '[' || x == '{')
			{
				return false;
			}
			break;
			case '}' :
			x = stack.pop();
			if(x == '(' || x == '[')
				return false;
			break;
			case ']' :
			x = stack.pop();
			if(x == '(' || x == '{')
				return false;
			break;
			}	
		}

		return stack.isEmpty();
	}
}