package Heaps;

public class BuildMinHeap {
	public static void main(String[] args) {

		Integer arr[] = { 17, 15, 8 , 9 , 10, 13, 6, 4, 5, 3, 1 } ;
		// Binary Tree Representation
        // of input array
        //              17
        //           /      \
        //         15        8
        //       /   \     /  \
        //      9     10   13  6
        //     / \    / \
        //    4   5  3   1
		buildMinHeap(arr);
		printHeap(arr);
	}
	public static void buildMinHeap(Integer[] arr) {
		Integer startIndex = arr.length / 2;
		for(Integer i = startIndex; i >= 0 ;i--) {
			heapify(arr, i);
		}
	}
	public static void heapify(Integer[] arr, Integer i) {
		Integer parent = i;
		Integer leftChild = 2 * i + 1;
		Integer rightChild = 2 * i + 2;
		
		if(leftChild < arr.length && arr[parent] > arr[leftChild]) {
			parent = leftChild;
		}
		if(rightChild  < arr.length && arr[parent] > arr[rightChild]) {
			parent = rightChild;
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
	public static void printHeap(Integer arr[]){
		
        System.out.print("Array representation of Min Heap is: ");
  
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
  
        System.out.println();
    }
}
