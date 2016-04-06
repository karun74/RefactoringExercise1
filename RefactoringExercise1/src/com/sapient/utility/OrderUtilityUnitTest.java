package com.sapient.utility;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sapient.domain.Order;



public class OrderUtilityUnitTest {

	private OrderUtilityInterface orderUtil = new OrderUtility();
	
	@Test
	public void testConvertToText() {
		Order order = new Order();
		double orderAmount = 2522.70;
		String expectedResultStr = "2523";
		order.setOrderAmount(orderAmount);
		String resultStr = orderUtil.convertToText((int)Math.round(order.getOrderAmount()));
		assertEquals(expectedResultStr, resultStr);
	}

	@Test
	public void testRoundToNearestNumber(){
		Order order = new Order();
		double orderAmount = 2522.70;
		Integer expectedResultInt = 2523;
		order.setOrderAmount(orderAmount);
		Integer roundedNumberResult = orderUtil.roundToNearestNumber(order.getOrderAmount());
		assertEquals(expectedResultInt, roundedNumberResult);
	}
	
	@Test
	public void testRoundAndConvert(){
		Order order = new Order();
		double orderAmount = 2522.70;
		order.setOrderAmount(orderAmount);
		String expectedResultStr = "2523";
		String orderAmountStrResult = orderUtil.roundAndConvert(order.getOrderAmount());
		assertEquals(expectedResultStr, orderAmountStrResult);
		
	}
}
