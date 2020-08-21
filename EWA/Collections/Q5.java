/*    
A homeowner rents out parking spaces in a driveway during special events. 
the driveway is a “last-in, first-out” stack. Of course, when a car owner retrieves 
a vehicle that wasn’t the last one in, the cars blocking it must temporarily move to 
the street so that the requested vehicle can leave. Write a program that models this behavior, 
using one stack for the driveway and one queue for the street. Use integers as license plate 
numbers to identify an individual car. (20 mins)

Definition of Done
i. The program uses one stack for “driveway” and one queue for “street and uses license plate numbers to represent individual cars
ii. The user inputs the car license number to retrieve a car
iii. Display the resultant driveway and street after every car moves out
*/
import java.util.*;
public class Q5
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		Stack<Integer> driveway=new Stack<>();
		Queue<Integer> street=new LinkedList<>();
		System.out.println("Enter the license plate of each car in the driveway One by 1 [10 Parking Space Available] ");
		while(driveway.size()<10)
		{
			driveway.push(input.nextInt());
		}
		System.out.print("Enter the car license number to retrieve a car : ");
		int carOwner=input.nextInt();
		System.out.println("The driveway and street before moving cars into the street");
		System.out.println("Driveway: " + driveway);
		System.out.println("Street: " + street);
		outer : 
		while(!driveway.empty())
		{
			if(driveway.peek()!=carOwner)
			{
				int head = driveway.pop();
				street.add(head); //takes the cars in the street and pushes them back into the driveway
			}
			else
			{
				int temp=driveway.pop();
				while(!street.isEmpty())
				{
					driveway.add(street.poll());
				}
				street.add(temp);
				break outer;
			}
		}
		System.out.println("\n");
		System.out.println("The driveway and street after moving cars back into the driveway ");
		System.out.println("Driveway: " + driveway);
		System.out.println("Street: " +street);
	}
}