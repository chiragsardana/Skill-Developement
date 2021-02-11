package Sorting;

import java.util.ArrayList;

public class SortingTechniques {
	
	static Integer countReccursive;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
////		Selection Sort
//		int arr[] = {12,43,45,75,11,9,32};
//		System.out.println("The array before Selection Sort : ");
//		printArray(arr);
//		selectionSort(arr);
//		System.out.println("The array after Selection Sort : ");
//		printArray(arr);
//		
////		Insertion Sort 
//		int arr1[] = {12,43,45,75,11,9,32};
//		System.out.println("The array before Insertion Sort : ");
//		printArray(arr1);
//		insertionSort(arr1);
//		System.out.println("The array after Insertion Sort : ");
//		printArray(arr1);
//		
////		Bubble Sort
//		int arr2[] = {12,43,45,75,11,9,32};
//		System.out.println("The array before Bubble Sort : ");
//		printArray(arr2);
//		bubbleSort(arr2);
//		System.out.println("The array after Bubble Sort : ");
//		printArray(arr2);
//
//		Quick Sort		
//		int arr3[] = {12,43,45,75,11,9,32,66,44,24};
//		System.out.println("The array before Quick Sort : ");
//		printArray(arr3);
//		quickSort(arr3, 0, arr3.length - 1);
//		System.out.println("The array after Quick Sort : ");
//		printArray(arr3);
		
		countReccursive = 0;
		int arr3[] = new int[1000];
		System.out.println("Ascending Order.");
		for(Integer i = 0;i < 1000;i++) {
			arr3[i] = i;
		}
		System.out.println("The array before Quick Sort : ");
		printArray(arr3);
		Long startTime = System.nanoTime();
		quickSort(arr3, 0, arr3.length - 1);
		Long endTime = System.nanoTime();
		Long duration = (endTime - startTime);
		System.out.println("The array after Quick Sort : ");
		printArray(arr3);
		System.out.println("Execution Time : "+duration);
		System.out.println("No. of Time Reccursive Call Made : "+countReccursive);
		countReccursive = 0;
		System.out.println("\nDescending Order.");
		for(int i = arr3.length - 1, j = 0;i >= 0;i--,j++) {
//			System.out.println(i);
			arr3[j] = i;
		}
		System.out.println("The array before Quick Sort : ");
		printArray(arr3);
		startTime = System.nanoTime();
		quickSort(arr3, 0, arr3.length - 1);
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("The array after Quick Sort : ");
		printArray(arr3);
		System.out.println("Execution Time : "+duration);
		System.out.println("No. of Time Reccursive Call Made : "+countReccursive);
		
		
		countReccursive = 0;
		System.out.println("\nRandom Order.");
		for(Integer i = 0;i < 1000;i++) {
			arr3[i] = (int)(Math.random()*1000000);
		}
		System.out.println("The array before Quick Sort : ");
		printArray(arr3);
		startTime = System.nanoTime();
		quickSort(arr3, 0, arr3.length - 1);
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("The array after Quick Sort : ");
		printArray(arr3);
		System.out.println("Execution Time : "+duration);
		System.out.println("No. of Time Reccursive Call Made : "+countReccursive);
		
