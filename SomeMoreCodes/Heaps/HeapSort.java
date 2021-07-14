package Heaps;

public class HeapSort {
	public static void main(String[] args) {
		Integer arr[] = { 10, 9 , 8 , 7 , 6, 5, 4, 3, 2, 2};
		sort(arr);
		printArray(arr);
		
	}
	public static void printArray(Integer arr[]){
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	public static void sort(Integer arr[]) {
		//Make Max Heap First
		Integer nonLeafNodeIndex = arr.length / 2 - 1;
		for(Integer i = nonLeafNodeIndex;i >= 0;i--) {
			heapify(arr, arr.length, i);
		}
		
		for(Integer i = arr.length - 1;i > 0;i--) {
			//Swapping Done without Extra Space or Temporary Variable
			arr[0] = arr[0] ^ arr[i];
			arr[i] = arr[0] ^ arr[i];
			arr[0] = arr[0] ^ arr[i];
			
			heapify(arr, i, 0);
		}
	}
	public static void heapify(Integer[] arr, Integer n, Integer i) {
		Integer parentNodeIndex = i;
		Integer leftChildNodeIndex = 2 * i + 1;
		Integer rightChildNodeIndex = 2 * i + 2;
		
		if( leftChildNodeIndex < n && arr[leftChildNodeIndex] > arr[parentNodeIndex]) {
			parentNodeIndex = leftChildNodeIndex;
		}
		if( rightChildNodeIndex < n && arr[rightChildNodeIndex] > arr[parentNodeIndex]) {
			parentNodeIndex = rightChildNodeIndex;
		}
		if(parentNodeIndex != i) {
			//Swapping Done without Extra Space or Temporary Variable
			arr[parentNodeIndex] = arr[parentNodeIndex] ^ arr[i];
			arr[i] = arr[parentNodeIndex] ^ arr[i];
			arr[parentNodeIndex] = arr[parentNodeIndex] ^ arr[i];
			
			// Recursively heapify the affected sub-tree
			heapify(arr, n, parentNodeIndex);
		}
	}
}
