package pranjal.lab4;

public class CD extends MediaItem {

	private String artist;
	private String genre;

	public CD(int id, String title, int copies, int runtime, String artist, String genre) {
		super(id, title, copies, runtime);

		this.artist = artist;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "CD [artist=" + artist + ", genre=" + genre + ", getRuntime()=" + getRuntime() + ", getId()=" + getId()
				+ ", getTitle()=" + getTitle() + ", getCopies()=" + getCopies() + "]";
	}

}
