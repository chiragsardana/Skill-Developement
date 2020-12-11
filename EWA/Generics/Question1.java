package Generics;
/*
 * Write a generic program to count the number of elements in a collection that have a specific
property (for example, odd integers, palindromes, prime numbers).
Definition of Done
i. Take any collection (List, Set, Map etc.) to store integer elements
ii. Implement any method to count odd integers/palindromes/prime numbers
iii. Finally show the counted result
 */
import java.util.ArrayList;
import java.util.List;

public class Question1 {
	public static <E extends Number> Integer countOdd(List<E> list) {//Chirag19CSU071
		Integer count = 0;
		for(E ele : list) {
			if(checkOdd(ele)) {
				count++;
			}
		}
		//System.out.println("The Value of count in the Method is "+count);
		return count;
		
	}
	public static<E> boolean checkOdd(E element) {
		if((Integer)element % 2 != 0)
			return true;
		return false;
	}
	public static<E extends Number> Integer countPrime(List<E> list) {
		Integer count = 0 ;
		for(E ele : list) {
			if(isPrime(ele)) {
				count++;
			}
		}
		return count;
	}
	public static<E> boolean isPrime(E ele) {
		Integer element= (Integer)ele;
		// Corner case 
        if (element <= 1) 
            return false; 
  
        // Check from 2 to n-1 
        for (int i = 2; i < element; i++) 
            if (element % i == 0) 
                return false; 
  
        return true;
	}
	public static<E extends Object> boolean isPalindrome(List<E> list) {
		Integer sizeList = list.size();
		for(int i = 0;i < sizeList / 2;i++) {
			if(!list.get(i).equals(list.get(sizeList-i-1))) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		List<String> list1 = new ArrayList<String>();
		
		list1.add(new String("This"));
		list1.add(new String("is"));
		list1.add(new String("This"));
		

		System.out.println("The Number of Odd Elements : "+countOdd(list));
		
		System.out.println("The Number Prime Number : "+countPrime(list));
		
		System.out.println("The List is Palindrome : "+isPalindrome(list));
		
		System.out.println("The List of String is Palindrome : "+isPalindrome(list1));
	}
}
