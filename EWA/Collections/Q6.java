/*
Implement a to do list. Tasks have a priority between 1 and 9, and a description.  
When the user enters the command add priority description, the program adds a new task. 
When the user enters next, the program removes and prints the most urgent task. 
The quit command quits the program. Use a priority queue in your solution. (30 mins)
Definition of Done
Assign priorities b/w 1 to 9 to all the tasksTasks should be added and removed according to the user input
Finally display the resultant queue
*/
import java.util.*;
public class Q6
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		Queue<Task> pqueue=new PriorityQueue<>(10,new TaskComparator());
		Task t=new Task();//object of task;
		// pqueue.add(t.addTask("Dancing",5));
		// pqueue.add(t.addTask("Singing",4));
		// pqueue.add(t.addTask("Coding",3));
		// pqueue.add(t.addTask("Driving",2));
		// pqueue.add(t.addTask("Studying",1));
		// pqueue.add(t.addTask("Sardana",6));
		// pqueue.add(t.addTask("Web",7));
		// pqueue.add(t.addTask("Matching",8));
		// pqueue.add(t.addTask("Caring",9));
		// pqueue.add(t.addTask("Listening",0));
		int n=5;
		System.out.println("Enter the 5 Tasks one by 1");
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the Priority Number [1-5] : ");
			int priority=input.nextInt();
			System.out.print("Enter the Task : ");
			input.nextLine();
			String task=input.nextLine();
			pqueue.add(t.addTask(task,priority));
		}
		System.out.println("\nThe List Before Removing Any Priority : ");

		Iterator iterator = pqueue.iterator();

		while (iterator.hasNext()) 
		{ 
            System.out.println(iterator.next()+" ");
        }

		System.out.print("Enter the priority of the Task to Remove : ");
		int priorityRemove=input.nextInt();

		Stack<Task> st=new Stack<>();
		while (!pqueue.isEmpty()) 
		{ 
			st.push(pqueue.poll());

		}
		while(!st.empty())
		{
			Task kk=st.pop();
			if(kk.getPriority()==priorityRemove)
			{

			}
			else
			{
				pqueue.add(kk);
			}
		}
		iterator = pqueue.iterator();

		while (iterator.hasNext()) 
		{ 
            System.out.println(iterator.next()+" ");
        }

		
	}
	static class TaskComparator implements Comparator<Task>
	{ 
			
		// Overriding compare()method of Comparator 
		// for descending order of Priority
		public int compare(Task t1, Task t2) 
		{ 
			if (t1.priority > t2.priority) 
				return 1; 
			else if (t1.priority < t2.priority) 
				return -1; 
			return 0; 
		} 
	}
	public static class Task
	{
		public String task;
		public int priority;
		Task()
		{
			task="";
			priority=-1;
		}
		Task(String task,int priority)
		{
			this.task=task;
			this.priority=priority;
		}
		public String toString()
		{
			return(getPriority()+" "+getTask());
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