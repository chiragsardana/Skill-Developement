package Stack;
import java.util.LinkedList;
import java.util.List;
public class ListStack<E> implements Stack<E>
{
	private static final int DEFAULT_CAPACITY = 10;
	private LinkedList<E> store;
	private int size=0;
	private int capacity;

	public ListStack()
	{
		this.capacity = DEFAULT_CAPACITY;
		store =new LinkedList<E>();
	}
	public ListStack(int capacity)
	{
		this.capacity = capacity;
		store = new LinkedList<E>();
	}
	@Override
	public boolean push(E value)
	{
		store.offerFirst(value);
		return true;
	}
	@Override
	public E pop()
	{
		E value = store.pollFirst();
		return value;
	}
	public E peek()
	{
		E value = store.peekFirst();
		return value;
	}
	@Override
	public int size()
	{
		return store.size();
	}
	@Override
	public boolean isEmpty()
	{
		return store.isEmpty();	
	}
	public boolean contains(E value)
	{
		return store.contains(value);
	}
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		while(!isEmpty())
		{
			sb.append(this.pop());

			if(!isEmpty())
			{
				sb.append(",");
			}
		}
		sb.append("]");

		return sb.toString();
	}
}