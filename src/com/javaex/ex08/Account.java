package com.javaex.ex08;

public class Account {
	//fields
    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account(String B_A) {
    	System.out.println(B_A);	
    }
    //필요한 메소드 작성
    
    public void deposit(int deposit) {
    	this.balance = this.balance + deposit;
    }
    
    public void withdraw(int withdraw) {
    	this.balance = this.balance - withdraw;
    }
    
    public void showBalance() {
    	System.out.println(this.balance);
    }
}
