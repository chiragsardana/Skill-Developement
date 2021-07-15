package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class UnionIntersection {
	public static void main(String[] args) {
		Integer[] arr1 = { 7, 1, 5, 2, 3, 6 };
		Integer[] arr2 = { 3, 8, 6, 20, 7 };
		HashMap<Integer, Integer> union = new HashMap<>();
		union(arr1, arr2, union);
		System.out.println("The Union of Two Arrays: "+union);
		System.out.print("The Intersection of Two Arrays: ");
		HashSet<Integer> intersectionHelper = new HashSet<>();
 		intersection(arr1, arr2, intersectionHelper);
	}
	public static void intersection(Integer[] arr1, Integer[] arr2, HashSet<Integer> intersectionHelper) {
		for(Integer i = 0; i < arr1.length;i++) {
			intersectionHelper.add(arr1[i]);
		}
		intersectionHelper(arr2, intersectionHelper);
	}
	public static void intersectionHelper(Integer[] arr, HashSet<Integer> intersectionHelper) {
		for(Integer i = 0; i < arr.length;i++) {
			if(intersectionHelper.contains(arr[i])) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	public static void union(Integer[] arr1, Integer arr2[], HashMap<Integer, Integer> union) {
		unionHelper(arr1, union);
		unionHelper(arr2, union);
	}
	public static void unionHelper(Integer[] arr, HashMap<Integer, Integer> union) {
		for(Integer i = 0;i < arr.length;i++) {
				union.put(arr[i], i);
		}
	}
}
