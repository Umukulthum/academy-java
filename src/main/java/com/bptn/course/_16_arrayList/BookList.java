package com.bptn.course._16_arrayList;

import java.util.ArrayList;

public class BookList {

	public static void main(String[] args) {

		ArrayList<String> myBooks = new ArrayList<>();
		int counter = 1;

		// Add 3 favorite books to the list
		myBooks.add("Book1".toLowerCase());
		myBooks.add("Book2".toLowerCase());
		myBooks.add("Book3".toLowerCase());

		// Display all books
		System.out.println("My favourite books are: " + myBooks);
		// OR
		for (String book : myBooks) {
			System.out.println("Book " + counter + ": " + book);
			counter++;
		}

		// Display first book
		System.out.println("First book is: " + myBooks.getFirst());

		// Delete second book
		myBooks.remove(1);
		System.out.println("My favourite books are: " + myBooks);

		// Search for a book
		if (myBooks.contains("book2".toLowerCase())) {
			System.out.println("Book found");
		} else {
			System.out.println("Book not found");
		}

		// Get the number of books in the list
		System.out.println("The size of the list is: " + myBooks.size());

		// Get last book
		System.out.println("Last book on the list is: " + myBooks.get(myBooks.size() - 1));
	}

}
