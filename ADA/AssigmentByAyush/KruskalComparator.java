package AssigmentByAyush;

import java.util.Comparator;

public class KruskalComparator implements Comparator<Edge>{

	@Override
	public int compare(Edge o1, Edge o2) {
		// TODO Auto-generated method stub
		return o1.getWeight().compareTo(o2.getWeight());
	}

}
