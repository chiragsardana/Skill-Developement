package CollectionFramework;

/* Write a program that keeps a map in which both keys andvalues are strings—the names 
of students and their coursegrades. Prompt the user of the program to add or remove students, 
to modify grades,or to print all grades. The printout should be sorted by name and formatted 
like this:Carl: B+Joe: C Sarah: A
Definition of Done : 
Define a class that implements Map interface 
and take String attributesii.
Take the input from the user to add/remove/modify the recordsiii.
Display the resultant Map as formatted in the question
Carl: B+
Joe: C
Sarah: A*/
import java.util.*;
class Q8
{
	static Scanner input=new Scanner(System.in);
	static TreeMap<String, String> tree =new TreeMap<>();//Chirag19CSU071
	public static void main(String[] args) 
	{
		interfaceMain();
	}
	static void toAdd()
	{
		input.nextLine();
		System.out.print("Enter the Name of Student : ");
		String str=input.nextLine();
		System.out.print("Enter the Grade of the Student : ");
		String str1=input.next();
		tree.put(str,str1);
		Continue();
	}
	static void toRemove()
	{
		input.nextLine();
		System.out.print("Enter the Name of Student : ");
		String str=input.nextLine();
		if(tree.containsKey(str))
		{
			tree.remove(str);
			Continue();
			return;
		}
		else
		{
			System.out.println("Name of the Student is Not Found");
			Continue();
			return;
		}
	}
	static void toModify()
	{
		input.nextLine();
		System.out.print("Enter the Name of Student : ");
		String str=input.nextLine();
		if(tree.containsKey(str))
		{
			System.out.print("Enter the New Grade of Student : ");
			String str2=input.next();
			tree.put(str,str2);
			Continue();
			return;
		}
		else
		{
			System.out.println("Name of the Student is Not Found");
			Continue();
			return;
		}
	}
	static void toView()
	{
		System.out.println(tree);
		Continue();
	}
	static void Continue()
	{
		input.nextLine();
		System.out.println("Press Enter to Continue...");
		String b=input.nextLine();
		if(b.equals(""))
			interfaceMain();
		Continue();
	}
	static void interfaceMain()
	{
		System.out.println("Welcome toInterface ");
		System.out.println("1. To Add in Record ");
		System.out.println("2. To Remove Something in Record ");
		System.out.println("3. To Modify Something in Record ");
		System.out.println("4. To View Record ");
		System.out.println("5. To Exit" );
		System.out.print("Enter Your Option : ");
		int Select=input.nextInt();
		switch(Select)
		{
			case 1 :
			toAdd();
			break;
			case 2 :
			toRemove(); 
			break;
			case 3 :
			toModify();
			break;
			case 4: 
			toView();
			break;
			case 5 : 
			System.exit(0);
			break; 
		}
	}
}