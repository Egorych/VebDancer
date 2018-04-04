package com.example.web_dancer;

import java.util.ArrayList;

public class Movements {

	private ArrayList<Integer> sequence = new ArrayList<Integer>();
	private int position = 0;
	private int countOfSteps = 0;
	private int numberOfMovements = 0;

	public Movements(ArrayList<Integer> sequence) {
		this.sequence = sequence;
	}

	public int move(int steps) {

		if (steps % 2 == 0) {
			position += steps;
		} else {
			position -= steps;
		}
		if (checkPosition()) {
			numberOfMovements++;
			countOfSteps += steps;
			return position;
		}
		return -1;
	}

	private boolean checkPosition() {
		if (position >= 0 && position < sequence.size()) {
			return true;
		}
		return false;

	}

	public int getCountOfSteps() {
		return countOfSteps;
	}

	public int getNumberOfMovements() {
		return numberOfMovements;
	}
}
