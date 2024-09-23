package pranjal.lab4;


public class JournalPaper extends WrittenItem {
	
	private int yearPublished;

	public JournalPaper(int id, String title, int copies, String author, int yearPublished) {
		super(id, title, copies, author);
		this.yearPublished = yearPublished;
		
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	@Override
	public String toString() {
		return "JournalPaper [yearPublished=" + yearPublished + ", getYearPublished()=" + getYearPublished()
				+ ", getAuthor()=" + getAuthor() +  ", getId()=" + getId()
				+ ", getTitle()=" + getTitle() + ", getCopies()=" + getCopies() +"]";
	}
}
