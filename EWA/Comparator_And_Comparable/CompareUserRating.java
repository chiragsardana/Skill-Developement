package Comparator_And_Comparable;

import java.util.Comparator;

public class CompareUserRating implements Comparator<MovieRanking>
{

	@Override
	public int compare(MovieRanking o1, MovieRanking o2) {
		// TODO Auto-generated method stub
		if(o1.getUser_rating() > o2.getUser_rating()) {
			return 1;
		}else if(o1.getUser_rating() < o2.getUser_rating()) {
			return -1;
		}
		return 0;
	}

}
