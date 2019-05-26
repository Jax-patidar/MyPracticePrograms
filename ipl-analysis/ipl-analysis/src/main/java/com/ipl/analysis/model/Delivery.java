package com.ipl.analysis.model;

public class Delivery {
	
	private int matchId;
	
	private int inning;
	
	private String battingTeam;
	
	private String bowlingTeam;
	
	private int over;
	
	private int ball;
	
	private String batsman;
	
	private String bowler;
	
	private OtherRunType otherRunType;
	
	private int otherRuns;
	
	private int penaltyRuns;
	
	private int batsmanRuns;

	public Delivery(String row) {
		String[] columns = row.split(",");
		Utils.trim(columns);
		matchId = Integer.parseInt(columns[0]);
		inning = Integer.parseInt(columns[1]);
		battingTeam = columns[2];
		bowlingTeam = columns[3];
		over = Integer.parseInt(columns[4]);
		ball = Integer.parseInt(columns[5]);
		batsman = columns[6];
		bowler = columns[7];
		otherRunType = OtherRunType.get(columns);
		penaltyRuns = Integer.parseInt(columns[12]);
		batsmanRuns = Integer.parseInt(columns[13]);
	}

	public int getMatchId() {
		return matchId;
	}

	public int getInning() {
		return inning;
	}

	public String getBattingTeam() {
		return battingTeam;
	}

	public String getBowlingTeam() {
		return bowlingTeam;
	}

	public int getOver() {
		return over;
	}

	public int getBall() {
		return ball;
	}

	public String getBatsman() {
		return batsman;
	}

	public String getBowler() {
		return bowler;
	}

	public OtherRunType getOtherRunType() {
		return otherRunType;
	}

	public int getOtherRuns() {
		return otherRuns;
	}

	public int getPenaltyRuns() {
		return penaltyRuns;
	}

	public int getBatsmanRuns() {
		return batsmanRuns;
	}
	
	public int getExtraRuns() {
		return otherRuns + penaltyRuns;
	}
	
	public int getTotalRuns() {
		return otherRuns + penaltyRuns + batsmanRuns;
	}
}
