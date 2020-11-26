/*
 Prefix to Postfix Conversion
Prefix : An expression is called the prefix expression if the operator appears in the expression
before the operands. Simply of the form (operator operand1 operand2).
Example : *+AB-CD (Infix : (A+B) * (C-D) )
Postfix: An expression is called the postfix expression if the operator appears in the expression
after the operands. Simply of the form (operand1 operand2 operator).
Example : AB+CD-* (Infix : (A+B * (C-D) )
Given a Prefix expression, convert it into a Postfix expression.
Conversion of Prefix expression directly to Postfix without going through the process of
converting them first to Infix and then to Postfix is much better in terms of computation and
better understanding the expression (Computers evaluate using Postfix expression).
Examples:
Input : Prefix : *+AB-CD
Output : Postfix : AB+CD-*
Explanation : Prefix to Infix : (A+B) * (C-D)
Infix to Postfix : AB+CD-*
Input : Prefix : *-A/BC-/AKL
Output : Postfix : ABC/-AK/L-*
Explanation : Prefix to Infix : A-(B/C)*(A/K)-L
 Infix to Postfix : ABC/-AK/L-*
Algorithm for Prefix to Postfix:
• Read the Prefix expression in reverse order (from right to left)
• If the symbol is an operand, then push it onto the Stack
• If the symbol is an operator, then pop two operands from the Stack
Create a string by concatenating the two operands and the operator after them.
string = operand1 + operand2 + operator
And push the resultant string back to Stack
• Repeat the above steps until end of Prefix expression
*/
package Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Q9
{
	public static void main(String[] args)throws IOException
	{
		Stack<String> stack = new ListStack<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Prefix to Postfix.");
		System.out.print("Enter the String : ");
		String str = reader.readLine();
		
		str = reverse(str);
		for(int i = 0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(Character.isLetterOrDigit(ch))
			{
				stack.push(ch+"");
			}
			else
			{
				String temp = "";
				temp += stack.pop();
				temp +=stack.pop();
				temp += ch;
				stack.push(temp);
			}
		}
		System.out.println("Expression : "+stack.pop());
	}
	private static String reverse(String str)
	{
		String result = "";
		for(int i = str.length() - 1;i >= 0;i--)
		{
			result += str.charAt(i);
		}
		return result;
	}
}