package com.bptn.course.exercises.modelling_uni_of_studt;

import java.sql.Date;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		// Start by looking in the University and Student classes. Implement the
		// methods.

		// Create a bunch of student objects
		// (Make sure one student has the following studentId: 123)
		// (Make sure one other student has the following username: testUsername1)
		Student student1 = new Student(123, "testUsername1", "testUsername1", "test", "name", "testUsername1@mail.com",
				"0123456789", "Toronto", "F", Date.valueOf("2000-10-10"), Date.valueOf("2023-10-10"), 12, "Academy");
		Student student2 = new Student(124, "testUsername1", "testUsername10", "test2", "lastname",
				"test2Username10@mail.com", "3853456789", "Ajax", "M", Date.valueOf("1999-01-10"),
				Date.valueOf("2024-05-11"), 13, "Python");
		Student student3 = new Student(125, "johndoe", "johndoe", "john", "doe", "johndoe9@mail.com", "0123456449",
				"Vancouver", "M", Date.valueOf("2002-10-10"), Date.valueOf("2023-10-10"), 14, "Obsidi");
		Student student4 = new Student(126, "maryjane", "maryjane", "mary", "jane", "maryjane48@mail.com", "0003456789",
				"Hamilton", "F", Date.valueOf("2001-10-10"), Date.valueOf("2022-10-10"), 15, "Java");

		// Create instance of university called "university" and populate it with the
		// students.
		ArrayList<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);

		University university = new University(students);

		System.out.println("\nUniversity ------ \n" + university.students);
		System.out.println("\nGetting student------\n" + university.getStudent(123));
		System.out.println("\nDeleting student------\n" + university.deleteStudent(123));
		System.out.println("\nSeaching student------\n" + university.searchStudent("testUsername1"));

		System.out.println("\nUniversity ------ \n" + university.students);

	}
}
