package Queue;

public class QueueUsingNode<E> implements QueueInterface<E> {
	private QueueNode<E> Front;
	private QueueNode<E> Rear;
	public QueueUsingNode(){
		Front = null;
		Rear = null;
	}
	@Override
	public void enqueue(E ob) {
		if(isEmpty()) {
			Front = Rear = new QueueNode<E>(ob);
		}else {
			Rear.next = new QueueNode<E>(ob);
			Rear = Rear.next;
		}
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Queue is Empty.");
			return null;
		}
		E deq = Front.data;
		Front = Front.next;
		return deq;
	}

	@Override
	public boolean isFull() {
		System.out.print("In Dynamic Queue There is no isFull() method");
		return false;
	}

	@Override
	public boolean isEmpty() {
		if(Front == null ||  Rear == null) {
			return true;
		}
		return false;
	}

	@Override
	public E peek() {
		if(!isEmpty()) {
			return Front.data;
		}
		System.out.println("Queue is Empty.");
		return null;
	}

	@Override
	public void display() {
		QueueNode<E> temp = Front;
		System.out.print("[");
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println("]");
	}
	public Integer size() {
		QueueNode<E> temp = Front;
		Integer count = 0;
		while(temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
}

