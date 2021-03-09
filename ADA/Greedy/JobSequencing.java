package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Number of Jobs: ");
		Integer N = Integer.parseInt(input.readLine());
		ArrayList<ObjectJobSequencing> list = new ArrayList<>();
		Integer maxDeadline = 0;
		for(Integer i = 0;i < N;i++) {
			System.out.print("Enter the JobId: ");
			Character c = input.readLine().charAt(0);
			System.out.print("Enter the Profit: ");
			Integer profit = Integer.parseInt(input.readLine());
			System.out.print("Enter the DeadLine: ");
			Integer deadline = Integer.parseInt(input.readLine());
			list.add(new ObjectJobSequencing(c, deadline, profit));
			if(deadline > maxDeadline) {
				maxDeadline = deadline;
			}
		}
		Collections.sort(list, new ComparatorObjectJobSequencing());
		Boolean[] toCheck = new Boolean[maxDeadline];
		for(Integer i = 0;i < maxDeadline;i++) {
			toCheck[i] = false;
		}
		Character[] answer = new Character[maxDeadline];
		for(Integer i = 0;i < N;i++) {
			for(Integer j = Math.min(maxDeadline - 1, list.get(i).getDeadline() - 1);j >= 0 ;j--) {
				if(toCheck[j] == false) {
					toCheck[j] = true;
					answer[j] = list.get(i).getC();
					break;
				}
			}
		}
		System.out.print("The Maximum Profit for Job Sequencing: ");
		for(Integer i = 0; i < answer.length;i++) {
			if(answer[i] != null) {
				System.out.print(answer[i]+" ");
			}
		}
//		System.out.println("\n"+list);
	}
}
//Enter the Number of Jobs: 5
//Enter the JobId: a
//Enter the Profit: 100
//Enter the DeadLine: 2
//Enter the JobId: b
//Enter the Profit: 19
//Enter the DeadLine: 1
//Enter the JobId: c
//Enter the Profit: 27
//Enter the DeadLine: 2
//Enter the JobId: d
//Enter the Profit: 15
//Enter the DeadLine: 1
//Enter the JobId: e
//Enter the Profit: 15
//Enter the DeadLine: 3
//The Maximum Profit for Job Sequencing: c a e 
