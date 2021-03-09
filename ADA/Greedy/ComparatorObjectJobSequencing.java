package Greedy;

import java.util.Comparator;

public class ComparatorObjectJobSequencing implements Comparator<ObjectJobSequencing>{

	@Override
	public int compare(ObjectJobSequencing o1, ObjectJobSequencing o2) {
		// TODO Auto-generated method stub
		return o2.getProfit().compareTo(o1.getProfit());
	}
	
	
}
