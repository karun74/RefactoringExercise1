package com.sapient.utility;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.stream.IntStream;

public class FizzBuzzUtilityTest {
	
	public static final FizzBuzzUtility fbUtil = new FizzBuzzUtility();

	@Test 
	public void should_check_fizz_for_the_given_number(){
		int inputFeed = 99;
		String actualResult = fbUtil.checkForFizz(inputFeed);
		
		assertThat(actualResult, is("Fizz"));
	}
	
	@Test(expected=NumberFormatException.class)
	public void should_check_fizz_for_NAN_input(){
		 fbUtil.checkForFizz(Integer.parseInt("wewewe"));
		
	}
	
	@Test
	public void should_check_fizz_for_negative_number(){
		int inputFeed = -84;
		String actualResult = fbUtil.checkForFizz(inputFeed);
		assertThat(actualResult, is("Fizz"));
	}
	
	@Test
	public void should_check_for_buzz_for_given_number(){
		int inputFeed = 80;
		String actualResult = fbUtil.checkForBuzz(inputFeed);
		assertThat(actualResult, is("Buzz"));
	}
	
	@Test(expected=NumberFormatException.class)
	public void should_check_buzz_for_NAN_input(){
		 fbUtil.checkForBuzz(Integer.parseInt("wewewe"));
		
	}
	
	@Test
	public void should_check_buzz_for_negative_number(){
		int inputFeed = -80;
		String actualResult = fbUtil.checkForBuzz(inputFeed);
		assertThat(actualResult, is("Buzz"));
	}
	
	@Test
	public void should_check_fizz_buzz_for_numbers_series(){
		int [] inputStream = IntStream.range(1, 101).toArray();
		
		String[] acutalResultLst= new String[inputStream.length];
		acutalResultLst = fbUtil.checkForFizzBuzzStreamResult(inputStream);
		assertThat("FizzBuzz",is(acutalResultLst[29]));
	}
	
	@Test
	public void should_check_for_fizzbuzz_for_given_number(){
		int inputFeed = 30;
		String actualResult = fbUtil.checkForFizzBuzz(inputFeed);
		assertThat(actualResult, is("FizzBuzz"));
	}
	
}
