package example;

import java.util.Scanner;

public class Bank {
	static Scanner sc= new Scanner (System.in);
	private String owner;
	private double balance;
	 
	
	public Bank(String owner , double balance){
		this.owner=owner;
		this.balance= balance;
	
	}
	public void withdraw() {
		System.out.println("enter amount to withdraw");
		double upadatedbalanace=this.balance-sc.nextDouble(); 
		System.out.println(upadatedbalanace);
	}
	public void deposit() {
		System.out.println("enter amount to diposit");
		double upadatedbalanace=this.balance+sc.nextDouble();
		System.out.println(upadatedbalanace);
	}
	public double getBalance(double balance) {
		return balance;
	}
	
}
