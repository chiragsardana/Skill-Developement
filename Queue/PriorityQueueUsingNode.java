package Queue;

public class PriorityQueueUsingNode<E> {
	
	private PriorityNode<E> Front;
	private PriorityNode<E> Rear;
	
	public PriorityQueueUsingNode() {
		Front = null;
		Rear = null;
	}
	
	public void enqueue(E ob,int priority) {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			Front = Rear =  new PriorityNode(ob, priority);
		}else {
			Rear.next = new PriorityNode<E>(ob,priority);
			Rear = Rear.next;
		}
	}

	
	public E dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Priority Queue is Empty!!!");
			return null;
		}else {
			Integer maxPriority = null;
			
			PriorityNode<E> temp = Front;
			while(temp != null) {
				if(maxPriority > temp.priority) {
					maxPriority = temp.priority;
				}
			}
			temp = Front;
			PriorityNode<E> Previous = null;
			PriorityNode<E> Next = null;
			E obj = null;
			while(temp !=null) {
				Previous = temp;
				if(maxPriority == temp.priority) {
					obj = temp.data;
					Previous.next = temp.next;
					break;
				}
				temp = temp.next;
			}
			return obj;
		}
	}

	public boolean isFull() {
		// TODO Auto-generated method stub
		System.out.print("In Dynamic Queue There is no isFull() method");
		return false;
	}

	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(Front == null || Rear == null) {
			return true;
		}
		return false;
	}

	
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void display() {
		// TODO Auto-generated method stub
		PriorityNode<E> temp = Front;
		System.out.print("[");
		while(temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
			if(temp != null) {
				System.out.print(" ");
			}
		}
		System.out.println("]");
	}
	
}
