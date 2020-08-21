/*
Implement a to do list. Tasks have a priority between 1 and 9, and a description.  
When the user enters the command add priority description, the program adds a new task. 
When the user enters next, the program removes and prints the most urgent task. 
The quit command quits the program. Use a priority queue in your solution. (30 mins)
Definition of Done
Assign priorities b/w 1 to 9 to all the tasksTasks should be added and removed according to the user input
Finally display the resultant queue
*/
import java.util.PriorityQueue;
public class Q6
{
	public static void main(String[] args) 
	{
		PriorityQueue<Task> pqueue=new PriorityQueue<Task>();
		Task t=new Task("str",9);//object of task;
		pqueue.add(t);
	}
	public static class Task
	{
		String task;
		int priority;
		Task()
		{

		}
		Task(String task,int priority)
		{
			this.task=task;
			this.priority=priority;
		}
		public String getTask()
		{
			return task;
		}
		public int getPriority()
		{
			return priority;
		}
		public void setTask(String task)
		{
			this.task=task;
		}
		public void setPriority(int priority)
		{
			this.priority=priority;
		}
		public Task addTask(String task,int priority)
		{
			Task temp=new Task(task,priority);
			return temp;
		}
	}
}