package pranjal.lab4;

public abstract class WrittenItem extends Item{
	
	private String author;

	public WrittenItem(int id, String title, int copies, String author) {
		super(id, title, copies);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "WrittenItem [author=" + author + ", getAuthor()=" + getAuthor() + ", getId()=" + getId()
				+ ", getTitle()=" + getTitle() + ", getCopies()=" + getCopies() + "]";
	}

	

	
	
}
