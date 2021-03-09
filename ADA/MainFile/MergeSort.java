package MainFile;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Merge Sort
		int arr4[] = new int[100];
		for(int i = 0;i < 100;i++) {
			arr4[i] = i;
		}
		System.out.println("The array before Merge Sort : ");
		printArray(arr4);
		
		Long startTime = System.nanoTime();
		
		mergeSort(arr4, 0, arr4.length - 1);
		
		Long endTime = System.nanoTime();
		
		Long duration = (endTime - startTime);
		
		System.out.println("Time Taken to Sort Accending Order : "+duration+" nanoseconds");
		
		System.out.println("The array after Merge Sort : ");
		printArray(arr4);
		
//		int[] arr5 = new int[100];
		for(Integer i = 0;i < 100;i++) {
			arr4[i] = (int)(Math.random()*1000);
		}
		
		System.out.println("The array before Merge Sort : ");
		printArray(arr4);
		
		startTime = System.nanoTime();
		
		mergeSort(arr4, 0, arr4.length - 1);
		
		endTime = System.nanoTime();
		
		duration = (endTime - startTime);
		
		System.out.println("Time Taken to Sort Random Array : "+duration+" nanoseconds");
		
		System.out.println("The array after Merge Sort : ");
		printArray(arr4);

//		int[] arr6 = new int['
		for(Integer i = 100-1;i >= 0;i--) {
			arr4[i] = i;
		}
		
		System.out.println("The array before Merge Sort : ");
		printArray(arr4);
		
		startTime = System.nanoTime();
		
		mergeSort(arr4, 0, arr4.length - 1);
		
		endTime = System.nanoTime();
		
		duration = (endTime - startTime);
		
		System.out.println("Time Taken to Sort Descending Order Array: "+duration+" nanoseconds");
		
		System.out.println("The array after Merge Sort : ");
		printArray(arr4);
		
//		
	}
	public static void printArray(int arr[]) 	//Chirag19CSU071
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
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
