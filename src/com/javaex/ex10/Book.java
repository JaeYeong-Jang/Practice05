package com.javaex.ex10;

public class Book {
    //fields
    private int bookNo;
    private String title;
    private String author;
    private int stateCode;
    
    //constructors
    public Book() {
    	
    }
    public Book(int bookno, String title, String author) {
    	this(bookno, title, author, 1);
    }
    
    public Book(int bookNo, String title, String author, int stateCode) {
    	this.bookNo = bookNo;
    	this.title = title;
    	this.author = author;
    	this.stateCode = stateCode;
    }
    //method g/s
    public void setBookno(int bookno) {
    	this.bookNo = bookno;
    }
    
    public void setTitle(String title) {
    	this.title = title;
    }
    
    public void setAuthor(String author) {
    	this.author = author;
    }
    
    public int getBookno() {
    	return this.bookNo;
    }
    
    public String getTitle() {
    	return this.title;
    }
    
    public String getAuthor() {
    	return this.author;
    }
    
    //method normal
    public void rent(int booknum) {
    	this.stateCode = 0;
    	System.out.println(this.title + " (가) 대여 됐습니다.");
    }
    
    public void print() {
    	if(this.stateCode == 1) {
    		System.out.println(this.bookNo + "책 제목 : " + this.title + ", 작가 : " + this.author + ", 대여 유무 : 재고있음");
    	}else if(this.stateCode == 0){
    		System.out.println(this.bookNo + "책 제목 : " + this.title + ", 작가 : " + this.author + ", 대여 유무 : 대여중");
    	}
    }
}
