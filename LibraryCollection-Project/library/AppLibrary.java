package library;

import java.util.Scanner;

public class AppLibrary {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scannerString = new Scanner(System.in);
		
		int menu;
		
		Book book;
		String title, author, genre;
		double price;
		long isbn;
		
		do { 
			System.out.println(showMenu());
			menu = scanner.nextInt();
			
			switch (menu) {
			case 1:
				
				System.out.println("Type the title: ");
				title = scannerString.nextLine();
				System.out.println("Type the Author: ");
				author = scannerString.nextLine();
				System.out.println("Type the isbn: ");
				isbn = scanner.nextLong();
				System.out.println("Type the genre: ");
				genre = scannerString.nextLine();
				System.out.println("Type the price: ");
				price = scanner.nextDouble();
				
				book = new Book(title, author, isbn, genre, price);
				
				Collection.add(book);
				
				break;
			case 2:
				
				System.out.println(Collection.catalog());
				
				break;
			case 3:
				
				String search1 = "";
				
				System.out.println("Type the genre: \n");
				search1 = scannerString.nextLine();
				System.out.println(Collection.searchGenre(search1));
				
				break;
			case 4:
				
				double initalValue, finalValue = 0;
				
				System.out.println("Type the minimum price range: ");
				initalValue = scanner.nextInt();
				System.out.println("Type the maximum price range: ");
				finalValue = scanner.nextInt();
				
				System.out.println(Collection.searchPrice(initalValue,finalValue));
				
				break;
			case 5:
				
				String search4 = "";
				
				System.out.println("Type the book title you want to remove: ");
				search4 = scannerString.nextLine();
				
				System.out.println(Collection.remove(search4));
				
				break;
			case 6:
				
				System.out.println(Collection.calculateCollectionTotal());
				
				break;
			case 7:
				
				System.out.println("See you later!");
				
				break;
			default:
				System.out.println("Invalid option");
			}
			
			
		} while (menu != 7); 
		
	
	}
	
	static String showMenu() {
		
		return "\n\n======== LIBRARY MENU ========\n\n"
				+ "1. ADD NEW BOOK\n"
				+ "2. SHOW THE CATALOG\n"
				+ "3. SEARCH BOOKS BY GENRE\n"
				+ "4. SEARCH BOOK BY PRICE\n"
				+ "5. REMOVE BOOK\n"
				+ "6. CALCULATE COLLECTION VALUE\n"
				+ "7. LOG OUT FROM MENU\n\n"
				+ "Type you option:  \n" ;
		
	}
	
}
