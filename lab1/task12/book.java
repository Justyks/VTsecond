package task12;

public class book {
    private String author;
	private String title;
	private static int edition;
	private int price;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof book)
			return title == ((book) obj).title && author == ((book) obj).author && price == ((book) obj).price;
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
}
