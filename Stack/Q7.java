/*
Write a program in Java to convert infix expression to postfix
Note that here we use Stack class for Stack operations
Infix expression:The expression of the form a op b. When an operator is in-between every pair
of operands.
Postfix expression:The expression of the form a b op. When an operator is followed for every
pair of operands.
Why postfix representation of the expression?
The compiler scans the expression either from left to right or from right to left.
Consider the below expression: a op1 b op2 c op3 d
If op1 = +, op2 = *, op3 = +
The compiler first scans the expression to evaluate the expression b * c, then again scan the
expression to add a to it. The result is then added to d after another scan.
The repeated scanning makes it very in-efficient. It is better to convert the expression to
postfix(or prefix) form before evaluation.
*/

package Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Q7
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("Conversion From Infix to Postfix.");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Infix Expression : ");
		String Expression = reader.readLine();
		System.out.println("Expression : "+infixToPostfix(Expression));
	}
	private static int precidence(char P)
	{
		if(P == '^')
			return 3;
		else if(P == '*' || P == '/')
			return 2;
		else if(P == '+' || P == '-') 
    		return 1;
    	return -1;
	}
	private static String infixToPostfix(String Expression)
	{
		String result = "";
		Stack<Character> stack = new ListStack<>();

		for(int i = 0 ;i < Expression.length();i++)
		{
			char ch = Expression.charAt(i);
			if(Character.isLetterOrDigit(ch))
			{
				result = result + ch;
			}
			else if(ch == '(')
			{
				stack.push('(');
			}
			else if(ch == ')')
			{
				while(!stack.isEmpty() && stack.peek() != '(')
					result += stack.pop();
				
				if(!stack.isEmpty() && stack.peek() != '(')
					return "Invalid Expression";
				else
					stack.pop();
			}
			else
			{
				while(!stack.isEmpty() && precidence(ch) <= precidence(stack.peek()))
				{
					if(stack.peek() == '(')
						return "Invalid Expression";
					result += stack.pop();
				}
				
				stack.push(ch);
			}
		}

		while(!stack.isEmpty())
		{
			if(stack.peek() == '(') 
				return "Invalid Expression"; 
			result += stack.pop(); 
		}

		return result;
	}
}