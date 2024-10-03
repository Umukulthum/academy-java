package com.bptn.course.exercises;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		// Write your code below.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the file name with correct extension i.e. .txt ");

		String fileName = scanner.nextLine().toLowerCase();

		try {
			validateFileExtension(fileName);
			System.out.println("Correct file name with extension .txt");
		} catch (FileExtensionException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			scanner.close();
		}

	}

	private static void validateFileExtension(String fileName) throws FileExtensionException {
		if (!fileName.endsWith(".txt")) {
			throw new FileExtensionException("File doesn't have .txt extension");
		}
	}
}

// Create a class FileExtensionException here
class FileExtensionException extends Exception {
	public FileExtensionException(String message) {
		super(message);
	}
}
