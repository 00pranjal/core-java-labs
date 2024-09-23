package pranjal.lab4;

public abstract class MediaItem extends Item {
	
	private int runtime;

	public MediaItem(int id, String title, int copies, int runtime) {
		super(id, title, copies);
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	@Override
	public String toString() {
		return "MediaItem [runtime=" + runtime + ", getRuntime()=" + getRuntime() + ", getId()=" + getId()
				+ ", getTitle()=" + getTitle() + ", getCopies()=" + getCopies() + "]";
	}
	
	
	

}
