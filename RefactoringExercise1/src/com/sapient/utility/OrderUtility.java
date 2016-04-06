package com.sapient.utility;

public class OrderUtility implements OrderUtilityInterface{
	
	

	@Override
	public String convertToText(Integer input) {
		String output= NumberToWordConverter.convertNumberToWords(input);
		return output;
	}

	@Override
	public Integer roundToNearestNumber(Double d) {
		int roundedNumber = (int)Math.round(d);
		return roundedNumber;
	}

	@Override
	public String roundAndConvert(Double d) {
		Integer roundedValue = roundToNearestNumber(d);
		String outputStr = NumberToWordConverter.convertNumberToWords(roundedValue);
		return outputStr;
	}
	
	
}