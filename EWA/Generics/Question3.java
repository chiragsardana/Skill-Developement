package Generics;
/*
 * Do the same program (P2) using generics and convert the runtime exception into compile time
exception.
Definition of Done
i. Follow the same steps as in problem 2 now using generic types
ii. Show the exception occurring at compilation time
 */
import java.util.ArrayList;

public class Question3 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
//		list.add(new String("19CSU071"));
		//Now by using generic we are do 
		//Strict type checking Thats why 
		//now compile time error occurs
		list.add(new Integer(200));
		System.out.println("List is : "+list);
	}
}
