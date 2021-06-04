package com.javaex.ex01;

public class Member {
	
	// fields
	private String id;
	private String name;
	private int point;
	
	// constructors
	public Member() {
		
	}
	
	//method g/s
	public void setId(String id) {
		this.id = id;
	}
	
	public String GetId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	public int getPoint() {
		return this.point;
	}
	
	//method normal
	public void showInfo() {
		System.out.println("회원정보 : " + name + '(' + id + "), " + point + '점');
	}
	
	
	
	
}
