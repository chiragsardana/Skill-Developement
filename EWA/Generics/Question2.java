package Generics;
/*
 Write a simple java program to demonstrate how NOT using generics can cause Runtime
exceptions.
Definition of Done
i. Define a class using any Collection (ArrayList preferably)
ii. Pass different types of parameters such as Strings, Integers etc.
iii. Now try to fetch those arguments & show the exception occurring at runtime
 */
import java.util.ArrayList;

public class Question2 {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();
		list.add(new Integer(100));
		list.add(new String("Sardana"));
		list.add(new Double(2.23));
		
		try {
			System.out.println("We are now try to  Fetch Element from List at index 0  "+list.get(0));
			System.out.println("We are now try to  Fetch Element from List at index 1  "+list.get(1));
			Integer element1 = (Integer)list.get(0);
			//In this we have to manually type caste the Object...
			Integer element2 = (Integer)(list.get(1));
			//If we developer don't know which type of Object is inserted
			//while ridirecting it will cause error definately
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
