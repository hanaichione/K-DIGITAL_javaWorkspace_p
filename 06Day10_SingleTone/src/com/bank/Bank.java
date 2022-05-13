package com.bank;
public class Bank {
	private static Bank b= new Bank();  //2
	private  String name;
	private Bank() {} //1.
	
	public static Bank getBank() {
		return b;
	}  //3
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	
}
