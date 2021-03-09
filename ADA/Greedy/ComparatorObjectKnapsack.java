package Greedy;

import java.util.Comparator;

public class ComparatorObjectKnapsack  implements Comparator<ObjectKnapsack>{
	
	@Override
	public int compare(ObjectKnapsack o1, ObjectKnapsack o2) {
		// TODO Auto-generated method stub
		return o1.getRatio().compareTo(o2.getRatio()); 
	}
}
