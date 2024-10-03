package com.bptn.course.exercises;

//Main.java
public class EmailValidation {
	public static void main(String[] args) {
		try {
			boolean isValid = EmailValidator.isValidEmail("example@gmail.com");
			if (isValid) {
				System.out.println("Email is valid");
			}
		} catch (InvalidEmailException e) {
			System.out.println(e.getMessage());
		}
	}
}


//EmailValidator.java
class EmailValidator {
	public static boolean isValidEmail(String email) throws InvalidEmailException {
		String pattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		if (email.matches(pattern)) {
			return true;
		} else {
			throw new InvalidEmailException("Invalid email address format.");
		}
	}
}

//InvalidEmailException.java
class InvalidEmailException extends Exception {
	public InvalidEmailException(String message) {
		super(message);
	}
}
