package CollectionFramework;

//. Use a stack to reverse the words of a sentence. Keep reading words until you have a word
//that ends in a period, adding them onto a stack. When you have a word with a period, pop the
//words off and print them. Stop when there are no more words in the input. (20 mins)
//Definition of Done
//i. You should the convert the input as follows:
//Mary had a little lamb. Its fleece was white as snow.
//into
//Lamb little a had mary. Snow as white was fleece its.
//ii. Display the desired resultant stack

/*Lamb little a had mary. Snow as white was fleece its.*/
import java.util.*;
public class Q4
{
	public static void main(String[] args) 
	{
		Stack<String> s=new Stack<String>();
		String str="Mary had a little lamb. Its fleece was white as snow.";
		String arr1[]=str.split(" ");
		for(int i=0;i<arr1.length;i++)
		{
			char ch=arr1[i].charAt(arr1[i].length()-1);
			if(ch=='.')
			{
				String temp=arr1[i];
				temp=temp.substring(0, arr1[i].length()-1);
				temp=capitalize(temp);//
				s.push(temp);

				while(!s.empty())
				{
					System.out.print(s.pop());
					if(!s.empty())
					{		
						System.out.print(" ");			//Chirag19CSU071
					}
					else
					{
						System.out.print(". ");
					}
				}
			}
			else
			{
				String temp=arr1[i];
				if(s.empty())
				{
					temp=smalize(temp);
				}
				s.push(temp);
			}
		}
	}
	public static String capitalize(String str) 
	{
		String[] words = str.split("\\s");
		StringBuilder sb = new StringBuilder();

		for (String s: words) 
		{
			if (!s.equals("")) 
			{
				sb.append(Character.toUpperCase(s.charAt(0)));
				sb.append(s.substring(1));
			}
			sb.append(" ");
		}
		return sb.toString().trim();
	}
	public static String smalize(String str) 
	{
		String[] words = str.split("\\s");
		StringBuilder sb = new StringBuilder();

		for (String s: words) 
		{
			if (!s.equals("")) 
			{
				sb.append(Character.toLowerCase(s.charAt(0)));
				sb.append(s.substring(1));
			}
			sb.append(" ");
		}
		return sb.toString().trim();
	}

}
