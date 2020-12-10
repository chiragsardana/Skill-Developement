package Sorting;

public class InsertionSort {
	
	static void sort(int arr[]) {
		for(int i = 0;i < arr.length;i++) {
			int key = arr[i];
			
			int j = i-1;
			while(j>=0 && key < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    }
	public static void main(String[] args) {		//Chirag19CSU071
		// TODO Auto-generated method stub
		int arr[] = {12,43,45,75,11,9,32};
		System.out.print("The Array : ");
		printArray(arr);
		sort(arr);
		System.out.print("The Sorted Array : ");
		printArray(arr);
	}

}
