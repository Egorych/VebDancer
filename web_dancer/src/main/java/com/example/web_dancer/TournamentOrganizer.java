package com.example.web_dancer;

import java.util.ArrayList;

public class TournamentOrganizer {

	private DataInput dataInput;
	private ArrayList<Integer> sequence = new ArrayList<Integer>();
	private Dancer dancer;

	public TournamentOrganizer(String sequence) {
		dataInput = new DataInput(sequence);
	}

	public int startTournament() {
		if (dataInput.validateInput()) {
			sequence = dataInput.getIntSequance();
			dancer = new Dancer(sequence);
			return dancer.dance();
		}
		return 0;

	}
}
