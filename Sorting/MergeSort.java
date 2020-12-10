package Sorting;

public class MergeSort {
	static void sort(int arr[],int l,int h) {
		if(h > l) {
			//Find the middle element
			int mid = (l+h)/2;
			
			//Sort the first halve and second halve
			sort(arr,l,mid);
			sort(arr,mid+1,h);
			
			//Merge two sorted halves		//CHirag19CSU071
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
        for (int j = 0; j < n2; ++j)
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
