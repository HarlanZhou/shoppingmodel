package com.example.test;

import java.sql.Timestamp;
import java.util.ArrayList;

import com.example.foundation.Address;
import com.example.foundation.CheckoutCart;
import com.example.foundation.Custom;
import com.example.foundation.Goods;
import com.example.foundation.Item;
import com.example.foundation.Order;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ù˿͵Ļ�����Ϣ
		Custom custom = new Custom("1001","�");
		Goods good1 = new Goods("����", "F10001", 5.2);
		Goods good2 = new Goods("�ǲ�˹��", "B10001", 50.9);
		Goods good3 = new Goods("Iphone", "E10001", 8888);
		Item item1 = new Item(good1, 1);
		Item item2= new  Item(good3,2);
		
		Address address1 = new Address("G10001", "����", "����", "13912345678");
		Address address2 = new Address("G10002", "����", "�й�", "13098765432");
		
		CheckoutCart checkoutCart = new CheckoutCart();
		checkoutCart.addToCart(item1);
		checkoutCart.addToCart(item2);
		
		Order order = new Order();
		order.setAddress(address1);
		order.setCheckoutCart(checkoutCart);
		order.setCustom(custom);
		order.setOrderId("20171059");
		order.setTime(new Timestamp(System.currentTimeMillis()));
		
		System.out.println(order);
		
		
	}

}
