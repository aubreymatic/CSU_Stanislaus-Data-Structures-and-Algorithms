package part1;

import java.util.*;

public class BSTDriver1 {
	
	public static void show(ArrayList<Book> books) {
		for (Book book: books) {
			book.show();
		}
	}

	public static void main(String[] args) {
		
		// create a BST with nodes (key: price, value: book)
		BST<Double, Book> bst = new BST<Double, Book>();
		
		// add nodes
		bst.insert(150.0, new Book("978-1292153599",
				"Big Data Analysis", "Danny", 150, 2019));
		bst.insert(70.0, new Book("978-1292153589",
				"Data Structure", "Kim", 70, 2020));
		bst.insert(120.0, new Book("978-1292153612",
				"Big Data Transfer", "Sarah", 120, 2021));
		bst.insert(50.0, new Book("978-1292153566",
				"Algorithm", "Daehee", 50, 2019));
		bst.insert(100.0, new Book("978-1292153592",
				"Ecommerce Systems Design", "Danny", 100, 2020));
		bst.insert(80.0, new Book("978-1292153600",
				"Java Programming", "Kim", 80, 2019));
		bst.insert(130.0, new Book("978-1292153620",
				"Android Mobile Development", "Daehee", 130, 2020));
		
		// find nodes ( 90 <= key <= 120)
		double minPrice = 90;
		double maxPrice = 120;
		ArrayList<Book> books = bst.find(minPrice, maxPrice);
		BSTDriver1.show(books);
		System.out.println();
		
		// create a BST with nodes (key: year, value: book)
		BST<Integer, Book> bst1 = new BST<Integer, Book>();
		
		// add nodes
				bst1.insert(2019, new Book("978-1292153599",
						"Big Data Analysis", "Danny", 150, 2019));
				bst1.insert(2020, new Book("978-1292153589",
						"Data Structure", "Kim", 70, 2020));
				bst1.insert(2021, new Book("978-1292153612",
						"Big Data Transfer", "Sarah", 120, 2021));
				bst1.insert(2019, new Book("978-1292153566",
						"Algorithm", "Daehee", 50, 2019));
				bst1.insert(2020, new Book("978-1292153592",
						"Ecommerce Systems Design", "Danny", 100, 2020));
				bst1.insert(2019, new Book("978-1292153600",
						"Java Programming", "Kim", 80, 2019));
				bst1.insert(2020, new Book("978-1292153620",
						"Android Mobile Development", "Daehee", 130, 2020));
		
		// find nodes ( 2019 <= year <= 2010 )
		int minYear = 2019;
		int maxYear = 2020;
		books = bst1.find(minYear, maxYear);
		BSTDriver1.show(books);
		
	}
}
