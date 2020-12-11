package CollectionFramework;

/*
 Write a program that reads a file and displays the words of that file as a list.
o First display all words. !
o Then display them in reverse order. !
o Then display them with all plurals (ending in "s"). !
o Then display them with all plural words removed and the size of updated list.
*/
import java.io.BufferedReader;
import java.io.*;
import java.util.*;
class Q1
{
	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<>();
		String[] words=null;
		try
		{
			InputStream is = new FileInputStream("..//java//Text.txt");
        	BufferedReader buf = new BufferedReader(new InputStreamReader(is));
        	String line = buf.readLine();
        	while(line != null)
        	{
        		words=line.split(" ");
        		for(int i=0;i<words.length;i++)//Chirag Sardana 19CSU071
        		{
        			list.add(words[i]);
        		}
        	    line = buf.readLine();
			}
		}
		catch(Exception fe)
		{
			System.out.println(fe);
		}
        // System.out.println(list);
		display(list);
		System.out.println(list.size());
		System.out.println();
        reversedisplay(list);
        System.out.println();
        endingSdisplay(list);
        System.out.println();
        endingWithSdisplay(list);
        System.out.println();
	}
	static void display(ArrayList<String> list)
	{
		System.out.print("First display all words : ");
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");
		System.out.println();
	}
	static void reversedisplay(ArrayList<String> list)
	{
		System.out.print("Then display them in reverse order : ");
		for(int i=list.size()-1;i>=0;i--)
			System.out.print(list.get(i)+" ");
		System.out.println();
	}
	static void endingSdisplay(ArrayList<String> list)
	{
		System.out.print("Then display them with all plurals ending with s : ");
		for(int i=0;i<list.size();i++)
		{
			String temp=list.get(i);
			int len=temp.length();
			char temp1=temp.charAt(len-1);
			if(temp1=='s' || temp1=='S')
				System.out.print(temp+" ");
		}
		System.out.println();
	}
	static void endingWithSdisplay(ArrayList<String> list)
	{
		System.out.print("Then display them with all plural words removed  Display the updated size  : ");
		for(int i=0;i<list.size();i++)
		{
			String temp=list.get(i);
			int len=temp.length();
			char temp1=temp.charAt(len-1);
			if(temp1=='s' || temp1=='S')
			{
				list.remove(i);	
			}
		}
		System.out.println(list.size()-1);
	}
}