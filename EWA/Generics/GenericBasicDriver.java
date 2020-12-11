package Generics;

public class GenericBasicDriver {
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		GenericBasic<Integer> obj = new GenericBasic<>(new Integer(71));
		System.out.println("The value is : "+obj.get());
		
		GenericBasic<String> obj1 = new GenericBasic<>("Chirag19CSU071");
		System.out.println("The String is : "+obj1.get());	
		
		GenericBasicMultiple<Integer,String> obj2 = new GenericBasicMultiple<>(71,"Chirag19CSU071");
		obj2.print();
		
		
//		Object[] strings = new Object[2];
//		strings[0] = "hi";   // OK
//		strings[1] = new Integer(100);    // An ArrayStoreException is thrown.
//		System.out.println(strings[0]+" "+strings[1]);

	}
}
