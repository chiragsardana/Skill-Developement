/*
Reverse individual words
Given a string str, we need to print reverse of individual words.
Examples:
Input : Hello World
Output : olleH dlroW
Input : Geeks for Geeks
Output : skeeG rof skeeG
*/
package Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Q8
{
	public static void main(String[] args)throws IOException 
	{
		Stack<Character> stack = new ListStack<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Sting : ");
		String str = reader.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		String result = "";
		while (st.hasMoreTokens()) 
		{  
       		String temp = st.nextToken();
       		for(int i = 0;i < temp.length();i++)
       		{
       			stack.push(temp.charAt(i));
       		}  
       		while(!stack.isEmpty())
       		{
       			result += stack.pop();
       		}
       		result += " "; 
     	}
     	System.out.println("Output : "+result);
	}
}