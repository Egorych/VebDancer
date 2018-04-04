package com.example.web_dancer;

import java.util.ArrayList;

public class Dancer {

	private Movements movements;
	private ArrayList<Integer> sequence = new ArrayList<Integer>();
	private int currentPosition = 0;
	private int newPosition = 0;

	public Dancer(ArrayList<Integer> sequence) {
		movements = new Movements(sequence);
		this.sequence = sequence;
	}

	private boolean isCanDance() {
		if (sequence.get(0) != 0 && sequence.get(0) % 2 == 0 && sequence.get(0) < sequence.size()) {
			return true;
		}
		return false;
	}

	public int dance() {
		if (isCanDance()) {
			while (newPosition != -1 && movements.getNumberOfMovements() != sequence.size()) {
				currentPosition = newPosition;
				newPosition = movements.move(sequence.get(currentPosition));
			}
		}
		if (movements.getNumberOfMovements() == sequence.size())
			return -1;
		return movements.getCountOfSteps() + currentPosition;

	}
}
