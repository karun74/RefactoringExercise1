package com.sapient.utility;

public class OrderUtility implements OrderUtilityInterface{
	
	

	@Override
	public String convertToText(Integer input) {
		String output= input.toString();
		return output;
	}

	@Override
	public Integer roundToNearestNumber(Double d) {
		int roundedNumber = (int)Math.round(d);
		return roundedNumber;
	}

	@Override
	public String roundAndConvert(Double d) {
		String outputStr = roundToNearestNumber(d).toString();
		return outputStr;
	}
	
	
}