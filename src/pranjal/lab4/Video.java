package pranjal.lab4;

public class Video extends MediaItem {

	private String director;
	private String genre;
	private int yearReleased;

	public Video(int id, String title, int copies, int runtime, String director, String genre, int yearReleased) {
		super(id, title, copies, runtime);
		this.director = director;
		this.genre = genre;
		this.yearReleased = yearReleased;

	}

	@Override
	public String toString() {
		return "Video [director=" + director + ", genre=" + genre + ", yearReleased=" + yearReleased + ", getRuntime()="
				+ getRuntime() + ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getCopies()=" + getCopies()
				+ "]";
	}

}
