package com.example.web_dancer;

public class CheckNumber {

	private int number;

	public boolean isNumberCorrect(String number) {

		try {
			this.number = Integer.parseInt(number);
		} catch (NumberFormatException e) {
			return false;
		}

		if (this.number >= 0)
			return true;
		return false;
	}

}
