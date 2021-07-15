package Arrays;

public class Segregate0s1s {
	public static void main(String[] args) {
		Integer arr[] = { 0 , 1, 0, 1, 0, 0, 1, 1, 1 ,0 };
		printArray(arr);
		segregate0s1s(arr);
		printArray(arr);
	}
	public static void printArray(Integer[] arr) {
		System.out.print("The Array is: ");
		for(Integer i = 0;i < arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	public static void segregate0s1s(Integer arr[]) {
		Integer left = 0;
		Integer right = arr.length - 1;
		while(left < right) {
			while(arr[left] == 0 && left < right) {
				left++;
			}
			while(arr[right] == 1 && left < right) {
				right--;
			}
			if(left < right) {
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			}
//			printArray(arr);
		}
	}
}
