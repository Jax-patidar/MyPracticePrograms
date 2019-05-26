package com.ipl.analysis;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ipl.analysis.model.Delivery;
import com.ipl.analysis.model.Match;
import com.ipl.analysis.model.Utils;

public class App {
	
	private static final String FOLDER_PATH;
	
	private static List<Match> matches = new ArrayList<>();
	private static List<Delivery> deliveries = new ArrayList<>();
	
	static {
		FOLDER_PATH = System.getProperty("folder_path");
	}
	
	public static void main(String[] args) throws IOException {
		loadMatches();
		loadDeliveries();
		problem1();
		System.out.println();
	}

	private static void problem1() {
		Map<String, Object[]> yearTeamMap = new HashMap<>();
		Object[] row;
		String season;
		String groupKey;
		for(Match match: matches) {
			season = match.getSeason();
			if(!"2016".equals(season) && !"2017".equals(season)) {
				continue;
			}
			if(match.isDecidedToBat()) {
				continue;
			}
			groupKey = season+match.getTossWinner();
			row = yearTeamMap.get(groupKey);
			if(null == row) {
				row = new Object[] {season, match.getTossWinner(), 0};
				yearTeamMap.put(groupKey, row);
			}
			row[2] = (int)row[2] + 1;
		}
		
		List<Object[]> groupedData = new ArrayList<>(yearTeamMap.values());
		Collections.sort(groupedData, new Comparator<Object[]>() {
			@Override
			public int compare(Object[] o1, Object[] o2) {
				return (int)o2[2] - (int)o1[2];
			}
		});
		
		for(int i = 0; i < 4; i++) {
			row = groupedData.get(i);
			System.out.print(row[0]);
			System.out.print(",");
			System.out.print(row[1]);
			System.out.print(",");
			System.out.println(row[2]);
		}
	}
	
	private static void loadDeliveries() throws IOException {
		BufferedReader bufferedReader = Utils.getBufferedReader(FOLDER_PATH + "/deliveries.csv", true);
		String row;
		while(null != (row = bufferedReader.readLine())) {
			deliveries.add(new Delivery(row));
		}
		bufferedReader.close();
	}

	private static void loadMatches() throws IOException {
		BufferedReader bufferedReader = Utils.getBufferedReader(FOLDER_PATH + "/matches.csv", true);
		String row;
		while(null != (row = bufferedReader.readLine())) {
			matches.add(new Match(row));
		}
		bufferedReader.close();
	}
}
