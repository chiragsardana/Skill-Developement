package Queue;

public class QueueUsingArray<E> implements QueueInterface<E>{

	
	private E[] arr;
	private int capacity;
	private int Front;
	private int Rear;
	private int size;
	QueueUsingArray(){
		this.capacity = 10;// Intial Capacity
		arr = (E[])new Object[capacity];
		Front = -1;
		Rear = -1;
	}
	QueueUsingArray(int capacity){
		this.capacity = capacity;
		arr = (E[])new Object[capacity];
		Front = -1;
		Rear = -1;
	}
	@Override
	public boolean isEmpty() {
		
		if(Front == -1 && Rear == -1) {
			return true;
		}
		return false;
	}
	@Override
	public boolean isFull() {
		if(Rear == arr.length - 1) {
			return true;
		}
		return false;
	}
	@Override
	public void enqueue(E ob) {
		if(isFull()) {
			System.out.println("Queue is Already Full.");
			return;
		}else { 
			if(isEmpty()) {
				Front++; 
			}
			Rear++;
			arr[Rear] = ob; 
		}
		
	}

	@Override
	public E dequeue() {
		E deq;
		if(isEmpty()) {
			System.out.println("Queue is Empty.");
			return null;
		}else if(Front == Rear) {
			deq = arr[Front];
			Front = -1;
			Rear = -1;
		}else {
			deq = arr[Front];
			Front++;  
		}
		return deq;
	}
	
	@Override
	public E peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty.");
			return null;
		}
		return (E)arr[Front];
	}
	@Override
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is Empty.");
			return;
		}
		System.out.print("[");
		for(int i = Front;i <= Rear;i++) {
			System.out.print(arr[i]);
			if(i != Rear) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
