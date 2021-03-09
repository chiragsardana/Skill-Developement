package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ActivitySelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 int s[] =  {1, 3, 0, 5, 8, 5};
//		    int f[] =  {2, 4, 6, 7, 9, 9};
		List<ObjectActivitySelection> list = new ArrayList<>();
		list.add(new ObjectActivitySelection('a',1,2));
		list.add(new ObjectActivitySelection('a',3,4));
		list.add(new ObjectActivitySelection('a',0,6));
		list.add(new ObjectActivitySelection('a',5,7));
		list.add(new ObjectActivitySelection('a',8,9));
		list.add(new ObjectActivitySelection('a',5,9));
		Collections.sort(list,new ActivitySelectionComparator());
		System.out.println(list);
		activitySelection(list);
	}
	public static void activitySelection(List<ObjectActivitySelection> list) {
		System.out.print("The Activity Selected is: ");
		Integer i = 0;
		System.out.print(i+" ");
		for(Integer j = 1;j < list.size();j++) {
			if(list.get(j).getStart() >= list.get(i).getEnd()) {
				System.out.print(j+" ");
				i = j;
			}
		}
	}

}
