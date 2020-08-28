/*Write a program to compare two LinkedHashSets and retain elements which are same on both LinkedHashSet.*/
import java.util.*;
public class Q7
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> linkedhset1=new LinkedHashSet<>();
		LinkedHashSet<Integer> linkedhset2=new LinkedHashSet<>();
		linkedhset1.add(0);
		linkedhset1.add(1);
		linkedhset1.add(2);
		linkedhset1.add(3);
		linkedhset1.add(4);
		linkedhset1.add(5);

		linkedhset2.add(0);
		linkedhset2.add(5);
		linkedhset2.add(6);
		linkedhset2.add(7);
		linkedhset2.add(8);
		linkedhset2.add(9);
		linkedhset2.add(2);

		linkedhset1.retainAll(linkedhset2);
		System.out.println(linkedhset1);

	}
}