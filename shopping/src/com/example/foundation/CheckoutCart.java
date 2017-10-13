package com.example.foundation;

import java.util.ArrayList;
//购物车
public class CheckoutCart {
	ArrayList<Goods> goodsList;//购物单
	double totalPrice;//总价
	int numOfGoods;//总件数
	//int kindOfGoods;//商品的种类
	public void setGoodsList(ArrayList<Goods> goodsList)
	{
		this.goodsList=goodsList;
	}
	public void compute()
	{
		for(int i=0;i<goodsList.size();i++)
		{
			//获取总件数
			numOfGoods += goodsList.get(i).getQuantity();
			//计算总价
			totalPrice =totalPrice+goodsList.get(i).getGoodsPrice()*goodsList.get(i).getQuantity();
		}
	}
	public double getTotalPrice()
	{
		return totalPrice;
	}
	public int getNumOfGoods()
	{
		return numOfGoods;
	}
	
	@Override
	public String toString() {
		return "CheckoutCart [goodsList=" + goodsList + ", totalPrice=" + totalPrice + ", numOfGoods=" + numOfGoods
				+ "]";
	}
	public void showInfo()
	{
		System.out.println(toString());
	}
}
