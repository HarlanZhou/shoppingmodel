package com.example.foundation;

public class Address {
	//收货人信息
	private String aid;
	private String name;
	private String address;
	private String phone;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String aid,String name,String address,String phone){
		this.aid=aid;
		this.name=name;
		this.address=address;
		this.phone=phone;
	}
	
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
}
