package queue;

import java.io.*;
import java.util.*;

public class BookDriver {

	public static void main(String[] args) {
		
		// create a queue
		AQueue<Book> queue = new AQueue<Book>(100);
		
		// put books into queue
		try {
			File file = new File("books.csv");
			Scanner in = new Scanner(file);
			while (in.hasNext()) {
				String line = in.nextLine();
				String[] tokens = line.split(",");
				String title = tokens[0];
				String author = tokens[1];
				queue.enqueue(new Book(title,author));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// show number of books in the queue
		System.out.println("# of books: " + queue.length());
		System.out.println();
		
		// gets books from queue
		while (!queue.isEmpty()) {
			Book book = queue.dequeue();
			book.show();
		}
	}

}
