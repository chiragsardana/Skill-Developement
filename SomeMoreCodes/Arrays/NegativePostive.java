package Arrays;

public class NegativePostive {
	public static void main(String[] args) {
		Integer[] arr= { -12, 11, -13, -5,
            6, -7, 5, -3, 11 };
		printArray(arr);
		negativePositive(arr);
		printArray(arr);
	}
	public static void negativePositive(Integer[] arr) {
		Integer left = 0;
		Integer right = arr.length - 1;
		while(left <= right) {
			if(arr[left] < 0 && arr[right] < 0) {
				left++;
			}
			if(arr[left] < 0 && arr[right] > 0) {
				right--;
			}
			if(arr[left] > 0 && arr[right] < 0 ) {
				arr[left] = arr[left] ^ arr[right];
				arr[right] = arr[right] ^ arr[left];
				arr[left] = arr[left] ^ arr[right];
				left++;
				right--;
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
