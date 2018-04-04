package com.example.web_dancer;

public class CheckInput {

	private String[] sequenceOfNumbersSplit;
	private CheckSequence checkSequance;

	public CheckInput(String[] sequenceOfNumbersSplit) {
		this.sequenceOfNumbersSplit = sequenceOfNumbersSplit;
	}

	private boolean isLengthCorrect() {
		if (sequenceOfNumbersSplit.length > 0 && sequenceOfNumbersSplit.length < 51) {
			return true;
		}
		return false;

	}

	public boolean check() {
		if (isLengthCorrect()) {
			checkSequance = new CheckSequence(sequenceOfNumbersSplit);
			return checkSequance.check();
		}
		return false;

	}

	public CheckSequence getCheckSequance() {
		return checkSequance;
	}
}
