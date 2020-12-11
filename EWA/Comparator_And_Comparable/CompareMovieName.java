package Comparator_And_Comparable;

import java.util.Comparator;

public class CompareMovieName implements Comparator<MovieRanking>{

	@Override
	public int compare(MovieRanking o1, MovieRanking o2) {
		
		return o1.getMovie_name().compareTo(o2.getMovie_name());
	}

}
