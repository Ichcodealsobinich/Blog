package Quest856;
import java.util.Arrays;

public class Movie {
	private String title = "";
	private String[] actors = {"", "", ""};
	
	public void setTitle(String name) {
		this.title=name;
	}
	public boolean setActors(String[] someActors) {
		if (someActors.length==actors.length) {
			actors = someActors;
			return true;
		}
		return false;
	}
	public String getTitle() {
		return title;
	}
	public String[] getActors() {
		return actors;
	}
	public Movie(String name, String[] actors) {
		this.title=name;
		this.actors=actors;
	}
	public String toString() {
		String ret = "In the movie " + this.title + ", the main actors are: ";
		for (String actor : actors) {
			ret = ret + actor + ", ";
		}
		ret = ret.trim();
		if (ret.endsWith(",")){
			ret = ret.substring(0, ret.length()-1);
		}
		return ret;
	}
}
