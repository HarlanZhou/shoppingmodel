package com.example.test;

import java.util.ArrayList;

import com.example.foundation.CheckoutCart;
import com.example.foundation.Custom;
import com.example.foundation.Goods;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//设置顾客的基本信息
		Custom custom = new Custom();
		
		String id="username@gmail.com";
		String password="userpassword";
		String name="Jack";
		String phone="12345678901";
		String address="China";
		
		custom.setId(id);
		custom.setPassword(password);
		custom.setName(name);
		custom.setPhone(phone);
		custom.setAddress(address);
		custom.showInfo();
		
		
		//录入产品
		ArrayList<Goods> goodsMenu = new ArrayList<Goods>();
		Goods []goods=new Goods[8];
		//Goods goods = new Goods("Iphone8","1001",9999,1);
		goods[0].setGoodsId("10001");
		goods[0].setGoodsName("Iphone8");
		goods[0].setGoodsPrice(9999);
		goods[0].setQuantity(1);
		goodsMenu.add(goods[0]);
		System.out.println(goodsMenu);
		
		//goods.showInfo();
		
		
		
		
		
		//放入购物车
		//CheckoutCart checkoutCart = new CheckoutCart();
		//checkoutCart.setGoodsList(goods);
		
		
		
		//提交订单
		//购物的信息
		//顾客的信息
		
		
	}

}
