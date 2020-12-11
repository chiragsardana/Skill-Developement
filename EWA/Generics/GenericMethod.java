package Generics;

public class GenericMethod {
	public static<E, T extends E> boolean equalsArray(E[] x,T[] y){
		//it checks whether array are equal or not.
		if(x.length != y.length)
			return false;
		for(int i = 0;i < x.length ;i++)
		{
			if(x[i] != y[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5};
		Integer[] arr1 = {1,2,3,4,5};
		Integer[] arr2 = {1,2,3,4,1};
		
		if(equalsArray(arr,arr1))
			System.out.println("The Array 1 and Array 2 are equal.");
		
		if(equalsArray(arr1,arr2))
			System.out.println("The Array 2 and Array 3 are equal.");
		else
			System.out.println("Array 2 and Array 3 are not equal.");
	}

}
