package com.bptn.course._31_file_handling_basics;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) {
		Student student1 = new Student(123, "Jane Doe");
		try {
			FileWriter writer = new FileWriter("student.txt");
			writer.write(student1.getStudentName() + "\n");
			System.out.println("File created!");
			writer.close();

		} catch (IOException e) {
			System.out.println("Something went wrong while creating the file.");
			e.printStackTrace();
		}
	}

}

class Student {
	int studentId;
	String studentName;

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}
}
