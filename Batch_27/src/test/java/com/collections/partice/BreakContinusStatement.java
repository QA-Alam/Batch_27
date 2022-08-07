package com.collections.partice;

public class BreakContinusStatement {
	// what is the difference between continue and the break in java

	public static void continuePartice() {

		for (int i = 0; i < 100; i++) {
			if (i == 6) {
				continue; // when i is equal 5 it will continue with the 6.
			}

			System.out.println(i);// it escape this line when i is equal to 5
		}

	}

	public static void breakPartice() {

		for (int i = 0; i < 100; i++) {
			if (i == 5) {
				break;
			}

			System.out.println(i);

		}

	}

	public static void findValueFromWebElement() {
		String[] names = { "smart", "tech", "batch", "27", "prodan vai from canada" };

		for (String newName : names) {

			if (newName.contains("prodan vai from canada")) {

				System.out.println(newName);
			}
		}

	}

	public static void main(String[] args) {
		// BreakContinusStatement.breakPartice();
		BreakContinusStatement.findValueFromWebElement();
		;

	}

}
