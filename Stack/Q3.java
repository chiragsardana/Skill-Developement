 
/*
//Write a program to reverse the Sentence using Stack
//Given a string str consisting of a sentence, the task is to reverse the entire sentence word by word.
//Examples:
//Input: str = geeks for geeks
//Output: geeks for geeks
//Input: str = data structures and algorithms
//Output: algorithms and structures data
*/
package Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Q3
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Reverse Line Word by Word.");
		System.out.print("Enter Input : ");
		String str = reader.readLine();

		StringTokenizer sto = new StringTokenizer(str," ");
		ListStack<String> st = new ListStack<>();
		StringBuilder sb = new StringBuilder();
		
		while (sto.hasMoreTokens()) 
		{  
       		st.push(sto.nextToken());  
     	}
     	while(!st.isEmpty())
     	{
     		sb.append(st.pop()+" ");
     	} 
		System.out.println("The String Become : "+sb.toString());
	}
}