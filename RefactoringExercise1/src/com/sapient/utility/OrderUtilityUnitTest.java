package com.sapient.utility;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sapient.domain.Order;



public class OrderUtilityUnitTest {

	private OrderUtilityInterface orderUtil = new OrderUtility();
	
	private static final String expectedResultStr = "two thousand five hundred twenty-three";
	private static final Integer expectedResultInt = 2523;
	
	@Test
	public void testConvertToText() {
		Order order = new Order(2522.70);
		String resultStr = orderUtil.convertToText((int)Math.round(order.getOrderAmount()));
		assertEquals(expectedResultStr, resultStr);
	}

	@Test
	public void testRoundToNearestNumber(){
		Order order = new Order(2522.70);
		Integer roundedNumberResult = orderUtil.roundToNearestNumber(order.getOrderAmount());
		assertEquals(expectedResultInt, roundedNumberResult);
	}
	
	@Test
	public void testRoundAndConvertText(){
		Order order = new Order(2522.70);
		String orderAmountStrResult = orderUtil.roundAndConvert(order.getOrderAmount());
		assertEquals(expectedResultStr, orderAmountStrResult);
		
	}
}