		countReccursive = 0;
		System.out.println("\nSame Elements.");
		for(Integer i = 0;i < 1000;i++) {
			arr3[i] = 71;
		}
		System.out.println("The array before Quick Sort : ");
		printArray(arr3);
		startTime = System.nanoTime();
		quickSort(arr3, 0, arr3.length - 1);
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("The array after Quick Sort : ");
		printArray(arr3);
		System.out.println("Execution Time : "+duration);
		System.out.println("No. of Time Reccursive Call Made : "+countReccursive);
		
//		Merge Sort
//		int arr4[] = new int[100];
//		for(int i = 0;i < 100;i++) {
//			arr4[i] = i;
//		}
//		System.out.println("The array before Merge Sort : ");
//		printArray(arr4);
//		
//		Long startTime = System.nanoTime();
//		
//		mergeSort(arr4, 0, arr4.length - 1);
//		
//		Long endTime = System.nanoTime();
//		
//		Long duration = (endTime - startTime);
//		
//		System.out.println("Time Taken to Sort Accending Order : "+duration+" nanoseconds");
//		
//		System.out.println("The array after Merge Sort : ");
//		printArray(arr4);
//		
////		int[] arr5 = new int[100];
//		for(Integer i = 0;i < 100;i++) {
//			arr4[i] = (int)(Math.random()*1000);
//		}
//		
//		System.out.println("The array before Merge Sort : ");
//		printArray(arr4);
//		
//		startTime = System.nanoTime();
//		
//		mergeSort(arr4, 0, arr4.length - 1);
//		
//		endTime = System.nanoTime();
//		
//		duration = (endTime - startTime);
//		
//		System.out.println("Time Taken to Sort Random Array : "+duration+" nanoseconds");
//		
//		System.out.println("The array after Merge Sort : ");
//		printArray(arr4);
//
////		int[] arr6 = new int['
//		for(Integer i = 100-1;i >= 0;i--) {
//			arr4[i] = i;
//		}
//		
//		System.out.println("The array before Merge Sort : ");
//		printArray(arr4);
//		
//		startTime = System.nanoTime();
//		
//		mergeSort(arr4, 0, arr4.length - 1);
//		
//		endTime = System.nanoTime();
//		
//		duration = (endTime - startTime);
//		
//		System.out.println("Time Taken to Sort Descending Order Array: "+duration+" nanoseconds");
//		
//		System.out.println("The array after Merge Sort : ");
//		printArray(arr4);
//		
//		
	}
	public static void printArray(int arr[]) 	//Chirag19CSU071
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    }
	public static void selectionSort(int[] arr) {
		//arr.length - 1 is because last element
		//is automatically sorted
		for(int i = 0;i < arr.length - 1;i++) {
			int minIndex = i;
			int minValue = Integer.MAX_VALUE;
			for(int j = 0+i;j < arr.length;j++) {
				if(arr[j] < minValue) {
					minValue = arr[j];
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
	}
	public static void insertionSort(int[] arr) {
//		12 43 45 75 11 9 32
		for(int i = 0;i < arr.length;i++) {
			int key = arr[i];//12 43
			
			int j = i-1;//-1 0
			while(j>=0 && key < arr[j]) {//12 < 43
				arr[j+1] = arr[j];//
				j--;
			}
			arr[j+1] = key;//12  43 ans so on...
		}
	}
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i = 0;i < n-1 ;i++) {
//			12 43 45 75 11 9 32
//			It compare's alternate elements
			boolean checkSwapping = false;
//			if in any case no swapping is required we break the outer loop
//			as array is already sorted.
			for(int j = 0;j < n-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					checkSwapping = true;
				}
			}
			if(checkSwapping != true ) {
//				System.out.println("\n"+i);
				return;
			}
		}
	}
	public static void quickSort(int[] arr,int l, int h) {
//		12 43 45 75 11 9 32
		if(h > l) {
			int loc = partition(arr,l,h);
			
			quickSort(arr,l,loc-1);
			quickSort(arr ,loc+1,h);
			
		}
		countReccursive++;
	}
	static int partition(int arr[], int l, int h) {
		int i = l + 1;
	    int pivot = arr[l];//make the first element as pivot element.
	    for(int j =l+ 1; j <= h ; j++ )  {
	    /*rearrange the array by putting elements which are less than pivot
	       on one side and which are greater that on other. */

	          if ( arr[ j ] < pivot) {
	        	  int temp = arr[i];
	        	  arr[i] = arr[j];
	        	  arr[j] = temp;
	        	  i++;
	        }
	   }
//	    int temp = arr[l]; As it Already saved 
	    arr[l] = arr[i-1];
	    arr[i-1] = pivot;//put the pivot element in its proper place.
	   return i-1;//return the position of the pivot
	}
	
	public static void mergeSort(int arr[],int l,int h) {
		if(h > l) {
			//Find the middle element
			int mid = (l+h)/2;
			
			//Sort the first halve and second halve
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,h);
			
			//Merge two sorted halves		
			merge(arr,l,mid,h);
		}
	}
	static void merge(int arr[],int l, int mid, int h) {
		// Find sizes of two subarrays to be merged
        int n1 = mid - l + 1;
        int n2 = h - mid;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];   
        for (int j = 0 ; j < n2; ++j)
            R[j] = arr[mid + 1 + j];
 
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
	}

}
