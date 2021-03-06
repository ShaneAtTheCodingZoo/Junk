package com.thecodingzoo.lessons.basic.done;

public class SwitchConditions {
	// #4
	public static void main(String[] args) {
		int myNumber = 3;

		if (myNumber == 2) {
			System.out.println(
					"Running this line because condition 1 met");
		} else if (myNumber == 3) {
			System.out
					.println("Running this line if 2nd condition met");
		} else {
			System.out.println("Running this line if no condition met");
		}

		// Original Switch
		switch (myNumber) {
		case 2:
			System.out.println("Running this line because case 2 met.");
			break;
		case 3:
			System.out.println("Running this line because case 3 met.");
		case 4:
			System.out.println(
					"This is running because no break in case 3");
			break;
		default:
			System.out.println("Running this line if no condition met");
		}

		// String usage in Switch
		String myName = "Shane";
		switch (myName) {
		case "shane":
			System.out.println(
					"Running this line because case shane met.");
			break;
		case "Shane":
			System.out.println(
					"Running this line because case Shane met.");
			break;
		}

	}

}
