package Generics;
/*
 * Let's say you have an integer array and a string array. You have to write a single method
printArray that can print all the elements of both arrays. The method should be able to accept
both integer arrays or string arrays.
Complete the code so that it prints the following lines:
1
2
3
Hello
World
Do not use method overloading because your answer will not be accepted.
Definition of Done:
i. Program should take array elements as the user input
ii. Display the resultant array
 */
import java.util.Scanner;

public class Question4 {
	public static Scanner input = new Scanner(System.in);
	public static <E extends Object> void printArray(E[] arr) {
		for(E element : arr) {
			System.out.println(element+" ");
		}
	}
	public static void main(String[] args) {
		System.out.print("Enter the Size of Integer Array : ");
		int sizeIntegerArray = input.nextInt();
		Integer arr[] = new Integer[sizeIntegerArray];
		for(int i=0;i<sizeIntegerArray;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("\nEnter the Size of String Array : ");
		int sizeStringArray = input.nextInt();
		String[] arr1 = new String[sizeStringArray];
		for(int i=0;i<sizeStringArray;i++) {
			arr1[i]=input.next();
		}
		
//		System.out.println("The Integer Array is ");
		System.out.println("The Combined Array is ");
		printArray(arr);
//		System.out.println("The String Array is ");
		printArray(arr1);
		
	}
}
