package com.sapient.domain;

import java.io.Serializable;

public class Order implements Serializable {
	
	private Double orderAmount;

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

}
