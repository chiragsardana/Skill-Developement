package Generics;

public class GenericBasic<E> {
	private E obj;
	public GenericBasic(E obj)
	{
		this.obj = obj;
	}
	public E get()
	{
		return this.obj;
	}
	public void set(E obj)
	{
		this.obj = obj;
		//System.out.print();
	}
}
