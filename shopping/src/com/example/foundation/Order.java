package com.example.foundation;

import java.sql.Timestamp;

public class Order {

	private Timestamp time;// 时间戳 
	private String orderId;
	Custom custom;//顾客信息
	CheckoutCart checkoutCart;//购物车清单
	Address address;
	//订单编号根据时间(yymmdd+序列号 当前第几个递交订单的顺序)
	public Order()
	{
		
	}
	public Order(String orderId,Timestamp time,CheckoutCart checkoutCart,Custom custom,Address address)
	{
		super();
		this.address=address;
		this.orderId=orderId;
		this.time=time;
		this.checkoutCart=checkoutCart;
		this.custom=custom;
		
	}
	
	
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Custom getCustom() {
		return custom;
	}
	public void setCustom(Custom custom) {
		this.custom = custom;
	}
	public CheckoutCart getCheckoutCart() {
		return checkoutCart;
	}
	public void setCheckoutCart(CheckoutCart checkoutCart) {
		this.checkoutCart = checkoutCart;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Order [time=" + time + ", orderId=" + orderId + ", custom=" + custom + ", checkoutCart=" + checkoutCart
				+ ", address=" + address + "]";
	}
	
	
}
