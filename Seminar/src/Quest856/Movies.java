package Quest856;

public class Movies {
	private Movie[] movies = new Movie[3];
	
	public boolean add(Movie movie) {
		for (int i=0; i<movies.length;i++) {
			if (movies[i]==null) {
				movies[i]=movie;
				return true;
			}
		}
		return false;
	}
	public Movie get(int index) {
		if (index<movies.length && index >= 0) {
			return movies[index];
		}
		return null;
	}
}
