package Queue;

public interface QueueInterface<E> {//Chirag19CSU071
	public void enqueue(E ob);
	public E dequeue();
	public boolean isFull();
	public boolean isEmpty();
	public E peek();
	public void display();
}
