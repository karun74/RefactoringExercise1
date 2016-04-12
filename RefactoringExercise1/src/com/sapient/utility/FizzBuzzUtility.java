package com.sapient.utility;

import java.util.Arrays;

public class FizzBuzzUtility {
	
	public String checkForFizz(Integer inputNumber){
		String fizzFlg = ""+inputNumber;
		if(inputNumber % 3 ==0)
			fizzFlg="Fizz";
		return fizzFlg;
	}
	
	public String checkForBuzz(Integer inputNumber){
		String buzzFlg = ""+inputNumber;
		if(inputNumber % 5 ==0)
			buzzFlg="Buzz";
		return buzzFlg;
	}
	
	public String checkForFizzBuzz(Integer inputNumber){
		String fizzBuzzFlag=""+inputNumber;
		if( (inputNumber%3 ==0) && (inputNumber%5 ==0) )
			fizzBuzzFlag="FizzBuzz";
		return fizzBuzzFlag;
	}

	public String[] checkForFizzBuzzStreamResult(int[] inputStream){
		String[] resultLst= new String[inputStream.length];
		String actualResult="";
		int count=0;
		for(int inputNumber : inputStream){
			actualResult = checkForFizzBuzz(inputNumber);
			if(! "FizzBuzz".equalsIgnoreCase(actualResult) )
				actualResult = checkForBuzz(inputNumber);
			if(! "Buzz".equalsIgnoreCase(actualResult) && ! "FizzBuzz".equalsIgnoreCase(actualResult))
				actualResult = checkForFizz(inputNumber);
			resultLst[count]=actualResult;
			count++;
		}
		Arrays.asList(resultLst).stream().forEach(s -> { int i=0; if(i<(resultLst.length-1))System.out.print(s +","); else System.out.print(s); i++; } );
		return resultLst;
	}
}
