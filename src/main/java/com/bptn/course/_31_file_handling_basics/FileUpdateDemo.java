package com.bptn.course._31_file_handling_basics;

import java.io.FileWriter;
import java.io.IOException;

public class FileUpdateDemo {

	public static void main(String[] args) {

		try {
			FileWriter writer = new FileWriter("sample.txt", true);
			writer.write("\nThis is a fourth line!");
			writer.write("\nThis is a fifth line to the existing line");

			System.out.println("File updated!");
			writer.close();

		} catch (IOException e) {
			System.out.println("Something went wrong while creating the file.");
			e.printStackTrace();
		}
	}

}
