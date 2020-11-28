package Queue;

import java.util.Stack;

public class QueueUsingStack<E> implements QueueInterface<E>{

	Stack<E> st1 = new Stack<E>();//Enqueue
	Stack<E> st2 = new Stack<>();//Dequeue
	@Override
	public void enqueue(E ob) {
		st1.push(ob);
	}

	@Override
	public E dequeue() {
		while(!st1.isEmpty()) {
			st2.push(st1.pop());
		}
		E deq = st2.pop();
		while(!st2.isEmpty()) {
			st1.push(st2.pop());
		}
		return deq;
	}

	@Override
	public boolean isFull() {
		System.out.print("In Dynamic Queue There is no isFull() method");
		return false;
	}

	@Override
	public boolean isEmpty() {
		return st1.isEmpty();
	}

	@Override
	public E peek() {
		while(!st1.isEmpty()) {
			st2.push(st1.pop());
		}
		E deq = st2.peek();
		while(!st1.isEmpty()) {
			st1.push(st2.pop());
		}
		return deq;
	}

	@Override
	public void display() {
		while(!isEmpty()) {
			st2.push(st1.pop());
		}
		System.out.print("[");
		while(!st2.isEmpty()) {
			E obj = st2.pop();
			System.out.print(obj+" ");
			st1.push(obj);
		}
		System.out.println("]");
	}
	
}
