package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Delete_array_elements_which_are_smaller_than_next_or_become_smaller {
	//Delete arr[i] if arr[i+1] > arr[i]
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//  20 10 25 30 40	
		System.out.print("Enter the Number of Test Cases : ");
		int t = Integer.parseInt(reader.readLine());
		while(t-->0) {
			System.out.print("Enter the Size of Array : ");
			int size_of_array = Integer.parseInt(reader.readLine());
			Stack<Integer> st = new Stack<>();
			int arr[] = new int[size_of_array];
			System.out.println("Enter the Elements of Arrays One by 1");
			for(int i=0;i<size_of_array;i++) {
				arr[i] = Integer.parseInt(reader.readLine());
			}
//			for(int i=size_of_array - 1;i;i++) {
//				st.push(arr[i]);
//			}
			System.out.print("\nEnter the Number of Element to be deleted : ");
			int number_of_elements_to_be_deleted = Integer.parseInt(reader.readLine());;
			
			
//			System.out.println(number_of_elements_to_be_deleted);
			int i =0 ;
			for(;i < size_of_array && (number_of_elements_to_be_deleted != 0);) {
				if(st.isEmpty()) {
					st.push(arr[i]);
					i++;
				}else {
					if(arr[i] > st.peek()) {
						st.pop();
						number_of_elements_to_be_deleted--;
					}else {
						st.push(arr[i]);
						i++;
					}
				}
			}
			System.out.println("The value of i  is : "+i);
			
			while(i < size_of_array) {
				st.push(arr[i]);
				i++;
			}
			System.out.println("The Stack Look Like : "+st);
		}
	}

}
