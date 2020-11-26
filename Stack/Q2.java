/*Write a program to implement stack using arrays.
Definition of Done:
a) The program should display a menu (1) Push (2) Pop (3) Peep (4) Exit.
b) The program should define functions for the menu item listed above.
*/
package Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Q2
{
	public static void main(String[] args)throws IOException 
	{
		int size;
		ListStack<Integer> integer_type;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Stack implemented by using LinkedList.");
		

		integer_type = new ListStack<>();

		boolean flag = true;
		while(flag)
		{
			System.out.print("1.Push\n2.Pop\n3.Peek\n4.Show\n5.Exit");
			System.out.print("\nEnter Option : ");
			int num_option = Integer.parseInt(reader.readLine());

			switch(num_option) 
			{
			case 1 : 
			integer_type.push(Integer.parseInt(reader.readLine()));
			break;
			case 2 : 
			System.out.println("Element at Top of the Stack is : "+integer_type.pop());
			break;
			case 3 : 
			System.out.println("Element at Top of the Stack is : "+integer_type.peek());
			break;
			case 4 :
			System.out.println("The Stack is : "+integer_type);
			break;
			case 5 : 
			System.out.println("Exiting...");
			System.exit(1);
			default :
			System.out.println("Invalid option...");
			break;
			}
		}
	}
}

//to compile javac -cp classes/ -d classes/ src/Stack/Q1.java
//to run java -cp classes/ Stacks.Q1