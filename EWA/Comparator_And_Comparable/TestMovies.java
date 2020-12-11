package Comparator_And_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMovies {

	public static void main(String[] args) {
		List<MovieRanking> movies = new ArrayList<>();
		movies.add(new MovieRanking("GodFather", 9, 90));
		movies.add(new MovieRanking("EndGame", 8, 85));
		movies.add(new MovieRanking("Star Wars", 7, 78));
		movies.add(new MovieRanking("Inception", 8, 50));
		movies.add(new MovieRanking("Interstellar", 10, 99));
		
		
//		System.out.println(new MovieRanking("Sardana", 10, 100));
		
		System.out.println(movies);
		
		CompareMovieName name = new CompareMovieName();
		CompareUserRating rating = new CompareUserRating();
		CompareCriticsScore score = new CompareCriticsScore();
		Collections.sort(movies, name);//It Internally calls compare() method
		Collections.sort(movies, rating);
		Collections.sort(movies, score);
		System.out.println("The List after Sort "+movies);
	}

}
