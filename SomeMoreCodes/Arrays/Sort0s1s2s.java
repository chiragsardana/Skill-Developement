package Arrays;

public class Sort0s1s2s {
	public static void main(String[] args) {
		Integer arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		printArray(arr);
		sort0s1s2s(arr);
		printArray(arr);
	}
	public static void sort0s1s2s(Integer arr[]) {
		Integer low = 0;
		Integer mid = 0;
		Integer high = arr.length - 1;
		while(mid <= high) {
			if(arr[mid] == 0) {
				arr[mid] = arr[low];
				arr[low] = 0;
				low++;
				mid++;
			}else if(arr[mid] == 1) {
				mid++;
			}else if(arr[mid] == 2) {
				arr[mid] = arr[high];
				arr[high] = 2;
				high--;
			}
		}
	}
	public static void printArray(Integer[] arr) {
		System.out.print("The Array is: ");
		for(Integer i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
