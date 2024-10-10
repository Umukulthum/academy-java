package com.bptn.course.exercises.modelling_uni_of_studt;

import java.util.ArrayList;
import java.util.List;

class University {

	// property - get inspired by the UML diagram
	public ArrayList<Student> students;

	public University(ArrayList<Student> students) {
		this.students = students;
	}

	public void addStudent(Student s) {
		// add a student to the "university" arraylist
		students.add(s);
	}

	public Student getStudent(long studentId) {
		// get the first student in the university that has the studentId. (ideally,
		// this would be unique, so you can stop searching after finding the fist match)
		for (Student student : students) {
			if (student.getStudentId() == studentId) {
				return student;
			}
		}
		return null;
	}

	public List<Student> searchStudent(String userNamePrefix) {
		// return all students that have usernames beginning with the prefix
		List<Student> studentList = new ArrayList<>();
		for (Student student : students) {
			if (student.getUserName().equalsIgnoreCase(userNamePrefix)) {
				studentList.add(student);
			}
		}
		return studentList;
	}

	public boolean deleteStudent(long studentId) {
		// return if a successful deletion happened
		for (Student student : students) {
			if (student.getStudentId() == studentId) {
				return students.remove(student);
			}
		}
		return false;
	}

}
