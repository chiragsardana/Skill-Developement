//Write a program to check if the last two numbers 
//both are divisible by 5 in a linear queue.
package Queue;

public class LastTwoQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingNode<Integer> queue = new QueueUsingNode<>();
		
		queue.enqueue(new Integer(10));
		queue.enqueue(new Integer(20));
		queue.enqueue(new Integer(25)); //Chirag19CSU071
		queue.enqueue(new Integer(50));
		queue.enqueue(new Integer(65));
		
		System.out.print("The Queue is : ");
		queue.display();
		
		System.out.println("The Last Two is divisible by 5 : "+lastTwo(queue));
	}
	static boolean lastTwo(QueueUsingNode<Integer> queue) {
		int size = queue.size();
		boolean flag =  true;
		if(size <= 2) {
			while(!queue.isEmpty()) {
				if(queue.dequeue() % 5 != 0) {
					return false;
				}
			}
		}
		for(int i = 0;i < size - 2 ;i++) {
			queue.enqueue(queue.dequeue());
		}
		for(int i = 0;i < 2;i++) {
			int temp = queue.dequeue();
			if(temp % 5 !=0) {
				flag = false;
			}
			queue.enqueue(temp);
		}
		return flag;
	}

}
