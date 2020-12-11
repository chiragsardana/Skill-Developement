package Comparator_And_Comparable;


import java.util.Comparator;
public class CompareCriticsScore implements Comparator<MovieRanking>{
	
	@Override
	public int compare(MovieRanking o1, MovieRanking o2) {
		if(o1.getCritics_score() > o2.getCritics_score()) {
			return 1;
		}else if(o1.getCritics_score() < o2.getCritics_score()) {
			return -1;
		}
		return 0;
	}

}
