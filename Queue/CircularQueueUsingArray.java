package Queue;

public class CircularQueueUsingArray<E> implements QueueInterface<E>{

	
	private E[] arr;
	private int Front;
	private int Rear;
	private int capacity;
	public CircularQueueUsingArray() {
		this.capacity = 5;
		Front = -1;
		Rear = -1;
		arr = (E[])new Object[capacity];
	}
	public CircularQueueUsingArray(int capacity) {
		this.capacity = capacity;
		Front = -1;
		Rear = -1;
		arr = (E[])new Object[capacity];
	}
	@Override
	public void enqueue(E ob) {
		if(isFull()) {
			System.out.println("Circular Queue is Full.");
			return;
		}else {
			if(isEmpty()) {
				Front++;
			}
			Rear = (Rear + 1) % capacity;
			arr[Rear] = ob;
		}
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Circular Queue is Empty.");
			return null;
		}else if(Front == Rear) {
			E deq = arr[Front];
			Front = -1;
			Rear = -1;
			return deq;
		}else {
			E deq = arr[Front];
			Front = (Front + 1) % capacity;
			return deq; 
		}
	}

	@Override
	public boolean isFull() {
		if((Rear+1) % capacity == Front) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		if(Front == -1 && Rear == -1) {
			return true;
		}
		return false;
	}

	@Override
	public E peek() {
		if(!isEmpty()) {
			return arr[Front];
		}
		System.out.println("Circular Queue is Empty.");
		return null;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("[ ]");
			return;
		}
		System.out.print("[");
		for(int i =Front;i != Rear;i = (i+1) % capacity) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(arr[Rear]+"]");
	}
	public Integer size() {
		// TODO Auto-generated method stub
		Integer count = 0;
		if(isEmpty()) {
			return count;
		}
		
		for(int i =Front;i != Rear;i = (i+1) % capacity) {
			count++;
		}
		count++;
		return count;
	}
	
//	public Integer  countduplicates() {
//		Integer count = 0;
//		int temp = Front;
//		while(temp!=(Rear+1)% capacity) {
//			
//			temp = (temp + 1) % capacity;
//		}
//		return count;
//	}
}
