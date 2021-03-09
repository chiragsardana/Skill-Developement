package Greedy;

import java.util.Comparator;

public class ActivitySelectionComparator implements Comparator<ObjectActivitySelection> {

	@Override
	public int compare(ObjectActivitySelection o1, ObjectActivitySelection o2) {
		// TODO Auto-generated method stub
		return o1.getEnd().compareTo(o2.getEnd());
	}

}
