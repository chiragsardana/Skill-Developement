package Queue;

public class DequeueUsingArray<E>{
	
	private E[] arr;
	private int capacity;
	private int Front;
	private int Rear;
	private int size;
	
	DequeueUsingArray(){
		this.capacity = 10;// Intial Capacity
		arr = (E[])new Object[capacity];//Chirag19CSU071
		Front = -1;
		Rear = -1;
	}
	DequeueUsingArray(int capacity){
		this.capacity = capacity;
		arr = (E[])new Object[capacity];
		Front = -1;
		Rear = -1;
	}
	
	public void enqueueRear(E ob) {
		if(isFull()) {
			System.out.println("Dequeue is Full.");
			return;
		}else {
			if(isEmpty()) {
				Front++;
			}
			Rear = (Rear + 1) % capacity;
			arr[Rear] = ob;
		}
	}
	public void enqueueFront(E ob) {
		if(isFull()) {
			System.out.println("Dequeue is Full.");
			return;
		}else if(isEmpty()) {
			Rear++;
			Front = (Front +  1) % capacity;
			arr[Front] = ob;
		}else if(Front == 0 ){
			Front = capacity - 1; 
			arr[Front] = ob;
		} else {
			Front--;
			arr[Front] = ob;
		}
	}
	public E dequeueFront() {
		if(isEmpty()) {
			System.out.println("Dequeue is Empty.");
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
	public E dequeueRear() {
		if(isEmpty()) {
			System.out.println("Dequeue is Empty.");
			return null;
		}else if(Front == Rear) {
			E deq = arr[Rear];
			Front = -1;
			Rear = -1;
			return deq;
		}else if(Rear == 0) {
			E deq = arr[Rear];
			Rear = capacity - 1; 
			return deq;
		}
		else {
			E deq = arr[Rear];
			Rear--;
			return deq; 
		}
	}

	
	public boolean isFull() {
		if((Rear+1) % capacity == Front) {
			return true;
		}
		return false;
	}

	
	public boolean isEmpty() {
		if(Front == -1 && Rear == -1) {
			return true;
		}
		return false;
	}

	
	public E peekFront() {
		if(!isEmpty()) {
			return arr[Front];
		}
		System.out.println("Dequeue is Empty.");
		return null;
	}
	
	public E peekRear() {
		if(!isEmpty()) {
			return arr[Rear];
		}
		System.out.println("Dequeue is Empty.");
		return null;
	}
	
	public void display() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("[ ]");
			return;
		}
		System.out.print("[");
		for(int i = Front;i != Rear;i = (i+1) % capacity) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(arr[Rear]+"]");
	}
	public Integer size() {
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

}
