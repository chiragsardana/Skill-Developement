/*
The Player class is provided to you. It has two fields: a name String and a score integer.

Given a list of ‘n’ Player objects, write a comparator that sorts them in order of decreasing score; 

if 2 or more players have the same score, sort those players alphabetically by name. 
To do this, you must create a Checker class that implements the Comparator interface, 
then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method. (40 mins)

Definition of Done:


	
Program should take input from the use, the first line will be the number of records
	The next n lines will take records as input in the form of name & score
	The output should display the entries in a sorted order (conditions applicable)


Sample Input:                                                  Sample Output:

5                                                                                  Jessie 203

Harry 150                                                                    Harry 150

Jessie 203                                                                    Amy 100

John 75                                                                       David 100

David 100                                                                    John 75

Amy 100
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class Q12
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Number of Players : ");
		int size=input.nextInt();

		ArrayList<Player> list=new ArrayList<>();
		System.out.println("Enter the Elements one By 1");
		for(int i=0;i<size;i++)
		{
			input.nextLine();
			System.out.print("Enter the Name of the Player : ");
			String name =input.nextLine();
			System.out.print("ENter the Score of the Player : ");
			int score = input.nextInt();

			list.add(new Player(name,score));
		}
		System.out.println("The original List : "+list);

		PlayerComparator player=new PlayerComparator();

		Collections.sort(list,player);
		// Collections.reverse();
		System.out.println("The Modified List : "+list);
	}
	static class Player
	{
		String Player_Name;
		Integer Score;
		public Player(String Player_Name,Integer Score)
		{
			this.Player_Name=Player_Name;
			this.Score=Score;
		}
		public String toString()
		{
			return(Player_Name+" "+Score);
		}
		public String getPlayer_name()
		{
			return Player_Name;
		}
	}
	static class PlayerComparator implements Comparator<Player>
	{ 
		@Override
		public int compare(Player p1, Player p2) 
		{ 
			if (p1.Score > p2.Score) 
				return -1; 
			else if (p1.Score < p2.Score) 
				return 1; 
			else
			{
				return p1.getPlayer_name().compareTo(p2.getPlayer_name());
				// if(Req==1)
				// 	return -1;
				// else if(Req==-1)
				// 	return 1;
				// else
				// 	return 0;
			}
		} 
	}
}