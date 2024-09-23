package pranjal.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {

	public static void main(String[] args) {

		Book book1 = new Book(1, "Ecosystem", 5, "James");
		Book book2 = new Book(2, "Biodiversity", 3, "Walter Rose");

		JournalPaper journal1 = new JournalPaper(23, "Pollution Control", 2, "John", 2020);

		Video video1 = new Video(21, "Java Tutorial", 3, 120, "Vaman", "Education", 2024);

		CD cd1 = new CD(4, "Race", 4, 180, "Ramesh", "Comedy");

		List<Item> items = new ArrayList<>(Arrays.asList(book1, book2, journal1, video1, cd1));

		System.out.println("List of items: ");

		for (Item item : items) {
			// System.out.println(item);

			if (item instanceof Book || item instanceof Video) {

				System.out.println("Title: " + item.getTitle() + ", Copies: " + item.getCopies());
			}
		}

		System.out.println("\nChecking in items");
		book1.checkIn();
		video1.checkIn();

		for (Item item : items) {

			if (item instanceof Book || item instanceof Video) {

				System.out.println("Title: " + item.getTitle() + ", Copies: " + item.getCopies());
			}
			// System.out.println(item);
		}

		System.out.println("\nList of authors of all Written items");

		for (Item item : items) {

			if (item instanceof WrittenItem) {
				WrittenItem writtenItem = (WrittenItem) item;
				System.out.println("Title: " + writtenItem.getTitle() + ", " + "Author: " + writtenItem.getAuthor());
			}
		}

	}

}
