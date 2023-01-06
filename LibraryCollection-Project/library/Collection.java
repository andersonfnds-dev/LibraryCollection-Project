package library;

import java.util.ArrayList;

public class Collection{
	
	private static ArrayList<Book> books = new ArrayList<>();
	
	public static ArrayList<Book> getBooks() {
		return books;
	}

	static public void add (Book book) {
		books.add(book);
	}
	
	static public String catalog () {
		String saida = "";
		
		for (Book book : books) {
			saida += "\n" + book.toString();
		}
		
		return saida;
	}
	
	static public String searchGenre(String genre) {
		ArrayList<Book> books = new ArrayList<>();
		
		for (Book book : books) {
			if(book.getGenre().equalsIgnoreCase(genre)) {
				books.add(book);;
			}
		}
		
		return "\nBooks between the filtered prices: \n" +
		books.toString();
	}
	
	
	static public String searchPrice(double initialPrice, double finalPrice) {
		ArrayList<Book> books = new ArrayList<>();
		
		for (Book book : books) {
			if(book.getPrice() >= initialPrice 
			&& book.getPrice() <= finalPrice) {
			books.add(book);
			}
		}
		
		return "\nBooks between the filtered prices: \n" +
				books.toString();
		
	}
	
	static String remove(String titulo) {
		
		boolean success = false;
		
		for (Book book : books) {
			if(book.getTitle().equalsIgnoreCase(titulo)) {
				books.remove(book);
				success = true;
			} else {
				success = false; }
			}
		if (success == true) {
			return "Book successfully removed";
		}
		return "Error";
	
	}
	
	static public String calculateCollectionTotal () {
		double total = 0;
		
		for (Book book : books) {
			total += book.getPrice();
		}
		
		return "The total sum of all books in the Collection is:"
				+ String.format("\nR$ %.2f", total)  ;
	}
	
}
