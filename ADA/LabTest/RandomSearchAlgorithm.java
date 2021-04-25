package LabTest;

import java.util.Arrays;
import java.util.Random;

//Write a random search algorithm to search a key in an integer array 
//by hitting an index of the
//array randomly. Calculate number of attempts to search the key in 
//the array.

public class RandomSearchAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {1, 2, 3, 4, 5};
		Integer k = 3;
		System.out.println(randomSearch(arr, k));
	}
	public static Integer randomSearch(Integer[] arr, Integer key) {
		
		Integer size = arr.length;
		Boolean[] visited = new Boolean[size];
		Arrays.fill(visited, false);
		Random random = new Random();
		Integer index;
		Integer counter = 0;
		
		
		for(Integer i = 1;i <= size;i++) {
			
			index = random.ints(0, size).findFirst().getAsInt();
			
			while(visited[index] == true) {
				index = random.ints(0, size).findFirst().getAsInt();
			}
			counter++;
			visited[index] = true;
//			System.out.println(index);
			if(key == arr[index]) {
				break;
			}
		}
		return counter;
	}

}
