package Arrays;

import java.util.*;
public class CyclicRotateByOne {
	public static void main(String[] args) {
		Integer[] arr = {1, 2, 3, 4, 5};
		System.out.println("The Array is: "+Arrays.toString(arr));
		rotateTheArrayByOne(arr);
		System.out.println("The Array After One Rotation is: "+Arrays.toString(arr));
	}
	public static void rotateTheArrayByOne(Integer[] arr) {
		Integer left = 0;
		Integer right = arr.length - 1;
		while(left < right) {
			arr[left] = arr[left] ^ arr[right];
			arr[right] = arr[left] ^ arr[right];
			arr[left] = arr[left] ^ arr[right];
			left++;
		}
	}
}
