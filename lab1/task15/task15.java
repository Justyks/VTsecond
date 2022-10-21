package task15;

import java.util.Comparator;

public class task15 implements Comparable<task15> {
	private String author;
	private String title;
	private static int edition;
	private int price;
	private int isbn;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof task15)
			return title == ((task15) obj).title && author == ((task15) obj).author && price == ((task15) obj).price;
		else
			return false;
	}

	@Override
	public int hashCode() {
		return title.hashCode() + author.hashCode();
	}

	@Override
	public String toString() {
		return String.format("Title: %s, Author: %s, Price: %d, Edition: %d", title, author, price, edition);
	}

	@Override
	public task15 clone() {
		task15 book = new task15();
		book.author = this.author;
		book.price = this.price;
		book.title = this.title;
		return book;
	}

	public int compareTo(task15 book) {
		if (this.isbn > book.isbn)
			return 1;
		else if (this.isbn < book.isbn)
			return -1;
		else
			return 0;
	}

	public static Comparator<task15> byPrice = Comparator.comparingInt(book -> book.price);

	public static Comparator<task15> byAuthor = (book1, book2) -> {
		return book1.author.compareToIgnoreCase(book2.author);
	};

	public static Comparator<task15> byTitle = (book1, book2) -> {
		return book1.title.compareToIgnoreCase(book2.title);
	};

	public static Comparator<task15> byTitleThanAuthor = byTitle.thenComparing(byAuthor);
	public static Comparator<task15> byAuthorThanTitle = byAuthor.thenComparing(byTitle);
	public static Comparator<task15> byAuthorThanTitleThanPrice = byAuthor.thenComparing(byTitle).thenComparing(byPrice);
}