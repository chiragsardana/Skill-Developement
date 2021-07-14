package Heaps;

public class BuildMaxHeap {
	public static void main(String[] args) {
//		Integer arr[] = { 1, 3, 5, 4, 6, 13, 10,
//                9, 8, 15, 17 };
		Integer arr[]  = { 2,3,4,5,6,7,8,9,10 };
		// Binary Tree Representation
        // of input array
        //              1
        //           /     \
        //         3        5
        //       /   \     /  \
        //      4     6   13  10
        //     / \    / \
        //    9   8  15 17
		buildMaxHeap(arr);
		printHeap(arr, arr.length);
		
	}
	public static void buildMaxHeap(Integer arr[]) {
		Integer startIndex = arr.length / 2 - 1;
		for(Integer i = startIndex; i >= 0; i--) {
			heapify(arr, i);
		}
	}
	public static void heapify(Integer arr[], Integer i) {
		Integer parent = i; // Parent Node Index
		Integer left = 2 * i + 1;// Left Child Node Index
		Integer right = 2 * i + 2; // Right Child Node Index
		
		
		if(left < arr.length && arr[left] > arr[parent]) {
			parent = left;
		}
		if(right < arr.length &&  arr[right] > arr[parent] ) {
			parent = right;
		}
		
		if(parent != i) {
			//Swapping Done without Extra Space or Temporary Variable
			arr[parent] = arr[parent] ^ arr[i];
			arr[i] = arr[parent] ^ arr[i];
			arr[parent] = arr[parent] ^ arr[i];
			
			// Recursively heapify the affected sub-tree
			heapify(arr, parent);
		}
	}
	public static void printHeap(Integer arr[], int n){
		
        System.out.println("Array representation of Max Heap is:");
  
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
  
        System.out.println();
    }
}
