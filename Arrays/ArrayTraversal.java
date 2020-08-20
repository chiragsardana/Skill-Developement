package Arrays;
public class ArrayTraversal
{
	public static void main(String[] args) 
	{
		int myArray[] = new int[7];
		myArray[0] = 1254;
		myArray[1] = 1458;
		myArray[2] = 5687;
		myArray[3] = 1457;
		myArray[4] = 4554;
		myArray[5] = 5445;
		myArray[6] = 7524;
		System.out.println("Contents of the array: ");
      	for(int i=0; i<myArray.length; i++) 
      	{
        	System.out.println(myArray[i]);
     	}

     	System.out.println("Contents of the array: ");
      	for (int element: myArray) 
      	{
        	System.out.println(element);
	    }

	}
}