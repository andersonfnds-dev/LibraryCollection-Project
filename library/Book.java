package library;

public class Book {
	
	private String title;
	private String author;
	private long isbn;
	private String genre;
	private double price;
	
	
	
	public Book() {}

	public Book(String title, String author, long isbn, String genre, double price) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.genre = genre;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Book \ntitle = " + title + "/ author = "
		+ author + "\nisbn = " + isbn + "/ genre = " 
		+ genre + "\nprice = " + price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
	

}
