package Queue;

public class PriorityNode<E> {
	E data;
	Integer priority;
	public PriorityNode<E> next;
	public PriorityNode(E data,Integer priority){
		this.data = data;
		this.priority = priority;
		next = null;
	}
}
