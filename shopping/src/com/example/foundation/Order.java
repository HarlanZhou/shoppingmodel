package com.example.foundation;


public class Order {

	private String orderId;
	Custom custom;//�˿���Ϣ
	CheckoutCart checkoutCart;//���ﳵ�嵥
	//������Ÿ���ʱ��(yymmdd+���к� ��ǰ�ڼ����ݽ�������˳��)
	private void initOrderId() {
		orderId = "20171011XXXXXX";
	}
	public String getOrderId() {
		return orderId;
	}
	
	//�˿���Ϣ�Լ����ﳵ���ύ
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
	//������Ϣ
	public void showInfo()
	{
		String info="custom information: "+getCustom().toString()+"/n"+"Goods information"+
				getCheckoutCart().toString();
	}
	
}
