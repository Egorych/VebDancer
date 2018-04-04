package com.example.web_dancer;

import java.util.ArrayList;

public class CheckSequence {

	private ArrayList<Integer> sequence;
	private CheckNumber checkNumber;
	private String[] sequenceOfNumbersSplit;

	public CheckSequence(String[] sequenceOfNumbersSplit) {
		this.sequenceOfNumbersSplit = sequenceOfNumbersSplit;
		sequence = new ArrayList<Integer>();
		checkNumber = new CheckNumber();
	}

	public boolean check() {
		for (String number : sequenceOfNumbersSplit) {
			if (checkNumber.isNumberCorrect(number)) {
				sequence.add(Integer.parseInt(number));
			} else {
				return false;
			}
		}
		return true;

	}

	public ArrayList<Integer> getSequence() {
		return sequence;
	}
}
