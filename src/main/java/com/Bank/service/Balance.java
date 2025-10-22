package com.Bank.service;

import java.util.Scanner;

public class Balance {
	
	static double bal=0;
	
	public void checkBalance() {
		System.out.println("Your bank balance is :"+bal);
	}
	
	public void depositMoney() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount that you to deposit");
		double d = sc.nextDouble();
		
		bal= d + bal;
		System.out.println(d+" rupees has been credited successfully");
	}
	
	public void withDrawMoney() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount that you want to withdraw money");
		double d= sc.nextDouble();
		
		if(d>bal) {
			System.out.println("You dont have sufficient balance");
		}
		else {
			bal = bal - d;
			System.out.println("Your account has been debited with rupees : " + d);
		}
	}
}
