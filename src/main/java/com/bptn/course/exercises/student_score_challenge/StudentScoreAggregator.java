package com.bptn.course.exercises.student_score_challenge;

import java.util.HashMap;
import java.util.Map;

public class StudentScoreAggregator {

	public static double calculateAverage(Student student) {
		Map<String, Double> scores = student.getSubjectScores();
		double sum = 0.0;

		for (Double value : scores.values()) {
			sum += value;
		}
		return sum / scores.size();
	}

	public static void main(String[] args) {
		Map<String, Double> scores = new HashMap<>();
		scores.put("Course1", 90.0);
		scores.put("Course2", 75.5);
		scores.put("Course3", 98.3);

		Student student = new Student("Student1", scores);

		System.out.printf("The average score of the student is: %.2f", calculateAverage(student));

	}

}
