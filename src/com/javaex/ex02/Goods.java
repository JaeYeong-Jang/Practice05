package com.javaex.ex02;

public class Goods {

	//fields
	private String name;
	private int price;
	
	//constructors
	public Goods() {
		
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	//method g/s
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	//method normal
	public void showInfo() {
		System.out.println("상품명 : " + name + ", 가격 : " + price);
	}
	
}




