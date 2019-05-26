package com.ipl.analysis.model;

import java.text.ParseException;
import java.util.Date;

public class Match {
	
	private int id;
	
	private String season;
	
	private String city;
	
	private Date date;
	
	private String team1;
	
	private String team2;
	
	private String tossWinner;
	
	private boolean decidedToBat;

	public MatchResultType matchResult;
	
	private String winner;

	public Match(String row) {
		String[] columns = row.split(",");
		Utils.trim(columns);
		id = Integer.parseInt(columns[0]);
		season = columns[1];
		city = columns[2];
		try {
			date = Utils.parseDateYYYYMMDD(columns[3]);
		} catch (ParseException e) {
			throw new IllegalArgumentException("Invalid match date");
		}
		team1 = columns[4];
		team2 = columns[5];
		tossWinner = columns[6];
		decidedToBat = "bat".equals(columns[7]);
		matchResult = MatchResultType.get(columns[8]);
		if(columns.length > 9) {
			winner = columns[9];
		}
	}

	public int getId() {
		return id;
	}

	public String getSeason() {
		return season;
	}

	public String getCity() {
		return city;
	}

	public Date getDate() {
		return date;
	}

	public String getTeam1() {
		return team1;
	}

	public String getTeam2() {
		return team2;
	}

	public String getTossWinner() {
		return tossWinner;
	}

	public boolean isDecidedToBat() {
		return decidedToBat;
	}


	public MatchResultType getMatchResult() {
		return matchResult;
	}

	public String getWinner() {
		return winner;
	}
}
