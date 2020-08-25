/*
Use a two-dimensional array to solve the following problem: A company has four salespeople (1 to 4) 
who sell five different products (1 to 5). 
Once a day, each salesperson passes in a slip for each type of product sold. 
Each slip contains the following:
a) The salesperson number
b) The product number
c) The total dollar value of that product sold that day
Thus, each salesperson passes in between 0 and 5 sales slips per day. Assume that the information 
from all the slips for last month is available. Write an application that will read all this information 
for last week’s sales and summarize the total sales by salesperson and by product. 

Definition of Done:
    a) All totals should be stored in the two-dimensional array sales. 
    b) Results should be displayed in a tabular format, with each column representing a salesperson and 
    each row representing a particular product. 
    c) Cross-total of each row should get the total sales of each product for last week. 
    d) Cross-total of each column should get the total sales by the salesperson for last week. 
    The output should include these cross-totals to the right of the totalled rows and to the bottom of the totalled columns.
*/
package Arrays;
import java.util.*;
public class Q12
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		float arr[][]=new float[4][5];//given that four sales person and five different products...
		String str="0";
		while(!str.equals("-1"))
		{
			System.out.println("Enter the salesperson, product, and total sales : ");
			System.out.print("(Enter -1 for the salesperon to end input) (Separated by spaces) : ");
			str=input.nextLine();
			String temp[]=str.split(" ");
		}


	}
}