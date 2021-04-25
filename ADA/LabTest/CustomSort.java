package LabTest;

//In an array, each cell contains any of the five type of element
//{45, 76, 187, 231, 512}. Write a
//function to sort the array. Your algorithm should be of the 
//order of Ο(n).
public class CustomSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {187,45,187,231};
		printArray(arr);
		printArray(sort(arr));
	}
	public static void printArray(Integer[] arr) {
		System.out.print("The Array is: ");
		for(Integer i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static Integer[] sort(Integer[] arr) {
		Integer counter1 = 0;//Counter for 45
		Integer counter2 = 0;//Counter for 76
		Integer counter3 = 0;//Counter for 187
		Integer counter4 = 0;//Counter for 237
		Integer counter5 = 0;//Counter for 512
		for(Integer i = 0;i < arr.length;i++) {
			if(arr[i] == 45) {
				counter1++;
			}else if(arr[i] == 76) {
				counter2++;
			}else if(arr[i] == 187) {
				counter3++;
			}else if(arr[i] == 231) {
				counter4++;
			}else if(arr[i] == 512) {
				counter5++;
			}
		}
		System.out.println("\n"+counter1+" "+counter2+" "+ counter3+""
				+ " "+counter4+" "+counter5);
		Integer i = 0;
		for(;i < counter1;i++) {
			arr[i] = 45;
//			System.out.println("testing1");
		}
		for(;i < counter1+ counter2;i++) {
			arr[i] = 76;
//			System.out.println("testing2");
		}
		for(;i < counter1+ counter2+ counter3;i++) {
			arr[i] = 187;
//			System.out.println("testing3");
		}
		for(;i < counter1+ counter2+ counter3+counter4;i++) {
			arr[i] = 231;
//			System.out.println("testing4");
		}
		for(;i < counter1+ counter2+ counter3+counter4+counter5;i++) {
			arr[i] = 512;
//			System.out.println("testing5");
		}
		return arr;
	}

}
