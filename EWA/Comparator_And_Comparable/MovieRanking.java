package Comparator_And_Comparable;

//Comparable
public class MovieRanking {
	private String movie_name;
	private int user_rating;
	private int critics_score;
	
	
	public MovieRanking(String movie_name, int user_rating, int critics_score) {
		this.movie_name = movie_name;
		this.user_rating = user_rating;
		this.critics_score = critics_score;
	}
	public int getUser_rating() {
		return user_rating;
	}
	public void setUser_rating(int user_rating) {
		this.user_rating = user_rating;
	}
	public int getCritics_score() {
		return critics_score;
	}
	public void setCritics_score(int critics_score) {
		this.critics_score = critics_score;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
//	@Override
//	public int compareTo(MovieRanking o) {
//		if(this.getUser_rating() < o.getUser_rating()) {
//			return -1;
//		}
//		else if(this.getUser_rating() > o.getUser_rating()) {
//			return 1;
//		}
//		return 0;
//		return this.getMovie_name().compareTo(o.getMovie_name());
//	}
	@Override
	public String toString() {
		String str = "Movie Name : "+this.getMovie_name()+" \n";
		str += "User Rating : "+this.getUser_rating()+"\n";
		str += "Critics Score : "+this.getCritics_score()+"\n";
		return str;
	}
	
}
