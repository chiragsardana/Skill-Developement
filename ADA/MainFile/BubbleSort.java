package MainFile;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Bubble Sort
		int arr2[] = {12,43,45,75,11,9,32};
		System.out.println("The array before Bubble Sort : ");
		printArray(arr2);
		bubbleSort(arr2);
		System.out.println("The array after Bubble Sort : ");
		printArray(arr2);
	}
	public static void printArray(int arr[]) 	//Chirag19CSU071
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
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

}
