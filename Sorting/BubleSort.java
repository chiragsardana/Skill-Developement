package Sorting;

public class BubleSort {
	static void sort(int[] arr) {
		int n = arr.length;
		for(int i = 0;i < n-1 ;i++) {
			boolean checkSwapping = false;
			for(int j = 0;j < n-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					checkSwapping = true;
				}
			}
			if(checkSwapping != true ) {		//Chirag Sardana
//				System.out.println("\n"+i);
				return;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,42,6,7,45,75};
		System.out.print("The Array is look like : ");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		sort(arr);
		System.out.print("\nThe Sorted Array Be looks like : ");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
