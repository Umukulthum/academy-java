package com.bptn.course.four_a_row;

import com.bptn.course.four_a_row.exceptions.ColumnFullException;
import com.bptn.course.four_a_row.exceptions.InvalidMoveException;

public class TestClass {

	public static void main(String[] args) throws InvalidMoveException, ColumnFullException {
		Game fourInARowGame = new Game(); // complete line;
		fourInARowGame.play();
	}

}

// PASTE YOUR GITHUB LINK.
