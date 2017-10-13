package com.example.foundation;

public class Custom {
	private String id;
	private String password;
	private String address;
	private String phone;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//顾客基本信息
	
	@Override
	public String toString() {
		return "Custom [address=" + address + ", phone=" + phone + ", name=" + name + "]";
	}
	
	public void showInfo()
	{
		System.out.println(toString());
	}
	
}
