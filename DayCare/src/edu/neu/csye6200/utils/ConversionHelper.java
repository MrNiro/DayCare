package edu.neu.csye6200.utils;

import java.time.LocalDate;

public class ConversionHelper {
	
	public int stringToInt(String str) {
		int val = 0;
		try {
			val = Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		
		return val;
		
	}

	public double stringToDouble(String str) {
		double val = 0.0;
		try {
			val = Double.parseDouble(str);
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		
		return val;
		
	}
	
	public long stringToLong(String str) {
		long val = 0;
		try {
			val = Long.parseLong(str);
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		
		return val;
		
	}
	
	public LocalDate stringtoDate(String str) {
		LocalDate val = null;
		
		try {
			val = LocalDate.parse(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return val;
	}
}
