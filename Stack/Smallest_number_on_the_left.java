package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Smallest_number_on_the_left {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number of Test Cases : ");
		int t = input.nextInt();
		while(t-->0){
			System.out.print("Enter the Size of Array : ");
		    int n = input.nextInt();
		    int arr[] = new int[n];
		    Stack<Integer> st = new Stack<>();
		    for(int i = 0;i<n;i++){
		        int num = input.nextInt();
		        if(st.isEmpty()){
		            System.out.print(-1+" ");
		        }else {
		            while(!st.isEmpty()){
		                if(num > st.peek()){
		                    System.out.print(st.peek()+" ");
		                    break;
		                }else{
		                    st.pop();
		                }
		                if(st.isEmpty()){
		                    System.out.print("-1 ");
		                }
		            }
		        }
		        st.push(num);
		        
		    }
		    
		    System.out.println();
		}
	}

}
