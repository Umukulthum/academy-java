package com.bptn.course._17_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<String> myBooks = new ArrayList<>();

		// Add 3 favorite books to the list
		myBooks.add("Book1".toLowerCase());
		myBooks.add("Book2".toLowerCase());
		myBooks.add("Book3".toLowerCase());

		// Display all books
		Iterator<String> iterator = myBooks.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
