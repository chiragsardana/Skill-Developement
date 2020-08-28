/*Write a program to copy content of LinkedHashSet elements to an array object.*/
import java.util.LinkedHashSet;
public class Q8
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> linkedhset1=new LinkedHashSet<>();;
		linkedhset1.add(0);
		linkedhset1.add(1);
		linkedhset1.add(2);
		linkedhset1.add(3);
		linkedhset1.add(4);
		linkedhset1.add(5);
		int arr[] =new int[linkedhset1.size()];
		int i=0;
		for(int value  : linkedhset1)
		{
			arr[i]=value;
			i++;
		}
		int n=i;
		System.out.print("The Array is  : ");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}