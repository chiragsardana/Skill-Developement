package Generics;

public class GenericBasicMultiple<E,T> {
	E obj;
	T obj1;
	public GenericBasicMultiple(E obj, T obj1)
	{
		this.obj = obj;
		this.obj1 = obj1;
	}
	public void print()
	{
		System.out.println("The value of Object 1  is : "+obj);
		System.out.println("The Value of Object 2 is : "+obj1);
	}
}
