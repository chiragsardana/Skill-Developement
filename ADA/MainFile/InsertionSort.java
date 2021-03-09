package MainFile;

public class InsertionSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	Insertion Sort 
		int arr1[] = {12,43,45,75,11,9,32};
		System.out.println("The array before Insertion Sort : ");
		printArray(arr1);
		insertionSort(arr1);
		System.out.println("The array after Insertion Sort : ");
		printArray(arr1);
	}
	public static void printArray(int arr[]) 	//Chirag19CSU071
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
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
}
