package task14;

public class task14 {
    private String author;
	private String title;
	private static int edition;
	private int price;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof task14)
			return title == ((task14) obj).title && author == ((task14) obj).author && price == ((task14) obj).price;
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
	public task14 clone() {
		task14 book = new task14();
		book.author = this.author;
		book.price = this.price;
		book.title = this.title;
		return book;
	}
}
