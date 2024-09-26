package com.bptn.course._05_strings;

public class Strings {

	public static void main(String[] args) {
		String userName = "  Umukulthum  ";
		System.out.println(userName.length());
		System.out.println(userName.charAt(2));
		System.out.println(userName.substring(4));
		System.out.println(userName.substring(2,4));
		System.out.println(userName.equals("Umukulthum"));
		System.out.println(userName.trim());
		System.out.println(userName.indexOf('u'));
	}
}
