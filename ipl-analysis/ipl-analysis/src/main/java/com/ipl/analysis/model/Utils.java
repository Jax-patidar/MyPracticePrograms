package com.ipl.analysis.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

public class Utils {
	
	private static SimpleDateFormat simpleDateFormat =  new SimpleDateFormat("yyyy-MM-dd");
	
	public static BufferedReader getBufferedReader(String filePath, boolean skipFirstLine) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
			if(skipFirstLine) {
				bufferedReader.readLine();
			}
			return bufferedReader;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void trim(String[] data) {
		for(int i = 0; i < data.length; i++) {
			if(null != data[i]) {
				data[i] = StringUtils.trimToNull(data[i]);
			}
		}
	}
	
	public static Date parseDateYYYYMMDD(String text) throws ParseException {
		return simpleDateFormat.parse(text);
	}
}
