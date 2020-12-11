package CollectionFramework;

/*
Write  a  program  that  reads  a  text  file  and  prints  a  list  of  all  words  in  the  file  in anyorder, together with a count that indicates how often each word occurred in the file.
For example, the following is the beginning of the output that results from processing the book Alice in Wonderland: 
Definition of Donei.The program should read the text from the file namely “alice_in_wonderland.txt”ii.Use appropriate Map class to get the word and its countiii.Should individual word along with its frequency as the final output
alice_in_wonderland 
*/
import java.util.*;
import java.util.Map;
import java.io.*;
class Q9
{
	public static void main(String[] args) 
	{
		HashMap<String,Integer> hmap=new HashMap<>();//Adding Dictionery Words in HashSet
		try
		{
			InputStream dic = new FileInputStream("dictionary.txt");
			BufferedReader buf = new BufferedReader(new InputStreamReader(dic));//Chirag19CSU071
        	String line = buf.readLine();
        	while(line != null)
        	{
        		String[] arr=line.split(" ");
        		for(int i=0;i<arr.length;i++)
        		{
        			arr[i]=RemoveSpecialCharacter(arr[i]);
        			if(hmap.containsKey(arr[i]))
        				hmap.put(arr[i],(hmap.get(arr[i])+1));
        			else
        				hmap.put(arr[i],1);
        		}
        	    line = buf.readLine();
			}
		}
		catch(Exception fe)
		{
			System.out.println(fe);
		}
		for (Map.Entry<String,Integer> entry : hmap.entrySet()) 
		{ 
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
	}
	static String RemoveSpecialCharacter(String str)
	{
		String resultStr="";  
		//loop execute till the length of the string  
		for (int i=0;i<str.length();i++)  
		{  
			if ((str.charAt(i)>64 && str.charAt(i)<91)  || (str.charAt(i)>=97 &&str.charAt(i)<=122))
			{  
				resultStr=resultStr+str.charAt(i);  
			}
		}
		return resultStr;
	}
}