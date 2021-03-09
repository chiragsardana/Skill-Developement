package MainFile;

public class QuickSort {

	static Integer countReccursive;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
	}
	public static void printArray(int arr[]) 	//Chirag19CSU071
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
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
	    for(int j =l+ 2; j <= h ; j++ )  {
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

}
