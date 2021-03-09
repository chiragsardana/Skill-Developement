package MainFile;

import java.util.Random;

//Java program for implementation of Heap Sort
public class HeapSort {
	public void sort(int arr[])
	{
		int n = arr.length;
		//Just half is taken because in a binary tree there are half leaf nodes and half internal nodes
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);

		// Chirag19CSU071
		for (int i = n - 1; i > 0; i--) {
			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			heapify(arr, i, 0);
		}
	}

	void heapify(int arr[], int n, int i)
	{
		int largest = i; 
		int l = 2 * i + 1;
		int r = 2 * i + 2; 

		if (l < n && arr[l] > arr[largest])
			largest = l;

	
		if (r < n && arr[r] > arr[largest])
			largest = r;


		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

		
			heapify(arr, n, largest);
		}
	}

	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[])
	{
//		int arr[] = {12, 11, 13, 5, 6, 7 };
		int arr[] = new int[100];
		Random random = new Random();//To Generate Random Number
		for(int i =0 ;i < arr.length;i++) {
			arr[i] = new Random().nextInt(100);
		}
		int n = arr.length;
		System.out.print("Array Before Sorting : ");
		printArray(arr);
		HeapSort ob = new HeapSort();
		ob.sort(arr);

		System.out.print("Sorted array is : ");
		printArray(arr);
	}
}
