package com.ipl.analysis.model;

public enum MatchResultType {
	
	NO_RESULT, NORMAL, TIE;
	
	public static MatchResultType get(String result) {
		switch (result) {
			case "no result":
				return NO_RESULT;
			case "normal":
				return NORMAL;
			case "tie":
				return TIE;	
			default:
				throw new IllegalArgumentException("Invalid match result: " + result);
		}
	}
}
