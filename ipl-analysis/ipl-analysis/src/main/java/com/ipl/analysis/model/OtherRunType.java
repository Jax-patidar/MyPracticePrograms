package com.ipl.analysis.model;

public enum OtherRunType {
	
	WIDE, BYE, LEG_BYE, NO_BALL, NOT_APPLICABLE;
	
	public static OtherRunType get(String[] columns) {
		if(columns[8] != "0") {
			return WIDE;
		} else if(columns[9] != "0") {
			return BYE;
		} else if(columns[10] != "0") {
			return LEG_BYE;
		} else if(columns[11] != "0") {
			return NO_BALL;
		} else {
			return NOT_APPLICABLE;
		}
	}
}
