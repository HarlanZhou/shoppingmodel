package com.example.foundation;

public class Item {
	
	private Goods goods;//
	private int amount;
	public Item()
	{
		
	}
	public Item(Goods goods,int amount)
	{
		this.goods=goods;
		this.amount=amount;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Item [goods=" + goods + ", amount=" + amount + "]";
	}
	
}
