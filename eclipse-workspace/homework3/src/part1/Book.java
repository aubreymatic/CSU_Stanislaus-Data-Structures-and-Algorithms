package part1;

public class Book {
	
	private String isbn;
	private String title;
	private String author;
	private double price;
	private int year;
	
	public Book(String isbn, String title,
			String author, double price, int year) {
		this.isbn   = isbn;
		this.title  = title;
		this.author = author;
		this.price  = price;
		this.year   = year;
	}
	
	public String isbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String toString() {
		String result = "ISBN: " + isbn + ", ";
		result		 += "Title: " + title + ", ";
		result		 += "Author: " + author + ", ";
		result		 += "Price: " + price + ", ";
		result		 += "Year: " + year + ", ";
		return result;
	}
	
	public void show() {
		System.out.println(toString());
	}
}
