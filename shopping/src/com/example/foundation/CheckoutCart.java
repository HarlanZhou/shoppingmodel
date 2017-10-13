package com.example.foundation;

import java.util.ArrayList;
//���ﳵ
public class CheckoutCart {
	ArrayList<Goods> goodsList;//���ﵥ
	double totalPrice;//�ܼ�
	int numOfGoods;//�ܼ���
	//int kindOfGoods;//��Ʒ������
	public void setGoodsList(ArrayList<Goods> goodsList)
	{
		this.goodsList=goodsList;
	}
	public void compute()
	{
		for(int i=0;i<goodsList.size();i++)
		{
			//��ȡ�ܼ���
			numOfGoods += goodsList.get(i).getQuantity();
			//�����ܼ�
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
