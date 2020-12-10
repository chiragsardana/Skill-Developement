package Sorting;

public class QuickSort {
	
	static void sort(int arr[], int l, int h) {
		if(h > l) {
			int loc = partition(arr,l,h);		//Chirag19CSU071
			
			sort(arr,l,loc-1);
			sort(arr ,loc+1,h);
		}	
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
	    int temp = arr[l];
	    arr[l] = arr[i-1];
	    arr[i-1] = temp;//put the pivot element in its proper place.
	   return i-1;//return the position of the pivot
	}
	static void printArray(int arr[]) 
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
		sort(arr,0,arr.length-1);
		System.out.print("The Sorted Array : ");
		printArray(arr);

	}

}
