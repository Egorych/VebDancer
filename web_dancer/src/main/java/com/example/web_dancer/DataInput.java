package com.example.web_dancer;

import java.util.ArrayList;

public class DataInput {

	private String[] sequenceOfNumbersSplit;
	private CheckInput checkInput;

	public DataInput(String sequence) {
		if (!sequence.isEmpty()) {
			sequenceOfNumbersSplit = sequence.split(" ");
		}
	}

	public boolean validateInput() {
		if (sequenceOfNumbersSplit != null) {
			checkInput = new CheckInput(sequenceOfNumbersSplit);
			return checkInput.check();
		}
		return false;

	}

	public ArrayList<Integer> getIntSequance() {
		return checkInput.getCheckSequance().getSequence();
	}
}
