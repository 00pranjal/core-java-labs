package pranjal.lab4;

import java.util.Objects;

public abstract class Item {
	
	private int id;
	private String title;
	private int copies;
	
	
	public Item(int id, String title, int copies) {
		
		this.id = id;
		this.title = title;
		this.copies = copies;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getCopies() {
		return copies;
	}


	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	public void checkIn() {
		
		copies ++;
		
	}
	
	public void checkOut() {
		
		if(copies > 0) {
			
			copies --;
			
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return copies == other.copies && id == other.id && Objects.equals(title, other.title);
	}


	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", copies=" + copies + "]";
	}
	
	
	

}
