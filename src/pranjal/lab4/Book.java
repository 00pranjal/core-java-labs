package pranjal.lab4;

public class Book extends WrittenItem {

	public Book(int id, String title, int copies, String author) {
		super(id, title, copies, author);
		
	}

	@Override
	public String toString() {
		return "Book [getAuthor()=" + getAuthor() + ", getId()=" + getId()
				+ ", getTitle()=" + getTitle() + ", getCopies()=" + getCopies() +"]";
	}
	
}
