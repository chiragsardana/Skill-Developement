package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Knapsack {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Size: ");
		Integer N = Integer.parseInt(input.readLine());
		List<ObjectKnapsack> list = new ArrayList<ObjectKnapsack>(N);
		for(Integer i = 0;i < N;i++) {
			System.out.print("Enter the Weight: ");
			Integer weight = Integer.parseInt(input.readLine());
			System.out.print("Enter the Profit: ");
			Integer profit = Integer.parseInt(input.readLine());
//			System.out.println(i);
			Double ratio = (double)profit/(double)weight;
			list.add(new ObjectKnapsack(profit,weight,ratio));
		}
		Collections.sort(list, new ComparatorObjectKnapsack());
		Collections.reverse(list);
		System.out.println(list);
		System.out.print("Enter the Capacity: ");
		Integer Capacity = Integer.parseInt(input.readLine());
		System.out.print("The Selection Based Ratio: ");
		Double maxProfit = 0.0;
		ArrayList<Integer> answer = new ArrayList<>();
		for(Integer i = 0; i < N;i++) {
			if(Capacity >= list.get(i).getWeight()) {
				Capacity = Capacity -  list.get(i).getWeight();
				maxProfit += list.get(i).getValue();
//				System.out.println(list.get(i).getValue());
				System.out.print("1.0 ");
			}else {
				Double ratio = (double)Capacity/(double)list.get(i).getWeight();
//				System.out.println(list.get(i).getValue() * ratio);
				maxProfit += list.get(i).getValue() * ratio;
				Capacity = (int) (Capacity - (list.get(i).getWeight() * ratio));
				System.out.print(String.format("%.1f", ratio)+" ");
			}
		}
		System.out.println("\nThe Maximum Profit is: "+maxProfit);
	}

}
//int weight[] = {5,10,15,22,25};
//int profit[] = {30,40,45,77,90};