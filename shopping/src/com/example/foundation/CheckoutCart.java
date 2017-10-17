package com.example.foundation;

import java.util.ArrayList;
import java.util.LinkedList;
//购物车
public class CheckoutCart {
	LinkedList<Item> itemsList;//链表----购物单 便于插入与删除
	//double totalPrice;//总价
	//int numOfGoods;//总件数
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
