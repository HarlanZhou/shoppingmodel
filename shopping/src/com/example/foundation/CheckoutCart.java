package com.example.foundation;

import java.util.ArrayList;
import java.util.LinkedList;
//���ﳵ
public class CheckoutCart {
	LinkedList<Item> itemsList;//����----���ﵥ ���ڲ�����ɾ��
	//double totalPrice;//�ܼ�
	//int numOfGoods;//�ܼ���
	public LinkedList<Item> items= new LinkedList<Item>();
	public LinkedList<Item>getItems()
	{
		return items;
	}
	public void setItems(LinkedList<Item>items)
	{
		this.items=items;
	}
	public void addToCart(Item item)
	{
		items.add(item);
	}
	public double getTotalPrice()
	{
		return 0.0;
	}
}
