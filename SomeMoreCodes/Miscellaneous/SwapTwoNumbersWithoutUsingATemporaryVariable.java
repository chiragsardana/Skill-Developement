package Miscellaneous;

public class SwapTwoNumbersWithoutUsingATemporaryVariable {
	public static void main(String[] args) {
		Integer x = 5;
		Integer y = 5;
		System.out.println("The Value of x: "+x);
		System.out.println("The Value of y: "+y);
		x = x ^ y;//Addition occurs here of the x and y
//		System.out.println("The Testing Value of X is : "+x);
		y = x ^ y;//HEre we get the replaced value of y as substraction 
					//is done from total
		
		x = x ^ y;//now we get the swapped x 
		System.out.println("Now the Value of X and Y is ");
		System.out.println("The Value of x: "+x);
		System.out.println("The Value of y: "+y);
	}
}
