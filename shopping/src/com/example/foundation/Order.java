package com.example.foundation;


public class Order {

	private String orderId;
	Custom custom;//顾客信息
	CheckoutCart checkoutCart;//购物车清单
	//订单编号根据时间(yymmdd+序列号 当前第几个递交订单的顺序)
	private void initOrderId() {
		orderId = "20171011XXXXXX";
	}
	public String getOrderId() {
		return orderId;
	}
	
	//顾客信息以及购物车的提交
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
	//订单信息
	public void showInfo()
	{
		String info="custom information: "+getCustom().toString()+"/n"+"Goods information"+
				getCheckoutCart().toString();
	}
	
}
