package com.example.foundation;

public class Custom {
	private String id;
	private String name;
	public Custom() {
		// TODO Auto-generated constructor stub
	}
	public Custom(String id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
		return "Custom [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
