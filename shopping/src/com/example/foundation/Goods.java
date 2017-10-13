package com.example.foundation;

public class Goods {
	//商品的基本信息
	private String goodsName;
	private String goodsId;
	private double goodsPrice;
	private int quantity;
	public Goods(String goodsName,String goodsId,double goodsPrice,int quantity) {
		// TODO Auto-generated constructor stub
		this.goodsId=goodsId;
		this.goodsName=goodsName;
		this.goodsPrice=goodsPrice;
		this.quantity=quantity;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public double getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Goods [goodsName=" + goodsName + ", goodsId=" + goodsId + ", goodsPrice=" + goodsPrice + "]";
	}
	public void showInfo(){
		System.out.println(toString());
	}
	
	

}
