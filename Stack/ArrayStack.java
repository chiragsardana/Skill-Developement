/*Now I Am implementing Generics Stack class Using Array 
And Also uses the interface called Stack*/
package Stack;
import java.util.Arrays;
public class ArrayStack<E> implements Stack<E>
{
	private static final int DEFAULT_CAPACITY = 10;
	private E[] store;
	private int size=0;
	private int capacity;

	public ArrayStack()
	{
		this.capacity = DEFAULT_CAPACITY;
		store =(E[])new Object[DEFAULT_CAPACITY];
	}
	public ArrayStack(int capacity)
	{
		this.capacity = capacity;
		store = (E[]) new Object[capacity];
	}
	@Override
	public boolean  push(E value)
	{
		if(this.size>=store.length)
		{
			int newSize = size + (size >> 2);
			store = Arrays.copyOf(store,newSize);
		}


		/*
		Not Only Store value in  Stack but also increases
		size of the array, 
		a good use ++ operator which 
		ensures that first you store at current index 
		and than increment size
		*/
		store[size++] = value;
		return true;
	}
	@Override
	public E pop()
	{
		if(size <= 0)
		{
			return null;
		}

		E value = store[--size];

		return value;
	}
	@Override
	public E peek()
	{
		if(size <= 0)
		{
			return null;
		}

		E value = store[--size];

		size++;

		return value;
	}
	@Override
	public int size()
	{
		return size;
	}
	@Override
	public boolean isEmpty()
	{
		if(size <=0)
		{
			return true;
		}
		return false;
	}
	@Override
	public boolean contains(E value)
	{
		boolean found = false;

		for(int i = 0;i < size ; i++)
		{
			E element = store[i];
			if(element.equals(value))
			{
				found = true;
				break;
			}
		}
		return found;
	}
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = size - 1;i >= 0;i--)
		{
			sb.append(this.pop());

			if(i > 0)
			{
				sb.append(",");
			}
		}
		sb.append("]");

		return sb.toString();
	}
}