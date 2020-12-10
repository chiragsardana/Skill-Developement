package Sorting;

public class SelectionSort {
	
	static void sort(int arr[]) {
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
	static void printArray(int arr[]) 	//Chirag19CSU071
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,43,45,75,11,9,32};
		System.out.print("The Array : ");
		printArray(arr);
		sort(arr);
		System.out.print("The Sorted Array : ");
		printArray(arr);
	}

}
